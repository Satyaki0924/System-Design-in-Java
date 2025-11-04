public class MainISP {
    public static void main(String[] args) {
        PrintableISP printer = new MultiPrinterISP();
        printer.print();

        ScanableISP scanner = new MultiPrinterISP();
        scanner.scan();
    }
}
