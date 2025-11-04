public class WritableFileLSP extends ReadableFileLSP implements WritableLSP {

    @Override
    public void write() {
        System.err.println("Writing File");
    }
    
}
