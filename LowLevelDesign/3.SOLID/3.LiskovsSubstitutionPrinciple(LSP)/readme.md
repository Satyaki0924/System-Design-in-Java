# Liskov Substitution Principle (LSP) Example

This section demonstrates the Liskov Substitution Principle using Java interfaces and inheritance.

## Principle

Subtypes must be substitutable for their base types; functionality should remain correct when a base type variable is replaced with a derived type instance.

## Example Structure

- `ReadableLSP.java`: Interface defining the read operation.
- `ReadableFileLSP.java`: Implements reading from a file.
- `WritableLSP.java`: Interface defining the write operation.
- `WritableFileLSP.java`: Extends readable functionality and adds writing capability.

Both readable and writable files behave appropriately when used through interface or base type references.

Refer to the code files for implementation details.
