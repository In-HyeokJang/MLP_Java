package day03.code;

import java.util.Scanner;

public class Grading {

  public static void main(String[] args) {
    char grade = 'F';
    Scanner a = new Scanner(System.in);
    
    while(a.hasNext()) {
      int score =a.nextInt();
      if(score >=90) grade ='A';// score가 90이상인 경우
      else if(score>=80) grade = 'B'; // score가 80이상인 경우
      else if(score>=70) grade = 'C'; // score가 70이상인 경우
      else if(score>=60) grade = 'D'; // score가 60이상인 경우
      else grade = 'F'; // score가 50이상인 경우
      System.out.println("학점은 "+ grade +" 입니다");
    }
    
  }

}
