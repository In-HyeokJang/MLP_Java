package test;

public class Hello2 {
  
  public static int sum(int i, int j) {
    
    return i + j;
  }

  public static void main(String[] args) {
    int t = sum(100, 200); // 호출
    System.out.println(t); // 출력
    
    System.out.println(sum(20, 30)); // 호출 -> 출력
    
    int i = 20;
    int s;
    char a ; // 'a' 문자타입
    
    s = sum(i,10);
    a = '2';
    System.out.println(a);
    System.out.println("Hello2");
    System.out.println(s);
       

  }

}
