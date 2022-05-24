package day11;

class RunThread2 extends Thread{
  
  //매개변수 있는 생성자 생성
  public RunThread2(String name) {
   super(name); // 부모의 인자있는 생성자로 전달, 스레드 이름  
  }

  @Override
  public void run() {
    for(int i=1; i<=30000000; i++) {
      if(i % 50 == 0) {
        System.out.println("Thread ["+ getName()+"]:"+ i);
        
        try {
          sleep(1);// 0.001초
        } catch (Exception e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
    }
  }
  
}
public class SchedulingTest2 {

  public static void main(String[] args) {
    
    Thread[] t =new RunThread2[5]; // 업캐스팅
    t[0] =new RunThread2("☆");
    t[1] =new RunThread2("★");
    t[2] =new RunThread2("◇");
    t[3] =new RunThread2("◆");
    t[4] =new RunThread2("○");
    
    t[0].start();
    t[1].start();
    t[2].start();
    t[3].start();
    t[4].start();
  }
}
