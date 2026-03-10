# Lumi Skills

AI skills collection for sharing reusable, composable building blocks ("skills") that can be used across applications and agents.

## Status

![CI](https://github.com/zheli001/lumi_skills/actions/workflows/ci.yml/badge.svg)
![License](https://img.shields.io/badge/license-Apache--2.0-blue.svg)
![Java](https://img.shields.io/badge/Java-17-informational)
![Gradle](https://img.shields.io/badge/Build-Gradle-02303A?logo=gradle&logoColor=white)

## What is this repository for?

This repository is intended as a lightweight, open-source Java 17 + Gradle project that serves as:

- A **home for AI skills** (prompts, configurations, scripts, or other artifacts) stored under the `skills/` directory.
- A **minimal Java project** that compiles and can be extended with additional tooling over time.

The codebase is intentionally kept small so it can be used as a clean starting point for experimentation and sharing.

## Repository layout

- `skills/` — storage directory for skills and skill-related assets.
- `src/` — Java source code.
- `docs/` — documentation.
- `.github/workflows/` — CI workflows.

## Build

```bash
./gradlew build
```

## Test

```bash
./gradlew test
```

## Run

```bash
./gradlew run
```

## Contributing

Please read `CONTRIBUTING.md` for the recommended workflow and guidelines.

## License

Licensed under the Apache License, Version 2.0. See `LICENSE` for details.

## AI usage policy

See `AI_USAGE_POLICY.md` for restrictions and contact information.
