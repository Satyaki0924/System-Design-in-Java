public class ReadableFileLSPB implements FileLSPB {

    @Override
    public void write() {
        throw new UnsupportedOperationException("Write operation not supported!");
    }

    @Override
    public void read() {
        System.err.println("Reading File");
    }
}
