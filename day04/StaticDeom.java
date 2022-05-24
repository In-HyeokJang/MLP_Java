package day04;
class Box{
  int cnt;
  static long boxID; // static은 멤버변수 필드 자리에서만 생성해야 한다 , data 영역에 생김
  
  public Box() {// 생성자
    boxID = boxID +1; // boxID 누적 되어짐 static로 생성해서
    cnt = cnt +1;
    System.out.println("필드 cnt: "+cnt);
    System.out.println("static 변수 boxID: "+ boxID);
  }
//멤버 메소드에서는 static변수를 선언할수 없습니다. 
  
  public void staticTest(){ // stack
//      static long count=0; 
//      count=count+1; 
       
  }
  
   
  //static(class) 메소드에 static 변수를 선언할 수 없습니다. 
  
  public static void staticTest2(){ 
//      static long count=0; 
//      count=count+1; 
//       
//  } 
  
  
}
public class StaticDeom {

  public static void main(String[] args) {
    
    Box b1 = new Box();
    Box b2 = new Box();
    Box b3 = new Box();

  }

 }
}
