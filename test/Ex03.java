package test;

public class Ex03 {

  public static void main(String[] args) {
 // 1. 배열의 저장된 5개의 점수를 생성해서 반복문으로 배열 일관처리로
    //  총점을 구한후 평균을 구해서 출력하세요.
    int s=0;
    int []score = {50, 70, 80, 90, 100};
    for(int i=0; i<score.length;i++) {
      s += score[i];
    } //for end
    System.out.println("총점은: "+s+"입니다.");
    System.out.println("평균운: "+s/score.length+"입니다");
  }
}
