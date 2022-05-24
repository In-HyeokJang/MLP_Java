package day08;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileDirDemo1 {

  public static void main(String[] args) {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("디레토리 명을 입력해 주세요"); //javatest안에서 찾아옴
    String directory = "";
    
    try {
      directory = in.readLine();
      
      //System.out.println(directory);
    }catch (IOException e) {
      e.printStackTrace();
    }
    
    File f1 = new File(directory);
    
    if(f1.isDirectory()) {
      System.err.println("검색 디렉토리 "+directory);
      System.out.println("---------------------");
      String s[] =f1.list();// 디렉토리안에 있는 파일/디렉토리 목록
      
      for(int i=0; i<s.length; i++) {
        File f = new File(directory + "/"+s[i]);
        
        if(f.isDirectory()) { //디렉토리면
          System.out.println(s[i]+": 디렉토리");
        }else { //파일이면
          System.out.println(s[i]+": 파일");
        }// if end
      }// for end
    }else {
      System.out.println("지정한"+directory+"는 디렉토리가 아님");
    }
  }
}
