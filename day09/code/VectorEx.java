package day09.code;

import java.util.Vector;

public class VectorEx {

  public static void main(String[] args) {
    Vector v = new Vector(); // 벡터 생성
    v.add("Hello"); // 객체 요소 삽입
    v.add((4));//(new Integer)생략
    v.add(3.14);//(new Double)생략
    System.out.println("요소사이즈 :"+v.size());
    System.out.println("벡터의 가용 용량: "+v.capacity());//가용 용량
    
    for(int i =0; i<v.size();i++) {
      Object obj = v.get(i);
      if(obj instanceof String) { //String객체의 경우
      String str = (String)obj;
      System.out.println(str);
      }else if (obj instanceof Integer) {//Integer객체의 경우
        int n = (int)obj;
        System.out.println(n);
      }else if(obj instanceof Double){//Double객체의 경우
        Double d =(Double)obj;
        System.out.println(d);
      }
       
    }
    
  }
}
