# Day 8: Multi-File Refactoring + Kotlin LSP

**Goal:** Use Kotlin LSP navigation and renaming across multiple files while keeping edits consistent.

### Tasks

1. Open `Main.kt` (`Cmd-P`).
   - Place the cursor on `finalTotal` and use the Command Palette (`Cmd-Shift-P`) to run `Go to Definition`.
   - From `Main.kt`, jump to `ReceiptFormatter.format` the same way.
2. In `Pricing.kt`, rename `calculateDiscount` to `computeDiscount` using LSP (`Cmd-Shift-P`, run `Rename Symbol`).
   - Verify the change in `OrderService.kt` and `Main.kt` with `Cmd-P`.
3. Rename `memberLevel` to `membershipTier` using LSP rename (`Cmd-Shift-P`, run `Rename Symbol`).
4. Use LSP references (`Cmd-Shift-P`, run `Find References`) on `OrderService` and note which files it touches.
5. Multi-file refactor: move `ReceiptFormatter.format` into `OrderService` as `formatReceipt`.
   - Update the call site in `Main.kt` to use `service.formatReceipt(order, total)`.
6. Re-open each file via `Cmd-P` and ensure names are consistent.

### Stretch

From any use of `LineItem`, run `Go to Definition` (`Cmd-Shift-P`) and then `Find References` to confirm every usage.

### Forbidden

- No mouse or trackpad
- No global search/replace; use LSP and targeted edits
