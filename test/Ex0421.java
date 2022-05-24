package test;

abstract class Calculator {
  public abstract int add(int a, int b);

  public abstract int subtract(int a, int b);

  public abstract double average(int[] a);
}

class GoodCalc extends Calculator {

  @Override
  public int add(int a, int b) {
    // TODO Auto-generated method stub
    return a + b;
  }

  @Override
  public int subtract(int a, int b) {
    // TODO Auto-generated method stub
    return a - b;
  }

  @Override
  public double average(int[] a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }
    return sum / a.length;
  }
}
public class Ex0421 {

  public static void main(String[] args) {
    /// 추상 클래스 Calculator를 상속받는 GoodCalc 클래스를 작성하세요.
    GoodCalc gc = new GoodCalc();
    System.out.println(gc.add(100, 200));
    System.out.println(gc.subtract(200, 10));
    int[] a = { 100, 200, 30, 50, 30 };
    System.out.println(gc.average(a));
  }
}
