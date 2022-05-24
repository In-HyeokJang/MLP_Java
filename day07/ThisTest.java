package day07;
class This{
  String area;
  public void prn() {
    System.out.println("이 메소드를 호출한 객체의 Hash Code:"+this);
    System.out.println(this.area);
  }
  public This() {//기본 생성자 
    
  }
}
public class ThisTest {

  public static void main(String[] args) {
    This obj1 = new This();
    obj1.area="강남";
    obj1.prn();
    System.out.println(obj1.hashCode());
  }

}
