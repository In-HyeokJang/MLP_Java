package day02;

import java.util.Scanner;

public class ArrayAccess {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int intArray[] = new int[5];//0~4
    int max = 0;
    
    for(int i =0; i<5; i++) { // i: 0,1,2,3,4 까지 증가
      intArray[i] = in.nextInt();
      if(intArray[i]>max) {
        max = intArray[i]; 
      }
    }
    System.out.println("입련된 수에서 가장 큰 수는" + max +"입니다");
  }

}
