package test;

public class Ex02 {

  public static void main(String[] args) {
    //구구단 만들기
    
    for(int i=1; i<=9; i+=3) {
      System.out.println(i+"단\t\t"+(i+1)+"단\t\t"+(i+2)+"단\t\t");
      
      System.out.println("--------------------------------------");
      
      for(int j=1; j<=9; j++) {
        System.out.print(i+"*"+j+"="+ i*j +"\t");
        System.out.print((i+1)+"*"+j+"="+((i+1)*j)+"\t");
        System.out.print((i+2)+"*"+j+"="+((i+2)*j)+"\t");
        System.out.println(" ");
        
      }
      System.out.println("------------------------");
    }
  }
}
