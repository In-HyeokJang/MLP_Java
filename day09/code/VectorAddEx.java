package day09.code;

import java.util.Vector;

public class VectorAddEx {

  public static void main(String[] args) {
    Vector v = new Vector();
    v.add("Hello");
    v.add(4);
    v.add(3.14);
    v.add(5);
    
    int sum = 0;// 지역변수
    for(int i=0; i<v.size();i++) {
      Object obj = v.get(i);
      if(obj instanceof Integer) {
        int n =(int)obj;
        sum+=n;
        
      }
    }
    System.out.println("정수의 합은: "+sum);
  }
}
