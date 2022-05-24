package day07;
abstract class Calculator{//추상 클래스
  //추상 메소드
  public abstract int add(int a, int b); // a+ b
  public abstract int subtract(int a, int b); // a-b
  public abstract double average(int[] a); // 
    
}
class GoodCalc extends Calculator{
 
  @Override
  public int add(int a, int b) {
    return a +b;
  }
  @Override
  public int subtract(int a, int b) {
      return a - b;
  }
  @Override
  public double average(int [] a) {
      int sum = 0;
      for(int i =0; i<a.length; i++) {
        sum +=a[i];
      }
      return sum/a.length;
  }
}
public class CalcMain {

  public static void main(String[] args) {
    // GoodCalc 객체 생성
    // int a,b int [] avg ={} for문 돌려서 나눠서 평균 만들기
    GoodCalc gc1 =new GoodCalc();
    System.out.println("add(): "+ gc1.add(100, 200));
    System.out.println("sub(): " +gc1.subtract(100,50));
    int[] a = {90, 100, 50, 80, 100};
    System.out.println("avg(): "+ gc1.average(a));
    

  }

}
