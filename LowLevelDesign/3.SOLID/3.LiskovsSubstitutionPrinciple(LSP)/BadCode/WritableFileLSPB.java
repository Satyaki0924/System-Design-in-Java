public class WritableFileLSPB implements FileLSPB {

    @Override
    public void read() {
       System.err.println("Reading File");
    }

    @Override
    public void write() {
        System.err.println("Writing File");
    }
    
}
