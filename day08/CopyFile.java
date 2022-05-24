package day08;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class CopyFile {

  public static void main(String[] args) {
    // 메인의 매개변수를 이용해서 원본파일 대상파일 확인
    
    //파라미터를 2개를 받았는지 검사 
   if (args.length != 2) { 
       System.out.println ("---------------- 에러 발생 ----------------"); 
       System.out.println ("usage: java CopyFile <원본파일명> <대상파일명>"); 
       
       System.exit(1); // 프로그램 종료
   }
   //파일 객체 생성
   File inputFile = new File(args[0]);//소스파일명
   File outputFile =new File(args[1]);//생성될 파일명
   
   try {
     FileReader in = new FileReader(inputFile);// FileReader는 데이터를 읽어오는 역활을 합니다. 
     FileWriter out = new FileWriter(outputFile);
     
     int c;//변수 생성
     
     while((c=in.read())!=-1) {
       out.write(c);
     }
     
     System.out.println("파일 복사가 완료 되었다");
     
     // Reader,Writer 닫아주기
     in.close();
     out.close();
     
  } catch (Exception e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  } // FileWriter는 쓰는 역활을 합니다. 
   
   
   
   
  }
}
