# Architecture

## Overview

**lumi_skills** is a minimal Java 17 application structured as a single-module
Gradle project. Its purpose is to serve as a clean, professional open-source
foundation for sharing and reusing AI skills and composable building blocks.

## Technology Stack

| Layer         | Technology                  |
|---------------|-----------------------------|
| Language      | Java 17                     |
| Build tool    | Gradle 8 (with wrapper)     |
| Testing       | JUnit Jupiter (JUnit 5)     |
| CI            | GitHub Actions              |
| License       | Apache-2.0                  |

## Module Structure

```
lumi_skills/
├── src/
│   ├── main/
│   │   ├── java/com/ruban/ai/skills/
│   │   │   └── Application.java       # Main entry point
│   │   └── resources/                 # Application resources
│   └── test/
│       └── java/com/ruban/ai/skills/
│           └── ApplicationTest.java   # JUnit 5 tests
├── docs/
│   └── architecture.md                # This file
├── .github/
│   ├── workflows/ci.yml               # GitHub Actions CI
│   └── ISSUE_TEMPLATE/                # GitHub issue templates
└── build.gradle                       # Gradle build configuration
```

## Key Components

### `Application`

The `Application` class (`com.ruban.ai.skills.Application`) is the sole entry
point for the application. It is intentionally minimal and serves as the
extension point for future skill loading, CLI support, or agent integration.

### Build Configuration

The Gradle build (`build.gradle`) uses:

- **`java` plugin** for compilation and packaging
- **`application` plugin** for the `run` task
- **Java toolchain** pinned to version 17 to ensure reproducible builds
- **JUnit Jupiter** for the test framework

### CI Workflow

The GitHub Actions workflow (`.github/workflows/ci.yml`) runs on every push
and pull request to `main`. It:

1. Checks out the repository
2. Sets up Java 17 (Eclipse Temurin)
3. Caches Gradle dependencies
4. Runs `./gradlew build` (which includes compilation and tests)

## Future Extension Points

- Add a `skills/` directory for storing skill definitions (YAML, JSON, or Java)
- Introduce a `SkillLoader` interface for pluggable skill loading strategies
- Add REST or CLI adapter layers when needed
