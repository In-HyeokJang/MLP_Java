package day09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {

  public static void main(String[] args) {
    //순서도 있고 중복도 가능한 리스트 구조로 만들기
    ArrayList list = new ArrayList();
    list.add("lee");
    list.clear();
    list.add("cho");
    list.add("kim");
    list.add("chung");
    list.add("min");
    list.add("chung");
    
    System.out.println(list);
    System.out.println("ArrayList사이즈:"+list.size());
    System.out.println(list.contains("chung"));//true, false
    list.remove("kim"); //데이터로 지우기
    System.out.println(list);
    list.remove(3);//순번으로도 지울수 있음
    System.out.println(list);
    System.out.println("ArrayList사이즈:"+list.size());
    
    System.out.println("min 위치값출력:"+list.indexOf("min"));
    System.out.println("---------------------");
    System.out.println("for문으로 출력:");
    
    //이터레이터나 배열을 이용하지 않고 출력 가능
    print(list);// 업캐스팅
    
    List sublist = list.subList(0, 2);
    System.out.println("sub를 사용해서 출력:");
    print(sublist); // 자기 자신, 캐스팅X
    //subString이 문자열 출력이니까, sublist도 0에서 2 사이에 있는 거 뽑아옴
    
    System.out.println("Iterator를 이용하여 출력:");
    print(list.iterator());//오버로딩
    
    System.out.println("배열을 이용해서 출력: ");
    print(list.toArray());
  }

  private static void print(Object[] array) {
    for(int i =0; i<array.length;i++) {
      System.out.println(array[i]);
      // 배열로 접근할때 사용, 업캐스팅됨
    }
    
  }

  private static void print(Iterator iterator) {
    while(iterator.hasNext()) {
      System.out.println(iterator.next());
      //이터레이터로 변환해서 사용
    }
    
  }

  private static void print(List list) {
    for(int i= 0; i<list.size();i++) {
      System.out.println(list.get(i));
      //리스트는 가지고 오는 값 get을 사용함
    }
    
  }
}
