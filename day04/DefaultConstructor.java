package day04;

public class DefaultConstructor {
  int x;
  public void setX(int x) {this.x = x;}
  public int getX() {return x;}
  
  public DefaultConstructor(int x) {// 인자 있는 생성자가 있을경우 기본생산자는 자동 생산 안함
    this.x = x;}
  
  public static void main(String[] args) {
    DefaultConstructor d = new DefaultConstructor(3);
    int n = d.getX();
    System.out.println(n);
    
    //DefaultConstructor d2 = new DefaultConstructor(); 
    // ()안에 아무것도 없어서 오류
    
  }

}
