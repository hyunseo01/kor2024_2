package day25;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileExample3 {
    public static void main(String[] args) {
        try {
            //FileOutputStream fileOutput = new FileOutputStream("c:/java/test1.txt");
            FileOutputStream fileOutput = new FileOutputStream("c:/java/test2.txt");
            FileInputStream fileInput = new FileInputStream("c:/java/test2.txt");
            //byte[] bytes = new byte[1000];
            Scanner scan = new Scanner(System.in);
            System.out.print("파일 내용 입력 : "); String file1 = scan.next();
            fileOutput.write(file1.getBytes());

            File file = new File("c:/java/test2.txt");
            System.out.println(file.isFile());
            System.out.println(file.getName());
            System.out.println(file.length());
            byte[] bytes = new byte[(int)file.length()];

            fileInput.read(bytes);
            String instr = new String(bytes);
            System.out.println(instr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }


    }
}
