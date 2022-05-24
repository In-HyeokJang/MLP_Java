package day10.code;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExapmle {

  public static void main(String[] args) {
    ArrayList a = new ArrayList(); // 빈 리스트 생성
    a.add("Hello");
    a.add(3); // == a.add(new Integer(3)), 박싱
    a.add(3.14); //== a.add(new Double(3.14)), 박싱
    a.add(2, 3.4);
    
    System.out.println(a);
    
    //이터레이터로 변환 작업
    Iterator i = a.iterator();
    while (i.hasNext()) {
      Object obj = i.next();
      if (obj instanceof String) {
        String str = (String)obj;
        System.out.println(str);//Hello 출
      }else if (obj instanceof Integer) {
        int n = (int)obj; //언박싱 // 생략((Integer)obj).inValue() =>3
        System.out.println(n);
      }else if (obj instanceof Double) {
        double d =(Double)obj;//언박싱 // 생략((Double)obj).doubleValue() => 3.14
        System.out.println(d);
      }
    }
  }
}
