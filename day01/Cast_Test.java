package day01;

public class Cast_Test {
  // 필드 자동초기화 O
  public static void main(String[] args) {
       int i = 1234;     
       int k; // 지역변수 자동초기화 X , 메소드 안에 있으니까 지역변수               
       float f = 10.5f;//(float)10.5   
       double d = 100.55;            
       // System.out.println("Trace k: " + k);      
       //k = f;  
       k = (int)f;  
       System.out.println(k);           
       f = i;            
       System.out.println(f);            
       f = (float)d; 
       System.out.println(f); 

  }

}