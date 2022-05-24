package day10;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic2 {

  public static void main(String[] args) {
    ArrayList<Double> list = new ArrayList<Double>(10);  
    list.add(10.2);//박싱
    
    Iterator<Double> i = list.iterator();
    
    double su = i.next();
    
    System.out.println(su);
    
  }
}
