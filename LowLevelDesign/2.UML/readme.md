# UML Principles (Java OOP Relationships)

## Association
- **Definition:** Represents a generic relationship where one class references another.
- **Example:** A `Student` takes a `Course`.
- **UML Notation:** Plain line (`────────`).

## Aggregation
- **Definition:** A special association signifying a "whole-part" relationship. The part can exist independently of the whole.
- **Example:** A `Library` contains many `Book` objects (`Book` can exist without the `Library`).
- **UML Notation:** Line with an empty diamond at the “whole” end (`◇────────`).

## Composition
- **Definition:** Stronger form of aggregation; the part cannot exist without the whole.
- **Example:** A `Hotel` contains `Room`s. If the `Hotel` is deleted, so are its `Room`s.
- **UML Notation:** Line with a filled diamond at the “whole” end (`◆────────`).

## Inheritance
- **Definition:** Describes a "is-a" relationship where a subclass inherits from a superclass.
- **Example:** `Dog` and `Bird` extends `Animal`.
- **UML Notation:** Solid line with a hollow triangle pointing to the superclass (`────────▷`).

## Dependency
- **Definition:** A class uses another class, typically as a local variable or parameter.
- **Example:** The `Order` class is dependent of `PaymentGateway`.
- **UML Notation:** Dotted line with an arrow (`- - - ->`).

## Realization
- **Definition:** A class implements an interface.
- **Example:** `Car` implements `Drivable`.
- **UML Notation:** Dotted line with a hollow triangle pointing at the interface (`- - - - - - ▷`).

---

Use these explanations to document relationships in your Java code and diagrams for better clarity and correctness.
