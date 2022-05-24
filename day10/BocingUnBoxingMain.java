package day10;

import java.util.Vector;

public class BocingUnBoxingMain {

  public static void main(String[] args) {
    Vector v = new Vector(5,5); // capacity초기값(5), 증가값(5)
    v.add(3);
    v.add(1);
    v.add(5); v.add(4);
    v.add(8); v.add(3);
    System.out.println(v);
    System.out.println("백터의사이즈: "+v.size() +"증가값: "+ v.capacity());
    
    Integer gg =3;//박싱//new Integer(3);
    int ff = new Integer(4); //언박싱 // (new Integer(4)).intValue();
    int aa = (int)v.get(2);// 언박싱 
    System.out.println("unboxing: "+ aa);
    prints(v);
  }
  private static void prints(Vector v) {
    int sum = 0;
    for(int i=0; i<v.size();i++) {
      sum+=(int)v.get(i);//언박싱
    }
    System.out.println("합: "+sum);
  }
}
