package day05;
class Movie{//클래스
  String part = "영화:"; // 멤버 변수
}
class korea extends Movie{//movie 자식
  String m1 = "가문의위기";
}
class Foreign extends Movie{//movie자식
  String m1 = "박물관이 살아있다";
}
public class MovieTest {

  public static void main(String[] args) {
    // 객체 생성
    korea k = new korea();
    System.out.print(k.part);
    System.out.println(k.m1);

    Foreign f = new Foreign();
    System.out.print(f.part);
    System.out.println(f.m1);
  }

}
