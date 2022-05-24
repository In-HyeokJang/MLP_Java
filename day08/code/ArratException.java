package day08.code;

public class ArratException {

  public static void main(String[] args) {
    int []intArray = new int[5];
    
    try {
      for(int i=0; i<5; i++) {
        intArray[i+1]=i+1+intArray[i];
        System.out.println("intArray["+i+"]"+"="+intArray[i]);
      }
    }
    catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("배열의 인덱스 범위를 벗어났습니다.");
    }
  }
}
