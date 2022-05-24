package day03.test;

public class Ex01 {

  public static void main(String[] args) {
    // 1. 배열의 저장된 5개의 점수를 생성해서 반복문으로 배열 일관처리로
    //  총점을 구한후 평균을 구해서 출력하세요. 
    int s = 0;
    int[] a = { 90, 80, 70, 60, 50 };
    for (int i = 0; i < a.length; i++) {
      s += a[i];

    }
    System.out.println("총점은 : " + s + "입니다");
    System.out.println("평균은 : " + s / a.length + "입니다");

  }

}
