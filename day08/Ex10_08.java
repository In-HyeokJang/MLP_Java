package day08;

import java.io.IOException;

public class Ex10_08 {

  public static void main(String[] args) {
    String userName ="java"; //지역변수
    String input = "";
    int key;
    
    try {
      System.out.println("name ==> ");
      while ((key=System.in.read())!=13) {// 13=Enter // 문자 하나 하나 씩 읽는다
        System.out.print(key+": 아스키코드 ");
        input/*<=문자열*/+=Character.toString((char)key);
        
      }
      if(userName.equals(input)) {
        System.out.println(input+ "의 아스키코드 나옴");
      }else {
        System.out.println(input+"의 아스키코드 나옴");
      }
      
      //System.out.println(input);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
