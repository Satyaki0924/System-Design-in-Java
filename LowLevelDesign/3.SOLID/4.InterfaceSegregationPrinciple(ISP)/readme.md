# Interface Segregation Principle (ISP) Example

This section demonstrates the Interface Segregation Principle using Java interfaces and printer types.

## Principle

Clients should not be forced to depend on methods they do not use. Split larger interfaces into more specific and functional ones.

## Example Structure

- `PrintableISP.java`: Interface for print capability.
- `ScanableISP.java`: Interface for scan capability.
- `FaxableISP.java`: Interface for fax capability.
- `MultiPrinterISP.java`: Implements all three interfaces, providing print, scan, and fax features.
- `SimplePrinterISP.java`: Implements only the print interface, for printers with limited functionality.
- `MainISP.java`: Demonstrates usage of interfaces according to the printer's capabilities.

Refer to the code files for implementation details.
