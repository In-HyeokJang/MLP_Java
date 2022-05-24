package day05;
//부모 클래스
class SuperObject{
  protected String name;
  public void paint(){//메소드
    draw();
    
  }
  public void draw() { //메소드
   
    System.out.println(name);
  }
}
//자식 클래스
public class SubObject extends SuperObject{
  protected String name;
  public void draw() {//메소드 // 오버라이딩 됨
    name = "Sub";
    super.name = "Super";
    super.draw();
    System.out.println(name);
  }
  public static void main(String[] args) {
    SubObject b = new SubObject();
    SuperObject s = b;//업캐스팅->부모만 접근, 그러나 오버라딩된 메소드는 출력된다
    //SuperObject s = new SuperObject();
    s.paint();
    //b.name= "호이이"; // 자식 클래스 name으로 들어감
    //System.out.println(b.name);//부모 클래스는 숨겨지고 자식클래스가 호출됨
   
    

  }

}
