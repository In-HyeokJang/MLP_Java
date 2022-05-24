package day11;

class SleepThread extends Thread{
  public SleepThread(String name) {
    setName(name); // 부모(Thread)한테  전달
  }

  @Override
  public void run() {
    show();
  }

  private void show() {
    for(int i=0;i<50;i++) {
      print();
      try {
        sleep(50);
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
    
  }

  private void print() {
    System.out.print(getName());
    
  }
  
  
}
public class SleepThreadMain {

  public static void main(String[] args) {
    SleepThread t1 = new SleepThread("a");
    SleepThread t2 = new SleepThread("b");
    SleepThread t3 = new SleepThread("c");
    
    t2.setPriority(7);//우선순위 주기 1~10까지 줄수 있고 클수록 우선순위 높음
    t1.start();// t2가 t1보다 우선순위지만
    try {
      t1.join(); // t1을 끝낸 후 t2 t3를 실행한다
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    t2.start();
    t3.start();
    
  }
}
