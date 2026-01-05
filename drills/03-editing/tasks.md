# Day 3: Editing and Structure

**Goal:** Practise editing operations such as duplicating, moving, deleting, joining and splitting lines without selecting text first.

### Tasks

1. Open `RefactorMe.kt` (`Cmd-P`).
   - Duplicate the function `computeSum` and rename it to `computeSumCopy` (select the block with `x` + `j`, `y`, `p`, then rename with `e`, `b`, `c`).
   - Move the duplicated function below the `computeProduct` function (select block, `d`, move, `p`).
   - Delete the commented `// unused` line (`x`, `d`).
2. Open `FormattingMe.kt` (`Cmd-P`).
   - Join the lines in the `greeting` string so that the entire sentence sits on one line (select lines with `3x`, then `J`).
   - Split the long declaration of `numbers` into three separate lines, one number per line (use `f,`, `a`, `Enter`, then repeat with `.`).
3. In both files, practise indenting and outdenting blocks using keyboard shortcuts only (`>` and `<`).
4. Toggle a line comment in either file (`Ctrl-c`).
5. Undo and redo at least one change (`u` and `U`).

### Stretch

Refactor the helper functions into a separate `Utils` object (no need to create a new file; just practise cutting and pasting without using the mouse).

### Forbidden

- No mouse or trackpad
- No selecting large regions manually — rely on line‑based operations
