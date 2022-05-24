package day04.code;

import java.util.Scanner;

class Goods{
  private String name;
  private int price;
  private int numberOfStock;
  private int sold;
  
  Goods(String name, int price, int numberOfStock, int sold){// 생성자
    this.name=name;
    this.price=price;
    this.numberOfStock=numberOfStock;
    this.sold=sold;
  }
  // getter 만들기 
  String getName() {return name;}
  int getPrice() {return price;}
  int getNumberOfStock() {return numberOfStock;}
  int getSold() {return sold;}
  
}

public class GoodsArray {

  public static void main(String[] args) {
    Goods[]goodsArray = new Goods[3]; // class 타입의 해쉬코드 배열 생성
    
    for(int i=0; i<goodsArray.length; i++) {
      Scanner s = new Scanner(System.in);
      String name =s.next();
      int price =s.nextInt();
      int n = s.nextInt();
      int sold = s.nextInt();
      goodsArray[i] = new Goods(name,price,n,sold);// 객체 생성
    }
    for(int i=0; i<goodsArray.length; i++) {
      System.out.print(goodsArray[i].getName()+" "); //상품이름 출력
      System.out.print(goodsArray[i].getPrice()+" ");
      System.out.print(goodsArray[i].getNumberOfStock()+" ");
      System.out.println(goodsArray[i].getSold()+" ");
    }
  }

}
