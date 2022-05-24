package day03.code;

import java.util.Scanner;

public class ScannerDemo {

  public static void main(String[] args) {
    String s = "Hello World! 3+3.0=6";
    
    Scanner scanner = new Scanner(s);
    
    System.out.println(scanner.hasNext());//입력 받을 값이 있어서 true 나옴
    
    System.out.println(scanner.next()); // Hello 출력 // space 하면 출려 안됨
    //System.out.println(scanner.nextLine()); // 한줄 다 출력 됨 , 엔터 누르기 전까지 출력
    System.out.println(scanner.hasNext());
    
    scanner.close();

  }

}
