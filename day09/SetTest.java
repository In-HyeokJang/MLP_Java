package day09;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

  public static void main(String[] args) {
    HashSet set = new HashSet(); // hashset객체 생성, 중복 안됨
    set.add("lee"); 
    set.clear();//모두제거
    set.add("cho");
    set.add("kim");
    set.add("chung");
    set.add("min");
    set.add("chung");//중복 안됨 데이터가 들어가지 않음
    
    System.out.println("set 사이즈: "+set.size());
    //있는지 없는지 확인 하는법
    System.out.println(set.contains("chung"));// true, false중 하나로 나옴
    //제거 하는법
    set.remove("kim");
    System.out.println(set);
    System.out.println("set 사이즈 :" +set.size());//kim제거 되고 사이즈 출력 됨
    //iterator는 순차적으로 하나씩 하나씩 꺼내오는거, 하나하나 접근해서 변화 처리 가능함
    System.out.println("Iterator 객체를 이용해서 set값을 출력");
    print(set.iterator());
    //배열타입으로 해서 출력
    System.out.println("배열을 이용해서 set출력");
    print(set.toArray());//업캐스팅 함
  }
//배열 이용
  private static void print(Object[] array) {
    for(int i =0; i<array.length;i++) {
      System.out.println(array[i]);
    }
    
  }
//이터레이터 이용
  private static void print(Iterator iterator) {
    while (iterator.hasNext()) {
      String str =(String)iterator.next();
      System.out.println(str);
    }
    
  }
}
