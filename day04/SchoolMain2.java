package day04;
class School2{
  int kuk;
  int eng;
  public int hap() {
    return kuk+eng;
  }
  public School2( ) {}
  
}
public class SchoolMain2 {

  public static void main(String[] args) {

    School2 sc2 =new School2(); // 생성자
    sc2.kuk = 20;
    sc2.eng= 100;
    System.out.println("hap: "+ sc2.hap());
  }

}
