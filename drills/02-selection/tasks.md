# Day 2: Selection Mechanics

**Goal:** Practise selecting text at different granularities and manipulating selections without overshooting.

### Tasks

1. Open `messy_text.txt` in the `src` folder (`Cmd-P`).
   - Select a single word (`e` then `b`).
   - Expand the selection to the whole line (`x`).
   - Shrink the selection back to the original word (`;`, then `e` and `b`).
2. Open `NestedBlocks.kt` (`Cmd-P`).
   - Select the innermost block of code inside the first function (match mode: `m`, then `i{`).
   - Expand the selection to include the surrounding function block (match mode: `m`, then `a{`).
   - Expand once more to select the entire class (match mode on the class braces: `m`, then `a{`).
3. Cancel your selection without moving the cursor (`;`).
4. Select multiple adjacent lines and copy them, then paste them below (`x` or `2x`, `y`, `p`).

### Stretch

Perform all selection expansions and contractions smoothly without needing to read the menu or command palette.

### Forbidden

- No mouse or trackpad
- No free‑form dragging to select text
