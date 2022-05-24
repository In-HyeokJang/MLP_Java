package day11;

public class Ex14_09 {

  public static void main(String[] args) {
    
    //내부클래스 생성
    class Car {
      String carName;//멤버변수
    }
    class Truck extends Car implements Runnable{
      
      
      public Truck(String carName) { // 생성자
        this.carName = carName;
      }

      @Override
      public void run() {
        for(int i=0;i<3;i++) {
          try {
          Thread.sleep(10);
          System.out.println(carName+"~~달립니다.");
        }catch(Exception e) {
          
        }
        
      }//end for
      
    }//end run
  }// end Truck
    
    Thread t1 = new Thread(new Truck("$트럭1"));
    Thread t2 = new Thread(new Truck("@트럭2"));
    Thread t3 = new Thread(new Truck("!트럭3"));
    
    t1.start();
    t2.start();
    t3.start();
    
}
}
