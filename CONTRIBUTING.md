# Contributing to lumi_skills

Thank you for your interest in contributing! We welcome contributions of all kinds.

## How to Contribute

### 1. Fork the Repository

Click **Fork** on GitHub to create your own copy of this repository.

### 2. Clone Your Fork

```bash
git clone https://github.com/<your-username>/lumi_skills.git
cd lumi_skills
```

### 3. Branch Naming

Use descriptive branch names following this convention:

| Type        | Pattern                  | Example                     |
|-------------|--------------------------|-----------------------------|
| Feature     | `feature/<short-name>`   | `feature/add-skill-parser`  |
| Bug fix     | `fix/<short-name>`       | `fix/null-pointer-in-main`  |
| Docs        | `docs/<short-name>`      | `docs/update-readme`        |
| Refactor    | `refactor/<short-name>`  | `refactor/simplify-loader`  |

### 4. Make Your Changes

- Keep changes focused and minimal.
- Write or update tests for any modified behavior.
- Ensure `./gradlew build` passes locally before submitting.

### 5. Pull Request Process

1. Push your branch to your fork.
2. Open a pull request against `main` in `zheli001/lumi_skills`.
3. Fill out the pull request template completely.
4. Wait for CI to pass and for a maintainer review.
5. Address any requested changes promptly.

## Coding Guidelines

- Use Java 17 features and idioms where appropriate.
- Follow standard Java naming conventions.
- Add Javadoc to all public classes and methods.
- Include the license header in all new Java files (see existing files for the template).
- Keep dependencies minimal; prefer the Java standard library.

## Code of Conduct

Please read and follow our [Code of Conduct](CODE_OF_CONDUCT.md).

## Questions

If you have questions, open a [GitHub Discussion](https://github.com/zheli001/lumi_skills/discussions)
or contact the maintainer at li_jeff@yahoo.com.
