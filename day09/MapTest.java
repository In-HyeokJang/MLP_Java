package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//HashMap
public class MapTest {

  public static void main(String[] args) {
    HashMap map = new HashMap();
    map.put("0", "lee"); //(Key, value)
    map.clear();
    map.put("1", "cho");
    map.put("2", "kim");
    map.put("3","chung");
    map.put("4","min");
    map.put("3","jung"); 
    // Key는 중복이 안됨,그래서 덮어쓰기로 바뀜 chung => jung
    System.out.println(map);
    System.out.println(map.size());//사이즈 확인 
    System.out.println("key 3: "+ map.containsKey("3")); // true, false
    System.out.println("value kim : "+map.containsValue("kim"));// true, false
    System.out.println("key 2 delete : "+map.remove("2"));
    System.out.println(map);
    System.out.println(map.size());
    
    print(map);
    
  }

  private static void print(Map map) { //업캐스팅
    // Set만들기 , key들을 set자료구조로 만듬
    Set set =map.keySet();   
    
    //set자료구조에 들어있던 key값들이 Iterator자료구조로 변환 
    Iterator iter = set.iterator();
   
    while(iter.hasNext()) {//key값에 차례대로 접근
      String key = (String)iter.next();
      System.out.println(key + "=" + map.get(key));//value값을 가져옴
    }
  }
}
