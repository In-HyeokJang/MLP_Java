package day11;

class GenClass{
  
  //멤버변수
  private int num;
  private String name;
  
  public GenClass(String a, int b) {//생성자
    name = a;
    num = b;
  }
  public void start() {//메소드
    for(int i=0; i<num; i++) {
      System.out.println(name +":"+i);
    }
  }
}

public class NonThread {

  public static void main(String[] args) {
    //객체생성
    GenClass t1 = new GenClass("first",25);
    GenClass t2 = new GenClass("second",25);
    GenClass t3 = new GenClass("third",25);
    
    t1.start();
    t2.start();
    t3.start();
  }
}
