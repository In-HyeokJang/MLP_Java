package stream;

public class TravelCustomer {

  //멤버변수
  private String name;
  private int age;
  private int price;
  
  //맥의변수 생성자 생성
  public TravelCustomer(String name, int age, int price) {
    super();
    this.name = name;
    this.age = age;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public int getPrice() {
    return price;
  }
  
  @Override
  //toString
  public String toString() {
    return "TravelCustomer [name=" + name + ", age=" + age + ", price=" + price + "]";
  }
  
  
}
