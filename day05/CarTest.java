package day05;

import java.util.Scanner;

class Car{ 
  public void gear() {//메소드
    System.out.println("수동기어를 사용합니다");
  } 
}
class ChildCar extends Car{
  public void auto_gear() { //메소드
    System.out.println("자동기어를 사용합니다");
  }
}
class ChlidCar2 extends ChildCar{
  public void auto_gear2() { // 메소드
    System.out.println("수동/자동기어를 혼합하여 사용합니다");
  }
}
public class CarTest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ChlidCar2 cc2 =new ChlidCar2(); //객체 생성
    cc2.gear();
    cc2.auto_gear();
    cc2.auto_gear2();
  }

}
