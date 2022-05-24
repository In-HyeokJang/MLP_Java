package day10.code;


import java.util.Collections;
import java.util.Vector;

public class VectorExample {

  public static void main(String[] args) {
    // 1. Integer형만 저장, capacity가 3으로 시작
    Vector<Integer>v = new Vector<Integer>(3);
    System.out.println("Vector의 초기 크기: "+v.capacity());
    v.add(1); //박싱
    v.add(22);
    v.add(51);
    v.add(10);
    System.out.println("요소크기: " +v.size() +" 백터의 크기: "+v.capacity());
    System.out.println(v);
    Collections.sort(v);//요소의 순서대로 출력
    System.out.println(v);
    
    for(int i=0; i<v.size();i++) {
      int n = (int)v.get(i);//언박싱
      System.out.println(n);
    }
  }
}
