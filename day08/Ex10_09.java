package day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex10_09 {

  public static void main(String[] args) throws IOException {
    //객체 생성
    FileInputStream fis = new FileInputStream("C:/Aistudy_JIH/java/dat1.txt");
  
    int ch;
    while((ch=fis.read()) != -1)
      System.out.print((char)ch);
    
    fis.close();
  }
  
}
