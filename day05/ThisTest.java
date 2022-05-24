package day05;
class This{ //This는 해쉬코드가 있다
  String area; //필드 멤버변수
  public void prn() {//리턴X
    System.out.println("이 메소드를 호출한 객체의 HashCode"+this);
    System.out.println(this.area);//this는 자기 자신 나타날때 많이 씀
  }
}
public class ThisTest {

  public static void main(String[] args) {
    This obj1 = new This();// 객체 생성
    obj1.area="인천시";
    obj1.prn();// 객체의 HashCode가 prn()메소드로 호출
    System.out.println("dbj1.hashCode():"+obj1.hashCode());
    System.out.println(obj1);
  }

}
