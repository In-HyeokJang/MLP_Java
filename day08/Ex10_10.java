package day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex10_10 {

  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("C:/Aistudy_JIH/java/dat1.txt");

    int ch;
    byte[] bt=new byte[1024];
    int i=0;
    while((ch =fis.read())!= -1) {
      bt[i]=(byte)ch;
      i++;
    }
    System.out.println(new String(bt));
    fis.close();
  }
}
