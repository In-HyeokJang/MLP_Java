package day02;

public class IncDec {

  public static void main(String[] args) {
    int sum = 0;
    for (int i = 0; i < args.length; i++) {
      int n = Integer.parseInt(args[i]);
      sum += n; // 숫자를 합한다.
    }
    System.out.println("sum = " + sum);
  }
}
