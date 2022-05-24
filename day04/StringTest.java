package day04;

public class StringTest {
  public String changeString(String src) {
    System.out.println("JAVA hashcode:"+src.hashCode());
    System.out.println(src);
    src = "JSP";
    System.out.println("JSP hashcode:"+src.hashCode());
    System.out.println(src);
    
    return src;
  }
  public static void main(String[] args) {
    // 소문자 출력 System.out.println("ABCD".toLowerCase().hashCode());
    //대문자 ABCD의 해쉬코드 System.out.println("ABCD".hashCode());

    String step = "JAVA";
    
    StringTest st = new StringTest();
    System.out.println("java hashcode" +step.hashCode());
    step = st.changeString(step);
    System.out.println(step);
    System.out.println("JSP hashcode" +step.hashCode());
  }

}
