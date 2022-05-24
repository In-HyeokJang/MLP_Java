package day08;

import java.util.Scanner;

public class Ex10_07 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str1, str2, str3;
    
    System.out.print("단어 3개를 입력해 주세요");
    str1 = sc.next();
    str2 = sc.next();
    str3 = sc.next();
    
    System.out.print("업련된 문자열 ==>");
    System.out.println(str1 +"," +str2 +","+ str3);
    
    sc.close();
  }
}
