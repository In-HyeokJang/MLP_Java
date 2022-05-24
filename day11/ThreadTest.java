package day11;

class MyThread extends Thread{
  private int num;
  private String name;
  
  public MyThread(String a, int b) { //생성자
    name = a;
    num = b;        
  }
  @Override
  public void run() { //Callback메소드
    for(int i=0; i<num; i++) {
      System.out.println(name+ " : "+i);
    }
  }
}

public class ThreadTest {

  public static void main(String[] args) {
    MyThread t1 = new MyThread("first",100); // first : 1~100 생성
    MyThread t2 = new MyThread("second",100);// second : 1~100 생성
    MyThread t3 = new MyThread("third",100);// third : 1~100 생성
    
    t1.start();
    t2.start();
    t3.start();    
  }
}
