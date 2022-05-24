package lambda;

@FunctionalInterface // 두개의 메소드 사용 못함
interface MyNumber {
  int getMax(int num1, int num2);
  //int getMin(int num1, int num2);
}

public class TestMyNumber {

  public static void main(String[] args) {

    MyNumber max = (x, y) -> (x >= y) ? x : y; // 람다식을 인터페이스 변수에 대입
    System.out.println(max.getMax(10, 20));
  }
}
