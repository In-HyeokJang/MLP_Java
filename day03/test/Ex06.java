package day03.test;

public class Ex06 {

  public static void main(String[] args) {
    
//    6. 프로그램 실행시 main 인자값으로 정수를 입력받아서 양수인지, 음수인지, 0인지를  
//       판단후 출력하세요. 
    
    int i1 = Integer.parseInt(args[0]);
 
    
    if(i1 >0) { // i1이 0보다 크면 양수
      System.out.println("양수");
    }else if (i1<0) { // i1가 0보다 작으면 음수
      System.out.println("음수");
    }else // 다 아니면 0
      System.out.println("0입니다");
    
    {

   }
  }
} 
