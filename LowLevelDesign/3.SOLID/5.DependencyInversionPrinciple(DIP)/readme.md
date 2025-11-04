# Dependency Inversion Principle (DIP) Example

This section demonstrates the Dependency Inversion Principle using Java interfaces and notification services.

## Principle

High-level modules should not depend on low-level modules. Both should depend on abstractions, and abstractions should not depend on details.

## Example Structure

- `NotificationDIP.java`: Interface for notification abstraction.
- `EmailServiceDIP.java`, `SMSServiceDIP.java`, `WhatsAppServiceDIP.java`: Concrete classes that implement different notification mechanisms.
- `NotificationServiceDIP.java`: High-level service that depends only on the notification abstraction.
- `MainDIP.java`: Demonstrates use of different notification types via the abstraction.

Refer to the code files for implementation details.
