package day08;
// 인터페이스 생성
interface B{
  void display(String s); // 
}
class D1 implements B{
  String str; // 맴버 변수 선언

  @Override // D1에서 가져온거
  public void display(String s) {
    str = s;
    System.out.println("★★★★★★★★"+s);
    
  }
}

class D2 implements B{
  String str;

  @Override // D2에서 가져온거
  public void display(String s) {
    str =s;
    System.out.println("★★★★★★★★★★★★★★"+s);
    
  }
  
}
public class IR2 {

  public static void main(String[] args) {
    // 객체 생성
   B b = new D1();
   b.display("석모도"); // D1 출력
   
   b = new D2();// 업캐스팅 됨
   b.display("dabudo"); // D2가 출력

   D2 d2 = (D2)b;// 형변환 
   System.out.println(d2.str);
  }

}
