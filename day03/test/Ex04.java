package day03.test;

import java.util.Calendar;

public class Ex04 {

  public static void main(String[] args) {
//    4. 프로그램 실행시 main 인자값으로 본인이 정보(이름, 전화번호, 주소,주민번호)를 입력받아 
//    이름, 전화번호, 주소, 나이를 출력하세요. 
    
    String name = args[0]; // 이름
    String num = args[1]; // 전화번호
    
    String adr = args[2]; // 주소

    String jumin = args[3]; // 주민번호
    
    int iage = Integer.parseInt(jumin.substring(0,2));
    iage += 1900;
    Calendar calendar = Calendar.getInstance();
    int currYear = calendar.get(Calendar.YEAR);
    int age = currYear - iage;

    System.out.println("이름: "+ name);
    System.out.println("전화번호: "+num);
    System.out.println("주소: "+adr);
    System.out.println("나이: "+ age);

  }

}
