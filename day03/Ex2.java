package day03;

public class Ex2 {
  public static void main(String[] args) {
    String str = "JIH";
    try {
      char c = str.charAt(2);
    
      System.out.println("추출된 문자 : "+ c);
    }catch(Exception e) {
      e.printStackTrace();
    }finally{
      System.out.println("무조건 실행");
    }
      System.out.println("나머지 루틴을 정상적으로 실행합니다.");
  }
}
