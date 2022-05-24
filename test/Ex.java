package test;

import java.util.Scanner;

public class Ex {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int kuk;
    int eng;
    int math;
    System.out.print("국어점수: ");
    kuk = sc.nextInt();
    System.out.print("영어점수: ");
    eng = sc.nextInt();
    System.out.print("수학점수: ");
    math = sc.nextInt();
        
    int tot = (kuk + eng +math);
    int avg = tot/3;
    
    System.out.println("총점은: " +tot);
    System.out.println("평균은: " +avg);
   
    switch(avg/10){
      case 10:
      case 9:
        System.out.println("A등급입니다");
        break;
      case 8:
        System.out.println("B등급입니다");
        break;
      case 7:  
        System.out.println("C등급입니다");
        break;
      case 6:
        System.out.println("D등급입니다");
        break;
      default:
        System.out.println("F등급입니다.");
    }
  
  }
  
}
