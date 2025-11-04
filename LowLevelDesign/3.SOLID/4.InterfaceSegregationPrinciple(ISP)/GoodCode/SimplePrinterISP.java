public class SimplePrinterISP implements PrintableISP {

    @Override
    public void print() {
        System.err.println("Printing");
    }
    
}
