package day05;
class A2{
  public A2() {
    System.out.println("생성자 A");
  }
  public A2(int x) {
    System.out.println("인자있는생성자 A");
  }
}
class B2 extends A2{
  public B2() {
    // 기본생성자 없으면 오류남
    System.out.println("생성자 B");
  }
  public B2(int x) {
    System.out.println("매개변수생성자 B");
  }
 }
public class ConstructorEx3 {

  public static void main(String[] args) {
    B2 b = new B2(); // 기본 생성자로 감
    B2 b2 = new B2(10); // int x 생성자로 감
    // 변수를 메모리에 생성할때 타입과 같이 선언한다

  }

}
