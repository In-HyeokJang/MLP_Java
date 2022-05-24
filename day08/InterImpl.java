package day08;

//인터페이스 생성
interface Inter{
  int add(int i, int j); // public abstract는 생략
  int sub(int i, int j); // public 생략
}



public class InterImpl implements Inter{

  public static void main(String[] args) {
    //객체 생성
    InterImpl i = new InterImpl(); // 구현 클래스를 접근해서 하는 방법
    System.out.println(i.add(10, 5));
    System.out.println(i.sub(10, 5));
    
    //Inter inter = new Inter(); // 인터페이스는 객체 생성 안됨
    
    Inter i2 = new InterImpl(); // 업캐스팅 되서 사용 가능
    System.out.println(i2.add(10, 10));
    System.out.println(i2.sub(500, 10));

  }

  @Override
  public int add(int i, int j) {
   
    return i+j;
  }

  @Override
  public int sub(int i, int j) {
    // TODO Auto-generated method stub
    return i-j;
  }

}
