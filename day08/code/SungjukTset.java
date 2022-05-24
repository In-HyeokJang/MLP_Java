package day08.code;
interface ISungjuk{
  void setJumsu(int kuk, int eng);
  void print();
}
class Sungjuk implements ISungjuk{
  int kuk;
  int eng;
  @Override
  public void setJumsu(int kuk, int eng) {
    this.kuk=kuk;
    this.eng=eng;
    
  }

  @Override
  public void print() {
    System.out.println("성적증명서");
    System.out.println("국어: "+kuk);//this 생략 가능
    System.out.println("영어: "+eng);//this 생략 가능
    
    
  }
  
}
public class SungjukTset {

  public static void main(String[] args) {
    //ISungjuk i = new ISungjuk(); // 인터페이스는 객체 생성 불가능
    ISungjuk i = new Sungjuk();
    i.setJumsu(100, 90);
    i.print();
  }
}
