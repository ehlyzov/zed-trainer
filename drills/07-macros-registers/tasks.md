# Day 7: Macros, Registers, and Repeat Chains

**Goal:** Automate repetitive edits using registers, macros, and repeat commands.

### Tasks

1. Open `MacroPractice.kt` (`Cmd-P`).
   - In `rawTags`, append `_tag` to each entry using a repeat chain (`a_tag`, `Esc`, `j`, `.`).
   - Use `f_` to select to the underscore you just added, move to the next line, then repeat that selection twice with `Alt-.`.
2. In `fruits`, yank values into registers (`"a y` for `apple`, `"b y` for `banana`, `"c y` for `cherry`).
3. In `placeholders`, replace each placeholder using the register replacements (`e`, `b`, then `"a R`, `"b R`, `"c R`).
4. In `people`, record a macro to convert each `name,score` line to `Person("name", score)` (`Q` to start/stop recording, `q` to replay).
5. Add trailing commas to each `Person(...)` line using repeat (`A,`, `Esc`, `j`, `.`).

### Stretch

Record a second macro to a named register (`"b Q`) and replay it (`"b q`).

### Forbidden

- No mouse or trackpad
- No global search/replace; rely on macros and registers
