package day04;

class pay{
  int ppp;
  
  public void payRefer(pay a) { // call by reference
    a.ppp = a.ppp + 2000;
    System.out.println("a"+ a.hashCode());
  }
  public void payValue(int j) { // call by value
    j += 2000;
  }
}
public class PayTest {

  public static void main(String[] args) {
    pay p = new pay();
    
    p.ppp = 10;
    
    p.payRefer(p); // call by reference로 전달
    System.out.println(p.ppp); // 객체가 변경되서 2010
    System.out.println("p"+p.hashCode());
    
    int i = 10;
    
    p.payValue(i); // call by value로 전달
    System.out.println(i);
    
    
    
  }

}
