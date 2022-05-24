package day04;

class Scwcd {
  int t1;
  int t2;
  int t3;
  int t4;

  static int Bouns = 100;

  public Scwcd() {
  }

  public Scwcd (int t1, int t2, int t3, int t4) {
    this.t1 =t1;
    this.t2 =t2;
    this.t3=t3;
    this.t4=t4;
  }
    //클래스 메소드  
  public static void prLine() {
    System.out.println("****************");
    System.out.println("   SOLDESK       ");
    System.out.println("         JAVA   ");
    System.out.println("****************");
  }
  public static void prddd() {
    System.out.println("ddd");
  }
}

public class ScwcdMai {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scwcd.prLine();
    Scwcd.prddd();
    
  }

}
