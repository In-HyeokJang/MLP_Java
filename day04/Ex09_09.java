package day04;

public class Ex09_09 {
  public static void main(String[] args) {
    String str1 = "Java Programming";
    String str2 = "Java Programming";
    String str3 = new String("Java Programming");
    String str4 = new String("Java Programming");
    Object obj = new Object();
    Object obj2 = new Object();
    
    // String 객체는 불변이다
    // new를 사용하지 않아도 된다
    // 같은 문자열은 공유한다
    // String name = "홍길동";
    // String str ="홍길동";
    // name hashcode와 str hashcode는 같다
    // 기본형 타입으로 만든거는 비교 가능함
    // new 타입과 기본형 타입으로 만든거 비교 불가능 equals로 하면 가능
    // 문자열 에서는 값비교 많이 사용하지 않음

    System.out.println("str1 ==> [" + str1.hashCode() + "]");
    System.out.println("str2 ==> [" + str2.hashCode() + "]");
    System.out.println("str3 ==> [" + str3.hashCode() + "]");
    System.out.println("str4 ==> [" + str4.hashCode() + "]\n");

    System.out.println("str1==str2 결과 :\t " + (str1 == str2));
    System.out.println("str1.equals(str2) 결과 : " + str1.equals(str2));
    System.out.println("str1==str3 결과 :\t " + (str1 == str3));
    System.out.println("str1.equals(str3) 결과 : " + str1.equals(str3));
    System.out.println("str4==str3 결과 :\t " + (str4 == str3));
    System.out.println("obj==obj2 결과 :\t " + (obj == obj2));
  }
}