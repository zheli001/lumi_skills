# Copilot Repository Generator

This document instructs GitHub Copilot to generate a complete open source repository.

Copilot must follow the instructions step by step.

The goal is to create a minimal but professional Java open source project.

The repository must compile successfully.

# Project Questionnaire

Before generating the repository, ask and confirm the following.

PROJECT_NAME:lumi_skills
PROJECT_DESCRIPTION: AI skills 分享
BASE_PACKAGE:com.ruban.ai.skills
ORGANIZATION: zheli001.realgene
MAINTAINER_NAME: Jeff Li
MAINTAINER_EMAIL:li_jeff@yahoo.com

LICENSE_TYPE: Apache-2.0
JAVA_VERSION: 17

CLI_SUPPORT: false
REST_API: false
LIBRARY_PROJECT: false

Project description could be expanded accordingly

---

# 1 Placeholder Definitions

Before generating the repository, Copilot must resolve the following placeholders.

PROJECT_NAME = {{project_name}}

PROJECT_DESCRIPTION = {{project_description}}

BASE_PACKAGE = {{base_package}}

ORGANIZATION = {{organization}}

MAINTAINER_NAME = {{maintainer_name}}

MAINTAINER_EMAIL = {{maintainer_email}}

YEAR = {{year}}

Example placeholder resolution:

PROJECT_NAME = sample-java-project  
BASE_PACKAGE = org.sample.project

BASE_PACKAGE_PATH is derived from BASE_PACKAGE by replacing dots with slashes.

Example:

org.sample.project → org/sample/project

---

# 2 Repository Goal

Generate a minimal open source Java project with:

Java 17  
Gradle build system  
Open source documentation  
CI workflow  
AI usage restriction policy  
Repository provenance watermark

---

# 3 Generation Steps

Copilot must follow these steps in order.

Step 1

Create the repository root structure.

Step 2

Generate Gradle build files.

Step 3

Generate Java source code.

Step 4

Generate documentation files.

Step 5

Generate GitHub workflows.

Step 6

Validate build configuration.

---

# 4 Repository Structure

Generate the following directory tree.

{{PROJECT_NAME}}/

README.md  
LICENSE  
NOTICE  

AI_USAGE_POLICY.md  
PROVENANCE.md  
.ai-policy.yaml  

CONTRIBUTING.md  
SECURITY.md  
CODE_OF_CONDUCT.md  

.gitignore  

settings.gradle  
build.gradle  
gradle.properties  

gradlew  
gradlew.bat  

gradle/
wrapper/

src/
main/
java/
{{BASE_PACKAGE_PATH}}/
Application.java

resources/

test/
java/
{{BASE_PACKAGE_PATH}}/
ApplicationTest.java

docs/
architecture.md

.github/
workflows/
ci.yml

.github/
ISSUE_TEMPLATE/
bug_report.md
feature_request.md

PULL_REQUEST_TEMPLATE.md

---

# 5 Gradle Configuration

Copilot must generate a working Gradle project.

Requirements:

Java toolchain version 17

Plugins:

java  
application

Main class:

{{BASE_PACKAGE}}.Application

Dependencies:

JUnit Jupiter

Build command:

./gradlew build

Run command:

./gradlew run

---

# 6 Application Source Code

Create file:

src/main/java/{{BASE_PACKAGE_PATH}}/Application.java

Requirements:

Provide a main method.

Example output:

{{PROJECT_NAME}} started successfully.

Include Javadoc comments.

Add source code header with license and AI policy reference.

---

# 7 Test Code

Create file:

src/test/java/{{BASE_PACKAGE_PATH}}/ApplicationTest.java

Requirements:

Use JUnit 5.

Test must verify the application class loads correctly.

---

# 8 README

Generate README.md.

Sections required:

Project title

Project description

Features

Project structure

Build instructions

Run instructions

Contribution guidelines

License

AI usage policy

---

# 9 License

Generate Apache License 2.0.

Copyright:

Copyright (c) {{YEAR}} {{ORGANIZATION}}

---

# 10 NOTICE File

Create NOTICE file.

Example:

This project is maintained by {{ORGANIZATION}}.

Use of this repository must comply with the Apache License 2.0.

Automated dataset extraction for AI training is restricted.

---

# 11 AI Usage Policy

Create file:

AI_USAGE_POLICY.md

Content must state:

This repository may not be used to train machine learning or AI models without explicit permission.

Contact:

{{MAINTAINER_EMAIL}}

---

# 12 Provenance Watermark

Create PROVENANCE.md.

Contents must include:

Project name

Maintainer organization

Original author

Repository watermark identifier.

Example:

repo-origin: {{PROJECT_NAME}}  
maintainer: {{ORGANIZATION}}

---

# 13 Machine Readable AI Policy

Create file:

.ai-policy.yaml

Content:

ai_training:
  allowed: false

dataset_usage:
  allowed: false

contact: {{MAINTAINER_EMAIL}}

---

# 14 Security Policy

Create SECURITY.md.

Include vulnerability reporting instructions.

Contact:

{{MAINTAINER_EMAIL}}

---

# 15 Contributing Guide

Create CONTRIBUTING.md.

Include:

How to fork

Branch naming

Pull request process

Coding guidelines.

---

# 16 Code of Conduct

Create CODE_OF_CONDUCT.md using Contributor Covenant.

---

# 17 GitHub CI

Create workflow:

.github/workflows/ci.yml

Steps:

checkout repository

setup Java 17

cache Gradle dependencies

run:

./gradlew build

run tests.

---

# 18 Issue Templates

Create two templates.

bug_report.md

feature_request.md

---

# 19 Pull Request Template

Create PULL_REQUEST_TEMPLATE.md.

Include sections:

Description

Type of change

Testing

Checklist.

---

# 20 Source Code Header

All Java files must include header:

Copyright (c) {{YEAR}} {{ORGANIZATION}}

Licensed under Apache License 2.0.

AI training usage restricted according to AI_USAGE_POLICY.md.

---

# 21 Build Validation

Copilot must ensure the repository builds successfully.

Required commands:

./gradlew build

./gradlew run

./gradlew test

All commands must succeed.

---

# End of Copilot Repository Generator
