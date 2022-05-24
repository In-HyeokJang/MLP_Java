package day02;

public class IfText1 {

  public static void main(String[] args) {
    int i = 120;
    
    if(i % 2 == 0) {
      int count = 1;//지역변수
      System.out.println(i + "은(는)짝수");
    }
    // System.out.println("count" + count);// 지역변수 밖에 있어서 에러남
    
    if(i%3==0) {
      System.out.println("짝수"+i);
    }else {
      System.out.println("홀수" +i);
    }
    
    if(i %3 == 0) {
      System.out.println("3의 배수");
    }else if (i%4==0) {
      System.out.println("4의 배수");
    }else if (i%7==0) {
      System.out.println("7의 배수");
    } else {
      System.out.println("3,4,5의 배수가 아닙니다.");
    }
  
  
  
  }

}
