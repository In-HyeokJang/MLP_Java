package day09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Properties;

public class ProTest2 {

  public static void main(String[] args) {
    String myinfopath = "myinfo.properties";
    FileInputStream fis = null;
    
    Properties pro = new Properties();
    try {
      fis = new FileInputStream(myinfopath);
      pro.load(fis);
      
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }catch(Exception e) {
      e.printStackTrace();
    }
    
    Iterator iter = pro.keySet().iterator();
    while(iter.hasNext()) {
//      String key = (String)iter.next();
//      String value = (String)pro.getProperty(key);
//      System.out.println(Key +"="+value);}
//
      System.out.println("이름:"+pro.getProperty("name"));
      System.out.println("전화번호:"+pro.getProperty("phone"));
      System.out.println("주소: "+pro.getProperty("address"));
    }
  }
}
