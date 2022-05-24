package day08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterDemo {

  public static void main(String[] args) {
    String source = "JAVA\n" 
        + "JSP\n" 
        + "EJB\n" 
        + "OJT\n"     
        + "가나다\n"; 
    String fname =""; // 지역변수
  
    System.out.println("저장할 파일명을 입력하세요: ");
    BufferedReader in = 
        new BufferedReader(new InputStreamReader(System.in));// 객체 생성
    
    try {
      fname =in.readLine();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    try {
      //파일 쓰기 객체 생성
      FileWriter fw = new FileWriter(fname);
      fw.write(source);
      fw.close();//닫음
      System.out.println("파일저장했다");
      
      FileReader fr = new FileReader(fname);
      int i;
      System.out.println("파일 읽었다");
      while((i = fr.read()) != -1) {
        System.out.print("("+i+")");
        System.out.print((char)i);
        
      }
      fr.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }// 객체생성
  }
}
