# Day 5: Search & Replace

**Goal:** Use search to navigate and carefully replace text, focusing on accuracy over speed.

### Tasks

1. Open `Occurrences.kt` (`Cmd-P`).
   - Search for the string `PLACEHOLDER` and count how many matches there are (`/PLACEHOLDER`, `n` and `N`).
   - Replace the **second** occurrence only with `REPLACED` (`/PLACEHOLDER`, `n`, `c`).
   - Undo the change and then replace **all** occurrences of `PLACEHOLDER` with `value` (`u`, `%`, `s`, `\bPLACEHOLDER\b`, `c`).
2. Perform an in‑file search for the number `42` and navigate to each occurrence (`/42`, `n` and `N`).
3. Use search in the Command Palette to find the action for “Find in Files” and note its keybinding (`Cmd-Shift-P`, then `Cmd-Shift-F`).

### Stretch

Use a regular expression search to find all numeric literals and wrap them in parentheses (e.g. `5` → `(5)`) (`/\b\d+\b`, `n`, `c`). Perform replacements one at a time to avoid unintended matches.

### Forbidden

- No mouse or trackpad
- Do not rely solely on global replace; practise confirmation for each replacement
