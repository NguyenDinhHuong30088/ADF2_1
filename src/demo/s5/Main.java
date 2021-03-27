package demo.s5;

import java.io.*;


public class Main {
    public static void main(String[] arge) {
        try {
            //write file
            FileOutputStream sos = new FileOutputStream("data.bin");
            DataOutputStream dos = new DataOutputStream(sos);
            dos.writeBytes("Heloo");
            dos.writeBytes("Xin chao");
            //read file
            FileInputStream fis = new FileInputStream("data.bin");
            DataInputStream dis = new DataInputStream(fis);
            String txt = "";
            while (txt != null){
                System.out.println(txt);
                txt = dis.readLine();
            }

        }catch (FileNotFoundException f){
            System.out.println("File not found");
        }catch (IOException io){
            System.out.println("File orror");
        }
    }
}
