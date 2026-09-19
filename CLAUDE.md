# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## What this repo is

A companion codebase for a book club working through *Effective Java*. Each chapter/item gets a
package under `dev.matheuscruz.itemNN` with small, focused classes that illustrate one specific rule
or contract violation from the book — not a real application. `sessions/` holds dated Markdown notes
(in Portuguese) summarizing the book club discussion for each session; these are the source of intent
behind the code, since the code alone is often deliberately minimal or broken to demonstrate a pitfall.

## Build & test

Maven project targeting Java 25 (`maven.compiler.release=25`), using JUnit 5 (5.11.0 BOM).

```bash
mvn compile                 # compile main sources
mvn test                    # run all tests
mvn test -Dtest=ColorPointTest              # run a single test class
mvn test -Dtest=ColorPointTest#someMethod   # run a single test method
```

`.mvn/maven.config` and `.mvn/jvm.config` exist but are currently empty.

## Architecture / conventions

- **Package-per-item layout**: `src/main/java/dev/matheuscruz/itemNN/...` mirrors an *Effective Java*
  item number. Sub-packages under an item (e.g. `item10/reflexidade`, `item10/simetria`,
  `item10/transitividade`) each isolate one property of the `equals` contract (reflexivity, symmetry,
  transitivity) being demonstrated. When adding material for a new item, follow this same
  `itemNN/<concept>/` nesting rather than flattening classes into one package.
- **Classes intentionally demonstrate violations, not production patterns.** For example
  `CaseInsensitiveViolation` breaks symmetry on purpose by comparing against `String`, and
  `MinhaThread.equals` always returns `true` to show why overriding `equals` on `Thread` is a bad
  idea. Don't "fix" these classes unless the task is specifically about fixing them — the bug *is*
  the content.
- Some classes (e.g. `ColorPoint`) contain commented-out alternative implementations (labeled A./B.)
  left in place to compare tradeoffs discussed in the book club — treat these as illustrative content,
  not dead code to clean up, unless asked.
- `App.java` uses an unnamed top-level `void main(String[] args)` (Java's implicit-class/instance-main
  feature), consistent with the Java 25 compiler target — it's currently an empty entry point, not the
  real focus of the repo.
- There is no shared library/framework code here — each item's classes are self-contained and only
  depend on the JDK and JUnit.
