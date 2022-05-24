package day02;

public class Two_Array {

  public static void main(String[] args) {
    int[][] m =
      {{10,20}, //0행
         {30,40}, //1행
          {50,60}, //2행
        };
    
      // int[][] m2 =new int[3][2];
      // m2[0][0]=10; // 0행0열
      // m2[0][1]=20;// 0행1열
      // m2[1][0]=30;// 1행0열
      // m2[1][1]=40;// 1행1열
      // m2[2][0]=50;// 2행0열
      // m2[2][1]=60;// 2행1열
    
    for(int i=0; i<3; i++) {
      for(int j=0; j<2; j++) {
        System.out.println("m["+i+"]n["+j+"]="+m[i][j]);
      }
    }
  }

}
