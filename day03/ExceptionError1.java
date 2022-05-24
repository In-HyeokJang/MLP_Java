package day03;

public class ExceptionError1 {
  public static void main(String[] args) {
    
    try {
      System.out.println("매개변수로 받은 두개의 값");
      String str =null;
      char c = str.charAt(0);// 알수 없는 문제 발생 (Exception) 
      int a = Integer.parseInt(args[0]); // 문자열 값을 정수로 변환
      int b = Integer.parseInt(args[1]);
      System.out.println("a="+a+"b="+b);
      System.out.println("a를 b로 나눈 몫 ="+(a/b));
      System.out.println("나눗셈이 원활이 수행되었습니다.");
      
      
    }catch(ArithmeticException e){
      System.out.println("================");
      System.out.println("ArithmeticException 처리루틴 : ");
      e.printStackTrace();
    }catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("===============");
      System.out.println("ArrayIndexOutOfBoundsException  처리루틴: ");
      e.printStackTrace();
    }catch(NumberFormatException e) {
      System.out.println("================");
      System.out.println("NumberFormatException 처리루틴:");
      e.printStackTrace();
    }catch(Exception e) {
      System.out.println("================");
      System.out.println("알수 없는 문제 발생");
      e.printStackTrace();
    }
    finally {
      System.out.println("============");
      System.out.println("예외처리 끝내고 finally 블럭을 수행합니다");
    }
    System.out.println("나머지 모듈 정상 작동!!");
  }
}
