package day09.code;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableEx {

  public static void main(String[] args) {
    Hashtable ht = new Hashtable();
    ht.put("28", "Justin");
    ht.put("26", "박재은");
    ht.put("28", "장인혁");
    ht.put("55", "해리포터"); //중복 안됨,key값이 같으면 바뀜
    
    System.out.println("Hashtable의 수 : "+ht.size());
   
    Enumeration e = ht.keys();
    while(e.hasMoreElements()) {
        String key = (String)e.nextElement(); // 다운 캐스팅
        String value = (String)ht.get(key);//다운캐스팅
        System.out.println(key+"="+value);
    }
  }
}
