package day03.test;

import java.util.Calendar;
import java.util.Scanner;

public class Ex11 {

  public static void main(String[] args) {
//    11. Scanner객체를 이용하여 나의정보(이름, 주소, 생일)를 
//    입력받아서 정보(이름,주소,나이)를 출력하는 class를 작성하세요
    Scanner sc =new Scanner(System.in);
    System.out.print("이름: ");
    String name = sc.next();
    System.out.print("주소: ");
    String adr = sc.next();
    System.out.print("생일: ");
    String bir = sc.next();
    
    int iage = Integer.parseInt(bir.substring(0,2));
    iage += 1900;
    Calendar calendar = Calendar.getInstance();
    int currYear = calendar.get(Calendar.YEAR);
    
    int age = currYear - iage;
    System.out.println(" ");
    System.out.println("이름: "+name);
    System.out.println("주소: "+adr);
    System.out.println("나이: " +age);
    
  }

}
