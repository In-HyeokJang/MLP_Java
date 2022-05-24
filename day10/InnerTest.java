package day10;

class OutClass{//외부 클래스
  private int num =10;
  private static int sNum = 20;
  private InClass inClass;
  
  public OutClass() { // 생성자
   // inClass = new InClass(); // 멤버변수
  }
  class InClass{ // 내부 클래스
    int inNum =100;
    static int sInNum = 200; // 에러남
    //메소드
    void inTest() {
      System.out.println("OutClass num = "+ num+"(외부 클래스 인스턴스변수(필드))");
      System.out.println("OutClass sNum = "+sNum+"(외부 클래스의 스태틱변수)");
    }
    static void sTest() { //에러남
    }
  }//end InClass(내부 인스턴스 클래스)
  
  //정적 내부 클래스
  static class InStaticClass{
    //멤버변수 선언
    int inNum =100;
    static int sInNum = 200;
    //메소드 생성
    void inTest() {
      System.out.println("InStaticClass inNum= "+inNum+"(내부클래래스의 인스턴스 변수 사용");
      System.out.println("InStaticClass sInNum= "+sInNum+"(내부 클래스의 스태틱 변수 사용");
      System.out.println("OutClass sNum ="+sNum+"(외부클래스의 스태틱 사용)");
     //에러남//System.out.println("OutClass num ="+num+"(외부클래스의 스태틱 사용)");
    }
  }// end 내부 정적 클래스
  
  //메소드 추가
  public void usingClass() {
    inClass.inTest();//내부 클래스 변수를 사용하여 메서드 호출하기
  }
 }// end OutClass
public class InnerTest {

  public static void main(String[] args) {
    OutClass oc = new OutClass();
    System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
    //oc.usingClass();
    OutClass.InClass inclass = oc.new InClass();
    inclass.inTest();
  }
}
