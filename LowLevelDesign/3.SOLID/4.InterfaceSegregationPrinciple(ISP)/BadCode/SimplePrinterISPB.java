public class SimplePrinterISPB implements PrintableISPB {

    @Override
    public void print() {
        System.err.println("Printing");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("Scanning not supported!");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException("Sending Fax not supported!");
    }
    
}
