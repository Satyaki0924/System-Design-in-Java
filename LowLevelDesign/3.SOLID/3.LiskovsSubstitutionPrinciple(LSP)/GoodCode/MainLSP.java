public class MainLSP {
    public static void main(String[] args) {
        ReadableFileLSP readableFile = new ReadableFileLSP();
        readableFile.read();
        
        WritableFileLSP writableFile = new WritableFileLSP();
        writableFile.read();
        writableFile.write();
    }
}
