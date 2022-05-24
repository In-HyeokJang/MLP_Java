package day03;

public class Ex1 {
  public static void main(String[] args) {
    int a = 10;
    int b = 2;

    try {
    System.out.println("a = " + a + "b = " + b);
    System.out.println("a/b = " + (a / b));
    System.out.println("나눗셈이 수행되었습니다.");
    }catch(Exception e) {
      e.printStackTrace();
    }finally {
      System.out.println("무조건 실행");
    }
    
    
    System.out.println("프로그램이 정상적으로 종료 됩니다");
  }
}
