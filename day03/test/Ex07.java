package day03.test;

public class Ex07 {

  public static void main(String[] args) {
//    7.  다음의 코드조각들을 바르게 조합하여 아래 결과값이
//    출력되도록 만들어 보세요
//   
//      0      4
//      0      3
//      1      4
//      1      3
//      3      4
//      3      3
// 
//  >>> 코드 조각들
//  x++;
//  if(x==1){
//  System.out.println(x + "" + y);
//  class Test{
//  for(int y=4; y>2; y--){
//  for(int x=0; x<4; x++){
//  publc static void main(String[] agrs){

    for(int x =0; x <4; x++) {
      if(x==2)
        x++;
      for (int y=4; y >2; y--) {
       System.out.println(x + " " +y);
     }
    }
  }

}
