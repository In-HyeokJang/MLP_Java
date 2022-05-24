package day02;

public class Break {

  public static void main(String[] args) {
    for(int i=0; i<=2; i++) {
      for(int j=2; j>=0; j--) {
        System.out.println("i=" + i +"j=" + j);
        System.out.println("   ");
        System.out.println("x-mas");
        if(j==1) {
          System.out.println("j==1 break");
          break;
        }// if end
      }// 안쪽 for end
    }// 바깥 for end
    
  }

}
