package day04.code;
// 간단한 클래스 만들어서 사용하기
public class Goods1 {
  String name;
  int price;
  int numberOfStock;
  int sold;
  
  public static void main(String[] args) {
    Goods1 camera = new Goods1();
    camera.name = "Nikon";
    camera.price = 400000;
    camera.numberOfStock = 30;
    camera.sold = 50;
    
    System.out.println("상품이름: "+camera.name);
    System.out.println("상품가격: "+camera.price);
    System.out.println("재고수량: "+camera.numberOfStock);
    System.out.println("팔린수량 :"+camera.sold);

  }

}
