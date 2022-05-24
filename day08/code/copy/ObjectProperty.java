package day08.code.copy;
class Point{
  int x,y;
  public  Point(int x, int y) {// 생성자 , 매개변수 있음
    this.x =x;
    this.y =y;
  }
  public boolean equals(Point p) { //생성자
    if(x == p.x && y ==p.y) return true;
    else return false;
  }
}
public class ObjectProperty {

  public static void main(String[] args) {
    //객체 생성
    Point a =new Point(2,3); // 생성자 호출 (2->x ,3->y이동)
    Point b =new Point(2,3); //생성자 호출 (위랑 동일하게 이동)
    Point c =new Point(3,4); // 생정자 호출 (위랑 동일하게 이동)
    
    if (a==b)
      System.out.println("a==b"); // 헤쉬코드가 달라서 출력 안됨
    if (a.equals(b))
      System.out.println("a is equal to b");
    if (a.equals(c))
      System.out.println("a it equal to c"); //매개체 안에 숫자가 달라서 호출 안됨

  }

}
