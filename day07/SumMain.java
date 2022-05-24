package day07;
abstract class Sum{//추상 클래스
  //추상메소드입니다.
  public abstract String toString();
  public String sum(int i, int k) {//정상메소드
    return i+k+""; //inst sum = i+k; return ""+sum;
  }
}
class Sum_s1 extends Sum{

  @Override
  public String toString() { // sum이 가지고 있는 toString가 오버라이딩됨
    return "class Sum_s1 extends Sum";
  }
  
}
class Sum_s2 extends Sum{

  @Override
  public String toString() {
    return "class Sum_s2 extends Sum";
  }
  
}
public class SumMain {

  public static void main(String[] args) {
  Sum_s1 s1 =new Sum_s1();
  System.out.println(s1.sum(10,20)); // 추상 클래스가 가지고 있는 정상적인 메소드
  System.out.println(s1);
  
  Sum_s2 s2=new Sum_s2();
  System.out.println(s2.sum(100,200));
  System.out.println(s2);

  }

}
