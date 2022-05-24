package day10;

import java.util.Vector;

public class BoxingUnBoxingTest {

  public static void main(String[] args) {
    Vector v = new Vector();
    //박싱
    v.add(1L); v.add(2L); v.add(3L);
    v.add(4L); v.add(5L);
    
    prints(v);
  }

  private static void prints(Vector v) {
    int c= 0;
    
    for(int i=0; i<v.size();i++) {
      c += (Long)v.get(i); // 언박싱
    }
    System.out.println(c);
  }
}

