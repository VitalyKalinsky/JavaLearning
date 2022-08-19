package projects;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Test {
    static String fileName = "src/projects/test.txt";

    public static void main(String[] args) throws IOException {
        copyByNIO(fileName, "src/projects/test2.txt");
    }

    public static void copyByIO(String from, String to) {
        int ch;
        try (FileInputStream fileFrom = new FileInputStream(from);
                FileOutputStream fileTo = new FileOutputStream(to)) {
            while ((ch = fileFrom.read()) != -1)
                fileTo.write((char) ch);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyByNIO(String from, String to) throws IOException{
        RandomAccessFile file = new RandomAccessFile(from, "r");
        FileChannel channel = file.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        int length = channel.read(buffer);
        
        while(length > 0){
            buffer.flip();
            while(buffer.hasRemaining()){
                channel.write(buffer);
            }
        }
        
    }
}