package stream;

import java.awt.geom.CubicCurve2D;
import java.util.ArrayList;
import java.util.List;

public class TravelTest {

  public static void main(String[] args) {
    // TravelCustomer 클래스에서 가져온거
    TravelCustomer t1 = new TravelCustomer("장인혁",28,100);
    TravelCustomer t2 = new TravelCustomer("박재은",26,300);
    TravelCustomer t3 = new TravelCustomer("홍길동",10,10);
    
    List<TravelCustomer> list = new ArrayList<TravelCustomer>();
    list.add(t1); list.add(t2); list.add(t3);
    
    System.out.println("===고객명단 출력===");
    list.stream()
    .map(c -> c.getName())//map은 이름만 출력 가능 
    .forEach(s->System.out.println(s));// 출력
    int total = list.stream()
        .mapToInt(c-> c.getPrice())// int형 출력방법 => mapToInt
        .sum();
    System.out.println("총 여행 비용은: "+total+"입니다");
    
    System.out.println("===20세 이상 고객 명단 정렬하여 출력===");
    
    list.stream().filter(c->c.getAge() >=20) // 20세 이상 출력
    .map(c -> c.getName()) // 이름 출력
    .sorted() // 정렬하여 출력
    .forEach(s ->System.out.println(s)); //최종 정리해서 출력
    
    }
}
