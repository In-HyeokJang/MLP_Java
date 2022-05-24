package day09;

import java.util.Properties;

public class ProTest {

  public static void main(String[] args) {
    Properties p = new Properties();// 객체 생성
    p.put("step1","JAVA+SCJP"); //문자열로 써줘야함
    p.put("step2","JSP + Oracle + SCWCD");
    p.put("step3","ejb+scbcd");
    p.put("step4","ojt+mvc2, Framework+개발");
    
    System.out.println("STEP1: "+p.getProperty("step1"));
    System.out.println("STEP1: "+p.getProperty("step2"));
    System.out.println("STEP1: "+p.getProperty("step3"));
    System.out.println("STEP1: "+p.getProperty("step4"));
  }
}
