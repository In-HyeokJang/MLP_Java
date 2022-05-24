package codingTest;

import java.util.Scanner;

/**
 * 
 * 작성일 : 2022.05.12
 * 내 용 : A/B 
 *    두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
 */
public class Code_2257{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    System.out.println((a+b)%c);
    System.out.println( ((a%c) + (b%c))%c);
    System.out.println((a*b)%c);
    System.out.println(((a%c) * (b%c))%c);
    
    
   
  }
}
