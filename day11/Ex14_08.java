package day11;

public class Ex14_08 {

  public static void main(String[] args) {
    //내부 클래스
    class Car extends Thread{
      String carName;//멤버변수

      //생성자
      public Car(String carName) {
        this.carName = carName;
      }

      @Override
      public void run() {
        for(int i=0; i<3;i++) {
          try {
            //sleep(10);
            System.out.println(carName + "~~달립니다.");
            
          } catch (Exception e) {
          
            e.printStackTrace();
          }
          
        }// end for
      }// end run
      
    }//end 내부 클래스
    
   //내부 클래스 객체 생성
    Car car1 = new Car("$자동차1");
    Car car2 = new Car("@자동차2");
    Car car3 = new Car("*자동차3");
    
    car1.start();
    car2.start();
    car3.start();
  } 
}
