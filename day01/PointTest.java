package day01;

class Point{
  int x,y;//멤버변수, 자동초기화o
  Point(int x,int y){ // 생성자 (new 라는 객체를 생성해야 가능함), 특정한 값으로 필드 초기화 할때
    this.x = x;
    this.y = y;
  }
}

public class PointTest {

  public static void main(String[] args) {
    Point obj1 = new Point(10,20);
    Point obj2 = obj1;
    System.out.printf("obj1 = (%d, %d) %n", obj1.x, obj1.y);
    System.out.printf("obj2 = (%d, %d) %n", obj2.x, obj1.y);

  }

}
