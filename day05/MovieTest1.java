// 생성자 첫 라인에서는 항상 부모의 기본생성자를 호출한다.
package day05;
class TV{
  public TV () {
   // super(); //부모의 기본 생성자 호출 ->object
  System.out.println("tv");
  }
}
class Movies extends TV{
  String part = "한국영화";
  public Movies() { // 생성자
  //  super();// 부모의 기본 생성자 호출, 생략 가능
    System.out.println("movie");
  }
}
class Action extends Movies{
  String name ="백이진";
  public Action() { // 생성자
   // super(); // 부모의 기본 생성자 호출,생략 가능
    System.out.println("action");
  }
}

public class MovieTest1 {

  public static void main(String[] args) {
    Action a = new Action(); // 생성자 호출
    
  }

}
