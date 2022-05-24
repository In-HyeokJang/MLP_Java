package day07.code;
class Rect2{//클래스
  int width;//변수
  int height;//변수
  public Rect2(int width, int height) {//생성자
    this.width = width;//자기꺼
    this.height = height;//자기꺼
  }
  public boolean equals(Rect2 p) {// 메소드
    if(width*height == p.width*p.height) 
      return true;
    else 
      return false;
  }
}

public class EqualsEx {

  public static void main(String[] args) {
    Rect2 a = new Rect2(2,3);
    Rect2 b = new Rect2(3,2);
    Rect2 c = new Rect2(3,4);
    
    if(a.equals(b)) System.out.println("a is equal to b");
    if(a.equals(c)) System.out.println("a is equal to c");// 달라서 출력 안됨
    if(b.equals(c)) System.out.println("b is equal to c");// 달러서 출려 안됨

  }

}
