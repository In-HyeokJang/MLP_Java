package day05;
class OverA{
  void show(String str){
    System.out.println("상위클래스의 메소드 show(String str)수행"+ str);// 메소드
  }
  
  void show() { // 오버로딩
        System.out.println("상위클래스의 메소드 show()수행");
        
  }
}

class SubOverA extends OverA{
  void show() { //오버라이딩
    super.show();//상위꺼 호출
    System.out.println("하위클래스의 메소드 show()수행");
    
  
  }
}
public class OverrideExam1 {

  public static void main(String[] args) {
    OverA oa = new OverA();
    oa.show("나의 메소드");

    SubOverA over = new SubOverA();
    over.show("IT KOEAK");//부모의 메소드 호출
    over.show();//자신의 메소드 호출 
    
  }

}
