package day10;

public class GenericMethodExample {
  
  //메소드 선언
  public static <T> void printArgInfo(T arg) {
    System.out.print("arg type is " + arg.getClass());//무슨 타입인지 알려주는거
    System.out.println("/ value is "+ arg.toString());
  }
  public static void main(String[] args) {
    //변수 선언
    Integer i = 10;
    char c = 'A';
    float f =3.14f;
    printArgInfo(i);
    printArgInfo(c);
    printArgInfo(f);
  }
}
