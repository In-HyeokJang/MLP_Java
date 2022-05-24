package day04;
class SchoolVO {//데이터
  String name;
  int kuk;
  int eng;
  int tot;
  int avg;
}
class schoolProc2{
  public void print(SchoolVO vo) { // vo는 해쉬코드, 콜바이레퍼런스가 됨, 메소드 
    System.out.println("vo.name:" + vo.name);
    System.out.println("vo.kuk:" + vo.kuk);
    System.out.println("vo.eng:" + vo.eng);
    System.out.println("vo.tot:" + vo.tot);
    System.out.println("vo.avg:" + vo.avg);
  }
}
public class SchoolUSe2 {

  public static void main(String[] args) {
    SchoolVO vo = new SchoolVO();//객체 생성
    vo.name = "홍길동";
    vo.kuk = 90;
    vo.eng = 100;
    vo.tot = 190;
    vo.avg = 95;
    
    schoolProc2 sp = new schoolProc2();
    sp. print(vo);
    

  }

}
