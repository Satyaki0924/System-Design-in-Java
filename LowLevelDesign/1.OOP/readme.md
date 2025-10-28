# OOP Principles in Payment System

This mini-payment system provides interview-ready examples of core Object-Oriented Programming principles:

- **Abstraction:** Via the `Card` abstract class and `PaymentMethod` interface, implementation details are hidden while exposing essential behaviors for all payment types.
- **Encapsulation:** Private fields ensure data integrity, accessed only through public getters, safeguarding against unintended modification.
- **Inheritance:** `CreditCard` and `DebitCard` reuse logic from `Card`, demonstrating class specialization and reducing redundancy.
- **Polymorphism:** `PaymentService` can invoke `pay()` and transaction modes on any payment method, showcasing runtime flexibility and method overriding.
- **Composition:** Supports multiple payment methods using a `HashMap`, ensuring extendability as more payment types are added.

These files offer a foundation for understanding and discussing OOP in technical interviews.
