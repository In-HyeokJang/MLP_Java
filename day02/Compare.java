package day02;

public class Compare {

  public static void main(String[] args) {
    int i = 5;
    int j = 10;
    int k = 15;
    
    System.out.println("5 == 10: " + (i==j));
    System.out.println("5 != 15: " + (i!=k));
    System.out.println("10 < 15: " + (j!=k));
    System.out.println("k > i :" + (k> i));
    System.out.println("5 <= 15: " + (i<=k));
    System.out.println("i >= j: " + (i>=j));
  }

}
