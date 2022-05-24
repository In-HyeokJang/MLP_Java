package day04;
class Final{
  int money = 100000; // 인스턴스 변수(멤버변수)
  final int day = 7;// 1주 final 인스턴스변수
  final int week = 4;//한달 final 인스턴스변수
  final static int month = 12;//1년 final 인스턴스변수
}
public class Finalmain {

  public static void main(String[] args) {
    Final fi = new Final();
    fi.money = 15000;
    // fi.day=10; final로 고정이 되어 있어서 변동 불가능
    System.out.println("1주일 용돈: "+fi.money * fi.day);
    System.out.println("1년:"+Final.month);
    // Final.month = 12; final로 고정 되어 있어서 변도 불가능
  }

}
