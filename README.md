# lumi_skills

An open-source collection of reusable AI skills and composable building blocks
for sharing across applications and agents.

## Status

![CI](https://github.com/zheli001/lumi_skills/actions/workflows/ci.yml/badge.svg)
![License](https://img.shields.io/badge/license-Apache--2.0-blue.svg)
![Java](https://img.shields.io/badge/Java-17-informational)
![Gradle](https://img.shields.io/badge/Build-Gradle-02303A?logo=gradle&logoColor=white)

## Features

- Java 17 application with a clean, minimal structure
- Gradle build system with the Gradle wrapper for reproducible builds
- JUnit 5 (Jupiter) test suite
- GitHub Actions CI workflow
- Apache-2.0 license with full open-source documentation
- AI usage policy and provenance watermark

## Project Structure

```
lumi_skills/
├── src/
│   ├── main/java/com/ruban/ai/skills/
│   │   └── Application.java
│   └── resources/
├── src/test/java/com/ruban/ai/skills/
│   └── ApplicationTest.java
├── docs/
│   └── architecture.md
├── .github/
│   ├── workflows/ci.yml
│   └── ISSUE_TEMPLATE/
├── build.gradle
├── settings.gradle
├── gradle.properties
├── gradlew / gradlew.bat
├── LICENSE
├── NOTICE
├── CONTRIBUTING.md
├── SECURITY.md
├── CODE_OF_CONDUCT.md
├── AI_USAGE_POLICY.md
└── PROVENANCE.md
```

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

Expected output:

```
lumi_skills started successfully.
```

## Contribution Guidelines

Please read [`CONTRIBUTING.md`](CONTRIBUTING.md) for the recommended workflow,
branch naming conventions, and coding guidelines.

## License

Copyright (c) 2026 zheli001.realgene.  
Licensed under the Apache License, Version 2.0. See [`LICENSE`](LICENSE) for details.

## AI Usage Policy

This repository may not be used to train machine learning or AI models without
explicit permission. See [`AI_USAGE_POLICY.md`](AI_USAGE_POLICY.md) for full details.
