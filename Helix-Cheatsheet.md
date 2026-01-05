# Helix Keybindings Cheatsheet (Zed Helix Mode)

This cheat sheet lists the default Helix keybindings (Helix 25.07.1) plus common Zed macOS shortcuts for non-Helix commands.

## Modes
- Normal mode: `Esc`
- Insert before/after: `i` / `a`
- Insert at line start/end: `I` / `A`
- Open line below/above: `o` / `O`
- Select mode: `v` (toggle)
- Command mode: `:`

## Movement and Selection
- Basic movement: `h` `j` `k` `l`
- Word motions: `w` `e` `b` (word) and `W` `E` `B` (WORD)
- Line selection: `x` (extend with `x` or `2x`), `X` (single line)
- Collapse selection: `;`
- Flip selection direction: `Alt-;`
- Find char: `f<char>` / `t<char>`; backward `F<char>` / `T<char>`
- Select word under cursor: `e` then `b`
- Select whole file: `%`

## Editing
- Delete selection: `d`
- Change selection: `c`
- Yank/copy: `y`
- Paste after/before: `p` / `P`
- Join lines: `J`
- Indent/outdent: `>` / `<`
- Replace selection with char: `r<char>`
- Replace selection with yanked text: `R`
- Undo/redo: `u` / `U`
- Repeat last insert: `.`
- Repeat last f/t selection: `Alt-.`
- Increment/decrement number: `Ctrl-a` / `Ctrl-x`
- Toggle comment: `Ctrl-c`
- Case: `~` (toggle), `backtick` (lower), `Alt-backtick` (upper)

## Search and Replace
- Search forward/backward: `/` / `?`
- Next/previous match: `n` / `N`
- Select matches in selection (regex): `s`
- Split selections by regex: `S`
- Align selections: `&`
- Split selection into lines: `Alt-s`

## Multiple Cursors / Selections
- Duplicate cursor to next suitable line: `C`
- Duplicate cursor to previous line: `Alt-C`
- Remove a selection: `,`
- Cycle primary selection: `)` / `(`
- Remove primary selection: `Alt-,`
- Cycle selection contents: `Alt-)` / `Alt-(`

## Match Mode (Surround/Matching)
- Enter match mode: `m`
- Jump to matching delimiter: `m` then `m`
- Select inside delimiters: `m` then `i` then `{` or `(` or `[` or `"`
- Select around delimiters: `m` then `a` then `{` or `(` or `[` or `"`
- Delete surrounding delimiters: `m` then `d` then `{` or `(` or `[` or `"`
- Add surrounding delimiters: `m` then `s` then `{` or `(` or `[` or `"`
- Replace surrounding delimiters: `m` then `r` then `{` or `(` or `[` or `"`

## Registers and Macros
- Select register: `"<char>` (use before `y`, `p`, or `R`)
- Record macro: `Q` (start/stop)
- Play macro: `q`

## Windows / Splits (Zed Helix Mode)
- Helix window commands (`Ctrl-w ...`) are not bound in Zed by default.
- Use the Command Palette (`Cmd-Shift-P`) and run split/focus commands such as `Split Right`, `Split Down`, `Focus Left/Right/Up/Down`, `Next Pane`, `Close Pane`, `Close Other Panes`.

## System Clipboard
- Yank to system clipboard: `Space y`
- Paste from system clipboard: `Space p`

## Zed (macOS) Global Shortcuts
- Command Palette: `Cmd-Shift-P`
- File Finder (Quick Open): `Cmd-P`
- Save: `Cmd-S`
- Go to Line: `Cmd-G`
- Find in File: `Cmd-F`
- Find in Files: `Cmd-Shift-F`
