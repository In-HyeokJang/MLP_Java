package day03.test;

public class Ex05 {

  public static void main(String[] args) {
//    5. 프로그램 실행시 main 인자값으로  숫자 2개를 입력받아서 최대값과 최소값을 구해서 
//    출력하세요. 
    
    int i1 = Integer.parseInt(args[0]);
    int i2 = Integer.parseInt(args[1]);
    
    
    if(i1>i2) {
      System.out.println("최대값은"+i1);
      System.out.println("최소값은"+i2);
      
    }else
      System.out.println("최대값은"+i2);
    System.out.println("최소값은"+i1);
    
  }

}
