package day08;

//인터페이스 생성
interface Green{
  String greenColor();// 추상 메소드
}
interface Red{
  String redColor();// 추상 메소드
}

class GreenImpl implements Green{

  @Override
  public String greenColor() {
    // TODO Auto-generated method stub
    return "초록색입니다.❤";
  }
  
}

class RedImlp implements Red{

  @Override
  public String redColor() {
    // TODO Auto-generated method stub
    return "빨간색 입니다.👌";
   }
  
}

class ColorImpl implements Green,Red{ // 두개 메소드 다 넣기

  @Override
  public String redColor() {
    // TODO Auto-generated method stub
    return "빨간색입니다.";
  }

  @Override
  public String greenColor() {
    // TODO Auto-generated method stub
    return "초록색입니다.";
  }
  
}
public class ColorMain {

  public static void main(String[] args) {
    // 객체 생성
    Green g =new GreenImpl();
    System.out.println(g.greenColor());
    Red r =new RedImlp();
    System.out.println(r.redColor());
    
    ColorImpl c = new ColorImpl(); // 두개 이상인 경우에는 클래스 타입으로 해서 가져와야 함
    System.out.println(c.greenColor());
    System.out.println(c.redColor());
    

  }

}
