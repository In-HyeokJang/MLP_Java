package day10;

class GenericClass2<T>{ // 클래스
  public void printMethodArgInfo(T arg) { 
    System.out.print("Argument Type is "+arg.getClass());
    System.out.println("/ Value is "+ arg);
  }
  //메소드 
  public <T> void printGenericMethodArgInfo(T arg) {
    System.out.print("Argument Type is "+arg.getClass());
    System.out.println("/ Value is "+ arg);
  }
}
public class NestedGenericMethodExample {

  public static void main(String[] args) {
    GenericClass2<String> gc = new GenericClass2<String>();
    gc.printGenericMethodArgInfo(10l); // Long타입
    gc.printGenericMethodArgInfo('A');
    gc.printGenericMethodArgInfo("안녕");
    
    gc.printMethodArgInfo("바윙");//문자열만 가능
    // gc.printMethodArgInfo(10); 
    // 객체생성할때 String으로 클래스 확정 되서 다른거 불가능
  }
}
