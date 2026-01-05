# Repository Guidelines

## Project Structure & Module Organization
- `drills/NN-name/` holds each daily drill. Every drill includes `tasks.md` plus a `src/` folder with Kotlin practice files.
- `progress/` stores personal tracking: `log.csv` for daily entries and `metrics.md` for weekly summaries.
- `templates/` contains reusable notes like `templates/daily-entry.md`.
- `README.md` is the primary orientation document.

Example drill layout:
```
drills/01-navigation/
├── tasks.md
└── src/
    ├── ApiClient.kt
    └── LongFile.kt
```

## Build, Test, and Development Commands
There is no build or test system in this repo. The workflow is file-based:
- Open the workspace in your editor (e.g. `zed .`) and work through `drills/*/tasks.md`.
- Edit only the Kotlin files inside the drill’s `src/` folder while practicing.

## Coding Style & Naming Conventions
- Kotlin files use 4-space indentation; keep formatting readable and consistent with existing files.
- File names are `PascalCase.kt` (e.g. `ApiClient.kt`), and package names follow `drills.<topic>`.
- Drill folders follow `NN-name` numbering (e.g. `03-editing`); keep new drills consistent.
- Markdown files use short paragraphs, simple lists, and direct instructions.

## Testing Guidelines
- No automated tests or coverage requirements are defined.
- Validation is manual: complete the tasks and ensure files remain syntactically valid Kotlin.

## Commit & Pull Request Guidelines
- Commit messages are short and imperative, without prefixes (e.g. `Add Kotlin keybinding drills README`).
- Keep commits focused on a single drill or docs update.
- In PRs, include a brief summary, list the drill(s) touched, and note any new/changed tasks.
- Avoid committing personal progress logs unless the change is explicitly intended for sharing.
