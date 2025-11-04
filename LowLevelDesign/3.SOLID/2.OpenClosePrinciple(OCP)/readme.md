# Open/Closed Principle (OCP) Example

This section demonstrates the Open/Closed Principle using Java interfaces and implementations.

## Principle

Software entities should be open for extension but closed for modification.

## Example Structure

- `PaymentMethodOCP.java`: Interface defining the pay operation for payment methods.
- `CreditCardOCP.java`, `DebitCardOCP.java`, `BitcoinOCP.java`: Concrete classes each implement the interface for a specific payment method.
- `MainOCP.java`: Aggregates and uses various payment method implementations.

To support new payment types, simply add new classes implementing `PaymentMethodOCP`—no changes needed to existing classes.

Refer to the code files for implementation details.
