package vttp.d6;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;

//java -cp ./target/classes vttp.d6.IOMain "C:\Users\tan_x\JavaPrac\... path to zip"

public class IOMain {
    public static void main(String[] args) {
        System.out.println(args[0]);

        try {
            InputStream is = new FileInputStream(args[0]);
            ZipInputStream zis = new ZipInputStream(is);
            while(true) {
                ZipEntry zip = zis.getNextEntry();
                if (null != zip) {
                    System.out.printf("Filename: %s, size: %d\n", zip.getName(), zip.getSize());
                } else {
                    break;
                }
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (ZipException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
