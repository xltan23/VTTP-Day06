// Writes to the file

package vttp.d6;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;

//java -cp ./target/classes vttp.d6.WriterMain C:\User\tan_x\JavaPrac.....Note.txt

public class WriterMain {
    public static void main(String[] args) throws IOException {
        
        FileOutputStream fos = new FileOutputStream(args[0]);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeInt(2);
        oos.writeUTF("I cant tell you what it really is");
        oos.writeUTF("I can only tell you what it feels like");

        oos.flush();
        fos.close();
    }
    
}
