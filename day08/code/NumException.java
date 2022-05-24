package day08.code;

public class NumException {

  public static void main(String[] args) {
    String[] sum = {"23","12","998","3.141592"};
    try {
      
        for(int i =0; i<sum.length;i++) {
          int j = Integer.parseInt(sum[i]);// 3.14592에서 예외 발생
    
        }
    }catch(NumberFormatException e) {
      System.out.println("실수는 정수로 변환할 수 없다.");
    }
  }
}
