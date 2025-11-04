public class MultiPrinterISP implements PrintableISP, ScanableISP, FaxableISP {

    @Override
    public void fax() {
        System.err.println("Sending Fax");
    }

    @Override
    public void scan() {
        System.err.println("Scanning");
    }

    @Override
    public void print() {
        System.err.println("Printing");
    }
    
}
