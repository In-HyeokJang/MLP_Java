package stream;

import java.util.Arrays;

public class IntArrayTest {

  public static void main(String[] args) {
    int [] arr = {1,2,3,4,5}; //배열 생성
    
    int sum = Arrays.stream(arr).sum();
    long count = Arrays.stream(arr).count();
    
    System.out.println("배열합: "+sum);
    System.out.println("배열갯수: "+count);
  }
}
