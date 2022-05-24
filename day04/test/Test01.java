
//산술연산(+, -, *, /, %)를 계산 하는 클래스(1)와
//클래스(1)을 사용하는 main()있는 클래스(2)를 만듭니다.
//
//클래스(1)에는 
//멤버변수 캡슐화된 두수,연산자 번호
//입력메소드() - Scanner를 이용해서  연산자번호(1,2,3,4,5) 와 멤버변수값 할당
//계산메소드() - 산술연산처리하는 메소드 (제어문 사용)
//출력메소드() - 멤버변수 및 연산자, 연산후 결과값 출력 메소드
//
//클래스(2)에는 
//main()있고, 클래스(1)를 객체 생성후  세개의 메소드 호출 한다.
package day04.test;

import java.util.Scanner;

class Calc {
  // 멤버변수
  private int num1;
  private int num2;
  private int op;
  private int rs;
  private char op_code;

  // setter , getter
  public void setNum1(int num1) {
    this.num1 = num1;
  }

  public int getNum1() {
    return num1;
  }

  public void setNum2(int num2) {
    this.num2 = num2;
  }

  public int getNum2() {
    return num2;
  }

  public void setOp(int op) {
    this.op = op;
  }

  public int getOp() {
    return op;
  }

  public void setRs(int rs) {
    this.rs = rs;
  }

  public int getRs() {
    return rs;
  }

  // 메소드 생성
  public void inData() {
    Scanner sc = new Scanner(System.in);
    System.out.print("첫번재 숫자 입력: ");
    num1 = sc.nextInt();
    System.out.print("두번째 숫자 입력: ");
    num2 = sc.nextInt();
    System.out.print("연산선택(1:'+',2:'-',3:'*'4:'/',5:'%'): ");
    op = sc.nextInt();
  }

  public void calcData() {// 계산메소드 - 산술연산처리(제어문사용)
    if (op == 1) {// '+'연산
      op_code = '+';
      rs = num1 + num2;
    } else if (op == 2) {// '-'연산
      op_code = '-';
      rs = num1 - num2;
    } else if (op == 3) {// '*'연산
      op_code = '*';
      rs = num1 * num2;
    } else if (op == 4) {// '/'연산
      op_code = '/';
      rs = num1 / num2;
    } else if (op == 5) {// '%'연산
      op_code = '%';
      rs = num1 % num2;
    }
  }

  public void printResult() {// 출력 메소드
    System.out.println("--------------");
    System.out.println("첫번째 숫자: " + num1);
    System.out.println("두번째 숫자: " + num2);
    System.out.println("연산자: " + op);
    System.out.println("연산결과: " + rs);
    System.out.println("---------------");
  }
}

public class Test01 {

  public static void main(String[] args) {
    Calc o1 = new Calc();
    o1.inData();
    o1.calcData();
    o1.printResult();

  }

}
