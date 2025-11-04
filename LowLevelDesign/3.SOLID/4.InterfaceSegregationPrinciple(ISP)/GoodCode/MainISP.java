public class MainISP {
    public static void main(String[] args) {
        PrintableISP printer = new MultiPrinterISP();
        printer.print();

        ScannableISP scanner = new MultiPrinterISP();
        scanner.scan();
    }
}
