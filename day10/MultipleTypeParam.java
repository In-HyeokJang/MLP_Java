package day10;
//클래스 생성
class Price<N,V>{
  //멤버변수 생성
  private N[] name;
  private V[] values;
  private int index;
  
  //생성자
  public Price(int size) {
    name = (N[])new Object[size];//다운캐스팅
    values = (V[])new Object[size];//다운캐스팅 
    
  }
  public void insert(N n ,V v) {
    name[index] = n;
    values[index] = v;
    ++index;
  }
  
  public void print() {
    for (int i =0; i<index; i++)
      System.out.println(name[i]+" : "+values[i]);
  }
}
public class MultipleTypeParam {

  public static void main(String[] args) {
    //객체 생성
    Price<String, Integer> p1 = 
        new Price<String, Integer>(10);
    p1.insert("apple", 1200);
    p1.insert("banana", 2000);
    p1.insert("grape", 3000);
    
    System.out.println("***Fruit Price***");
    p1.print();
    
    Price<String,Double> p2 = 
        new Price<String, Double>(10);
    p2.insert("USD", 944.22);
    p2.insert("JPY", 123.45);
    p2.insert("EUR", 125.44);
    System.out.println("***Exchange Rate***");
    p2.print();
    
    
  }
}
