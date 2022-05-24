package day10;

interface GenericInterface<T>{
  void setValue(T x);
  String getValueType();
}
class GenericClass<T> implements GenericInterface<T>{

  private T value;//멤버변수
  
  @Override
  public void setValue(T x) {
    value = x;
    
  }

  @Override
  public String getValueType() {
    // TODO Auto-generated method stub
    return value.getClass().toString();
  }
  
}
public class GenericInterfaceExample {

  public static void main(String[] args) {
    //객체 생성
    GenericClass<Integer> i = new GenericClass<Integer>();
    i.setValue(10);
    System.out.println(i.getValueType());
    
    GenericClass<String> s = new GenericClass<String>();
    s.setValue("Text");
    System.out.println(s.getValueType());
  }
}
