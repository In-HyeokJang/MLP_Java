package day09;

import java.util.Vector;

public class SearchDelete {

  public static void main(String[] args) {
    String name[]= {"기획자","설계자","개발자"};
    
    Vector v = new Vector();
    
    for(int i=0; i<name.length;i++) {
      v.add(name[i]);
    }
    
    System.out.println(v);
    //개발자가 있는지 검사
    if(v.contains("개발자")) {
      int i = v.indexOf("개발자");
      System.out.println("해당 객체의 인덱스 "+(i+1)+"번째에 있다");
    }else {
      System.out.println("해당객체가 없다");
    }
    
    
    v.remove(0);// 제거
    System.out.println("-----지우고 난 후 ------");
    for(int i =0; i<v.size();i++) {
      String s = (String)v.get(i);//다운캐스팅
      System.out.println("Vector"+i+"번째 요소는"+s);
    }
    
    System.out.println("\n초기상태(capacity)과 사이즈(size)");
    System.out.println("요소의수(엘리먼트): "+v.size());
    System.out.println("Vector의 크기: "+v.capacity());
    
    System.out.println("\n---v.trimToSize()호출---------");
    v.trimToSize();
    System.out.println("요소의수(엘리먼트): "+v.size());
    System.out.println("Vector의 크기: "+v.capacity());
    //요소의 크기와 백터의 크기가 새로 들어올때 두배만큼 커진다
    
    System.out.println("\n---디자이너 요수 추가후 -----------");
    v.add("디자이너");
    System.out.println("요소의수(엘리먼트): "+v.size());
    System.out.println("Vector의 크기: "+v.capacity());
    //백터 두배로커져서 4로 변함
    
    System.out.println("\n---Coder 요수 추가후 -----------");
    v.add("Coder");
    System.out.println("요소의수(엘리먼트): "+v.size());
    System.out.println("Vector의 크기: "+v.capacity());
    //요소,벡터의 원래 크기만큼 다 차면 증가 안함

    System.out.println("\n---PM 요수 추가후 -----------");
    v.add("PM");
    System.out.println("요소의수(엘리먼트): "+v.size());
    System.out.println("Vector의 크기: "+v.capacity());
    //요소의 수가 증가가 되면서 백터의 크기 두배 증가
    
  }
}
