package day04;
class ScjpPass{
  int t1;
  int t2;
  int t3;
  int t4;
  
  // 클래스 변수(static)
  static int bouns = 100;
  
  public ScjpPass() {}
  
  public ScjpPass(int t1, int t2, int t3, int t4) {
    this.t1 = t1;
    this.t2 = t2;
    this.t3 = t3;
    this.t4 = t4;
  }
}

public class Scjp {

  public static void main(String[] args) {
    System.out.println("ScjpPass.bonus:" +ScjpPass.bouns);
    
    
    ScjpPass p = new ScjpPass(90,40,50,60);
    System.out.println("p.t1:"+p.t1);
    
    System.out.println("p.bouns:"+p.bouns);// 나오기는 하나 static 변수로 해서 입력하기를 권장
    //System.out.println("p.bouns:"+ScjpPass.bouns);// static변수 모양
  }

}
