package day10;

import java.util.Vector;

public class BocingUnBocingmain2 {

  public static void main(String[] args) {
    Vector<Integer> v =new Vector<Integer>(5,5);
    v.add(1);
    v.add(5); v.add(4);
    v.add(8); v.add(3);
    
    prints(v);
  }

  private static void prints(Vector<Integer> v) {
    int sum =0;
    
    for(int j=0; j<v.size();j++) {
      sum +=v.get(j);
    }
    
    System.out.println("합: "+sum);
  }
}
