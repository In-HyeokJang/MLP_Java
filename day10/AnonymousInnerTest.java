package day10;
 
class Outter2{
        
    public Runnable getRunnable(int i){
 
        int num = 100; // 지역변수
        
        return new Runnable() {
         
         //익명의 내부 클래스 
        @Override
        public void run() {
            //num = 200;   //에러 남
            //i = 10;      //에러 남
            System.out.println(i);
            System.out.println(num);
            }
        };// 익명의 지역 내부 클래스 객체 생성 후 리턴
    }//메소드
    
    Runnable runner = new Runnable() {//멤버변수
       
      //익명의 인스턴스 내부 클래스 
        @Override
        public void run() {
            System.out.println("Runnable 이 구현된 익명 클래스 변수");
            
        }
    };// 익명의 인스턴스 내부 클래스 객체 생성 후 멤버 변수에 할당 
}

public class AnonymousInnerTest {
  
  public static void main(String[] args) {
      Outter2 out = new Outter2();// 외부 클래스 객체 생성
  
      Runnable runnerble = out.getRunnable(10);
      runnerble.run();
      
      out.runner.run();
  }
}