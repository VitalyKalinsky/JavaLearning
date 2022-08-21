<<<<<<< HEAD
<<<<<<< HEAD
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
    static String fileName = "src/projects/QuadraticEquation.java";

    public static void main(String[] args){
        String test = "src/projects/quadratic.txt";
        copyByNIO(fileName, test);
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

    public static void copyByNIO(String from, String to){
        try (RandomAccessFile fileFrom = new RandomAccessFile(from, "rw");
             RandomAccessFile fileTo = new RandomAccessFile(to, "rw");
             FileChannel inChannel = fileFrom.getChannel();
             FileChannel outChannel = fileTo.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate((int)fileFrom.length());
            int length = inChannel.read(buffer);
            if(length > 0) {
                buffer.flip();
                outChannel.write(buffer);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
=======
=======
>>>>>>> 9d83303b5bdd14d625525496820d5b6b4f0cf50a
package projects;

public class Test {
    public static void main(String[] args) {
        System.out.println(translateDecToBin(255));
    }

    public static String translateDecToBin(int dec){
        String binNum = "";
        while(dec != 0){
            binNum = dec % 2 + binNum;
            dec /= 2;
        }
        return binNum;
    }
}
<<<<<<< HEAD
>>>>>>> 9d83303b5bdd14d625525496820d5b6b4f0cf50a
=======
>>>>>>> 9d83303b5bdd14d625525496820d5b6b4f0cf50a
