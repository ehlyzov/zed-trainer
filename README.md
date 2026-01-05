# Zed Keybinding Drills (Kotlin)

This repository provides a **two‑week drill program** designed to build fluency with Zed’s keybindings while working with Kotlin code.  It follows the same structure proposed in your earlier plan, but all exercises are tailored to Kotlin.  Use these drills to practise navigating, selecting, editing and refactoring code using only the keyboard.

## Daily routine

1. **Pick today’s drill** from the `drills` folder (e.g. `01-navigation`).
2. Open the `tasks.md` file and skim the goals and forbidden actions.
3. Start your timer (25–35 minutes) and work through the tasks using the provided Kotlin source files in the `src/` subfolder.
4. Avoid using the mouse or menus; rely on the command palette when you don’t know a shortcut.
5. After finishing, add a row to `progress/log.csv` with today’s metrics and update `progress/metrics.md` weekly.

## Repository structure

```
zed_repo/
├── README.md               # This file – overview and instructions
├── progress/
│   ├── log.csv            # Log your daily sessions
│   └── metrics.md         # Weekly summaries and reflections
├── drills/
│   ├── 00-setup/          # Quick sanity check
│   ├── 01-navigation/     # Cursor movement drills
│   ├── 02-selection/      # Selection mechanics
│   ├── 03-editing/        # Editing and structural changes
│   ├── 04-multicursor/    # Multi‑cursor practice
│   ├── 05-search-replace/ # Search and replace tasks
│   ├── 06-pane-workflow/  # Working with multiple panes
│   ├── 07-macros-registers/ # Macros, registers, repeat chains
│   ├── 08-multifile-refactor/ # Multi-file refactoring with LSP
│   └── 09-pane-keybindings/ # Zed pane keybinding practice
├── Helix-Cheatsheet.md    # Helix/Zed keybinding reference
└── templates/
    └── daily-entry.md     # Template for daily notes
```

## Logging progress

Fill in `progress/log.csv` after each session.  The columns are:

```
date,day,drill,minutes,mouse_touches,undo_count,commands_learned,notes
```

Example row:

```
2026-01-03,Day 1,01-navigation,30,0,3,5,"Had trouble remembering pane switch shortcut"
```

In `progress/metrics.md`, summarise your week by recording average session length, total mouse touches, the top pain points and one workflow improvement you plan to test next week.

## Templates

Use `templates/daily-entry.md` to jot down notes after each drill.  The template is optional but can help you reflect on what you learned and what still feels uncomfortable.

## Contributing

This repository is meant to be a personal practice space.  Feel free to modify tasks, add new drills or customise the keymap as you progress.  The first nine days discourage keymap changes; after that you are encouraged to adjust bindings that cause repeated friction.
