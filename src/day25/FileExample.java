package day25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class FileExample {
    public static void main(String[] args) {
        try {
            //FileOutputStream fileOutput = new FileOutputStream("c:/java/test1.txt");
            FileInputStream fileInput = new FileInputStream("c:/java/test1.txt");
            byte[] bytes = new byte[10];
            //fileOutput.write("Hello java".getBytes());
            fileInput.read(bytes);
            System.out.println(new String(bytes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }


    }
}
