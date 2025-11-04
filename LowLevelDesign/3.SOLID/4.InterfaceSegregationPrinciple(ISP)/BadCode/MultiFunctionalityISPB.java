public class MultiFunctionalityISPB implements PrintableISPB {

    @Override
    public void print() {
        System.err.println("Printing");
    }

    @Override
    public void scan() {
         System.err.println("Scanning");
    }

    @Override
    public void fax() {
        System.err.println("Sending Fax");
    }
    
}
