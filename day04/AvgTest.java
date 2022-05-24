package day04;

public class AvgTest {
 public int getAvg() {
   System.out.println("값을 2개이상 이렵해주세요: ");
   return 0;
 }
//  public int getAvg(int a, int b) {
//    return(a + b) /2;
//  }
  public float getAvg(float a, float b) {
    return (a+b)/2;
  }
  public int getAvg(int a, int b, int c) {
    return (a+b+c)/3;
  }
  public int getAvg(int a, int b, int c, int d) {
    return (a+b+c+d)/4;
  }
  
//  public float getAvg() {
//    return 0.9f;
//  }

  public static void main(String[] args) {
    AvgTest avg = new AvgTest();
    System.out.println(avg.getAvg());
    System.out.println(avg.getAvg(10,20));
    System.out.println(avg.getAvg(10.5f,20.5f));
    System.out.println(avg.getAvg(3,4,5));
    System.out.println(avg.getAvg(3,0,5,4));

  }

}
