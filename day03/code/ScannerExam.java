package day03.code;
import java.util.Scanner;
 
public class ScannerExam {
  public static void main (String args[])  { 
//     Scanner a = new Scanner(System.in); //키보드로 입력한 값
//     System.out.println("나이, 체중, 키를 빈칸으로 분리하여 순서대로 입력하세요");
//// 첫 번째 입력 아이템은 int
//     System.out.println("당신의 나이는 " + a.nextInt() + "살 입니다.");
//// 두 번째 입력 아이템은 double
//     System.out.println("당신의 체중은 " + a.nextDouble() +"kg 입니다.");
//// 세 번째 입력 아이템은 double
//     System.out.println("당신의 키는  " + a.nextDouble()+ "cm 입니다.");
 

      int opr = 0;
      System.out.println(opr++); // opr 출력 후 증가
      System.out.println(opr);
      System.out.println(++opr); // opr 증가 후 출력
      System.out.println(opr);
      System.out.println(opr--); // opr 출력 후 감소
      System.out.println(opr);
      System.out.println(--opr); // opr 감소 후 출력
      System.out.println(opr);
  }
}