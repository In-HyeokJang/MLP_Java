package day03.code;

import java.util.Scanner;

public class ArrayLength {

//  public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    double sum = 0;
//    int intArray[] = new int[5];
//    for(int i=0; i < intArray.length; i++) {
//      intArray[1]=in.nextInt();
//      
//    }
//    for(int i =0; i< intArray.length; i++) {
//      sum += intArray[i];
//    }
//    System.out.println("평균: "+ sum/intArray.length);
    public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      int intArray[] = new int[5]; // 배열의 선언과 생성
      double sum = 0;
      for (int i = 0; i < intArray.length; i++)
      intArray[i] = in.nextInt(); // 키보드에서 입력받은 정수 저장
      for (int i = 0; i < intArray.length; i++) {
      sum += intArray[i]; // 배열에 저장된 정수 값을 더하기
      }
      System.out.print("배열 원소의 평균은 " + sum/intArray.length + "입니다.");
      }
     
  }


