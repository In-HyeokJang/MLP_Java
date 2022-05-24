package day05;
//부모클래스
class School{
  int year;
  public School() {//생성자
    this.year=20;
  }
}
//자식 클래스
class MiddleSchool extends School{
  int year;
  public MiddleSchool() {//생성자
    this.year=3;
  }
  public void prn() {
    int year =10;//지역변수
    //지역변수가 없으면 위에 year이 나오고 있으면 지역변수가 출력
    System.out.println("year:"+year);
    System.out.println("this.year:"+this.year);//자식 출력
    System.out.println("super.year"+super.year);// 부모출력
  }
}
public class SuperTest {

  public static void main(String[] args) {
    MiddleSchool ms = new MiddleSchool();
    ms.prn();

  }

}
