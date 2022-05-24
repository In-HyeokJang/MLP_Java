package day10;

import day10.OutClass.InClass;

class OutClass2{//외부 클래스
  private int num =10;
  private static int sNum = 20;
  
   
  public OutClass2() { // 생성자
   // inClass = new InClass(); // 멤버변수
  }
 
  //정적 내부 클래스
  static class InStaticClass{
    //멤버변수 선언
    int inNum =100;
    static int sInNum = 200;
    //메소드 생성
    void inTest() {
      System.out.println("InStaticClass inNum= "+inNum+"(내부클래래스의 인스턴스 변수 사용)");
      System.out.println("InStaticClass sInNum= "+sInNum+"(내부 클래스의 스태틱 변수 사용)");
      System.out.println("OutClass sNum ="+sNum+"(외부클래스의 스태틱 사용)");
      //에러남 //System.out.println("OutClass num ="+num+"(외부클래스의 인스턴스변수 사용)");
    }
    static void sTest(){  // 정적 클래스의 static 메서드
      //num += 10;   // 외부 클래스의 인스턴스 변수는 사용할 수 없음.
      //inNum += 10; // 내부 클래스의 인스턴스 변수는 사용할 수 없음
      
      System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
      System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
      
  }
    public void usingClass(){
      //inClass.inTest(); //내부 클래스 변수를 사용하여 메서드 호출하기
    }
  }   
}

public class InnerClass2 {

  public static void main(String[] args) {
  
    OutClass2.InStaticClass sInClass =
        new OutClass2.InStaticClass();
    sInClass.inTest();
    
  //외부 클래스 생성하지 않고 바로 정적 내부 클래스 생성
    
    System.out.println("=======================================");
    
    System.out.println("정적 내부 클래스의 스태틱 메소드 호출");
    OutClass2.InStaticClass.sTest();
    
  
  }

}
