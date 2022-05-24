package day04.test;

import java.text.DecimalFormat;
//인퍼에스 -> 상수 : double PI, 추상메소드 : 넓이(), 둘레(), print();
//main() -> 인터페이스 타입으로 업캐스팅 해서 인터페이스의 넓이, 둘레, print 함수 사용
//생성자를 사용하여 필드 초기화
interface Ishape{
  double pi=3.14; // 상수
  //추상메소드
  double area(); 
  double round();
  void print();
}
class Circle implements Ishape{ // 원 클래스
  private int r; // 반지름
  
  //생성자
  public Circle() {}
  public Circle(int r) {
    this.r = r;
  }
  
  public int getR() {
    return r;
  }
  
  public void setR(int r) {
    this.r = r;
  }
// 원의 넓이
  public double area() {
    return r*r*Math.PI;
  }
  // 메소드
// 월의 둘레
  public double round() {
    return 2*r*Math.PI;
  }
  //원의 넓이와 둘레 출력
  public void print() {
    // 소수점 자리수 나오게 하기
    DecimalFormat df =new DecimalFormat("####.##");
    System.out.println("원의 반지름 넓이 둘레");
    System.out.println("반지름:"+ r);
    System.out.println("원의넓이"+ df.format(area()));
    System.out.println("원의둘레"+df.format(round()));
    System.out.println(" ");
  }
}

// 삼각형 넓이 둘레 구하기
class Tryangle implements Ishape{
  //생성자
  public Tryangle () {}
  public Tryangle (int a, int b, int c) {
    this.a =a;
    this.b=b;
    this.c=c;
    
  }
  
  private double a; // 변1
  private double b; // 변2
  private double c; // 변3
  private double l; // 각 변의 길이 합/2
  
  // getter , setter
  public double getA() {
    return a;
  }
  public void setA(double a) {
    this.a = a;
  }
  public double getB() {
    return b;
  }
  public void setB(double b) {
    this.b = b;
  }
  public double getC() {
    return c;
  }
  public void setC(double c) {
    this.c = c;
  }
  // 메소드
  // 삼각형 둘레
  public double round() {
    return a+b+c;
  }
  // 삼각형 넓이
  public double area() {
    l = (double)round()/2;
    return Math.sqrt(l*(l-a)*(l-b)*(l-c));
  }
  
  
  public void print() {
  DecimalFormat df = new DecimalFormat("###.##");
  System.out.println("삼각형의 변1,변2,변3, 넓이 둘레");
  System.out.println("변1: "+a);
  System.out.println("변2: "+b);
  System.out.println("변3: "+c);
  System.out.println("삼각형 넓이: "+df.format(area()));
  System.out.println("삼각형 둘레: "+df.format(round()));
  System.out.println(" ");
  }
}

// 직사각형 넓이 둘레 구하기
class Rectangle implements Ishape{
  //생성자
  public Rectangle() {}
  public Rectangle(int a, int b) {
    this.a=a;
    this.b=b;
  }
  private int a; // 가로
  private int b; // 세로
  
  public int getA() {
    return a;
  }
  public void setA(int a) {
    this.a = a;
  }
  public int getB() {
    return b;
  }
  public void setB(int b) {
    this.b=b;
  }
  
  public double area() {
    return a*b;
  }
  public double round() {
    return 2*(a+b);
  }
  public void print() {
    DecimalFormat df = new DecimalFormat("####.##");
    System.out.println("직사각형의 가로 세로 넓이 둘레");
    System.out.println("가로: "+ a );
    System.out.println("세로: "+ b);
    System.out.println("넓이: "+df.format(area()));
    System.out.println("둘레: "+df.format(round()));
    System.out.println(" ");
  }
}

public class Shape {

  public static void main(String[] args) {
    // 원
    Ishape c =new Circle(10); // 업캐스팅
    c.print();
    // 삼각형
    Ishape t = new Tryangle(3,4,5);
    t.print();
    
    // 직사각형
    Ishape r = new Rectangle(10,20);
    r.print();
    
  }

}
  
