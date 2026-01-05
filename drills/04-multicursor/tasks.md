# Day 4: Multi‑Cursor Practice

**Goal:** Learn to add cursors above and below, select next occurrences and perform simultaneous edits.

### Tasks

1. Open `RenameMe.kt` (`Cmd-P`).
   - Select all exact `tempValue` occurrences (`%`, then `s` and type `\btempValue\b`).
   - Rename all selections to `intermediate` (`c`).
   - Append a comment at the end of each affected line (`A`, type comment, `Esc`).
2. Open `Constants.kt` (`Cmd-P`).
   - Select all exact `PI_VALUE` occurrences (`%`, then `s` and type `\bPI_VALUE\b`).
   - Rename them to `PI` simultaneously (`c`).
3. Open `Scoreboard.kt` (`Cmd-P`).
   - Place the cursor on the first score number.
   - Duplicate the cursor to the next lines with `C` until all rows have cursors (use `Alt-C` once to practise adding above).
   - Append ` pts` to every row (`A`, type ` pts`, `Esc`).
   - Remove a single cursor with `,`, then bring it back with `C`.
   - Cycle the primary selection (`)` and `(`), then remove it (`Alt-,`).
   - Select all rows (`5x`), then use `s` with `\b\d+\b` to select all scores and increment them with `Ctrl-a`.

### Stretch

Use multi‑cursor editing to convert the list of numbers in `Constants.kt` into a list of strings (e.g. `1` → `"1"`) without leaving multi‑cursor mode (`x` to select the line, `s` with `\b\d+\b`, then `i"` and `a"`).

### Forbidden

- No mouse or trackpad
- Avoid the global search/replace command; practise manual multi‑cursor selection
