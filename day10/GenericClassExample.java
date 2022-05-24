package day10;

class SimpleGeneric<T>{// 클래스
  private T[] value;//멤버변수
  private int index;
  
  SimpleGeneric(int len){//생성자
    value = (T[]) new Object[len];
  }
  
  //메소드 생성
  public void add(T ...args) {// ...은 가변인자(갯수상관없이 보낼수 있음)
    for(T e : args) {// 개선된 for문 // 처음부터 끝까지 다 돌아야 함
      value[index++] = e;
    }
  }
  
  public void print() {
    for(T e:value) {
      System.out.print(e+ " ");
    }
    System.out.println();
  }
 }
public class GenericClassExample {

  public static void main(String[] args) {
    //Integer객체 생성
    SimpleGeneric<Integer> i = new SimpleGeneric<Integer>(10);
    
    i.add(1,2);
    i.add(1,2,3,4,5,6,7);
    i.add(0);
    i.print();
    //Double 객체 생성
    SimpleGeneric<Double> g = new SimpleGeneric<Double>(10);
    g.add(10.0, 20.0, 30.0);// 방은 10개인데 메소드가 3개여서 나머지는 null로 출력
    g.print();
  }
}
