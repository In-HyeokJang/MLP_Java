package day04;
class School4{
  int kuk;
  int eng;

  public int hap() {
    return kuk + eng;
  }
  public School4() {}
  public School4(int kuk, int eng) {
    this.kuk = kuk;
    this.eng = eng;
  }
  
  
}
public class SchoolMain4 {

  public static void main(String[] args) {
    School4 sc4 = new School4();

    sc4.kuk = 100;
    sc4.eng = 40;
    
    System.out.println("hap"+ sc4.hap());
    
    School4 sc5 = new School4(90,90);
    System.out.println("hap:" +sc5.hap());

  }

}
