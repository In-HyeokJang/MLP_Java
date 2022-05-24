package day09.code;

import java.util.Hashtable;
import java.util.Scanner;

public class HashTableExample {
  
  public static void main(String[] args) {
    Hashtable ht = new Hashtable();
    Scanner sc = new Scanner(System.in);
    
    System.out.println("공백으로 분리된 이름,전화번호를 5개 입력 하세요");
    for(int i=0; i<5;i++) {
      System.out.print("이름,전화번호: ");
      String name = sc.next();
      String phone = sc.next();
      ht.put(name, phone);
    }
    System.out.println("전화번호를 검색할 이름을 입력하세요: ");
    String name = sc.next();
    String phone = (String)ht.get(name);
    
    if(phone !=null) {
      System.out.println(name+"의 전화번호는 "+phone+"입니다");
    }else {
      System.out.println("입력하신 이름의 전화번호는 찾을수 업습니다");
    }
    
  }
}
