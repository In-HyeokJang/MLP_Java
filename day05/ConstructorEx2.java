package day05;
class A{
  public A() {
    System.out.println("생성자 A");
  }
  public A(int x) { //생성자
    System.out.println("생성자 A");
  }
 
}
class B extends A{
 public B() { //생성자 
   //부모 클래스에 기본생성자 없으면 오류 남, 부모클래스에 기본생성자 생성하거나 자녀클래스에 기본생성자를 없애버려야 함
   //부모 클래스에 아무것도 출력할거를 안쓰면 오류 안나고 자식 클래스만 출력 됨
   //super(); // 매개체안에 부모변수에안에 맞는거 써주면 오류안남
   System.out.println("생성자 B");
 }
 
}
public class ConstructorEx2 {

  public static void main(String[] args) {
    B b = new B();
    

  }

}




