package day07.code;

public class StringEx {

  public static void main(String[] args) {
    String a = new String(" abcd");
    System.out.println(a.hashCode());
    String b = new String (",dfg");
    //문자열 연결
    a = a.concat(b); // concat는 문자열 연결 사용
    System.out.println(a);
    System.out.println(a.hashCode());
    //공백제거
    a= a.trim();
    System.out.println(a);
    System.out.println(a.hashCode());
    //문자열 대치
    a=a.replace("ab","12");
    System.out.println(a);
    System.out.println(a.hashCode());
    // 문자열 분리
    String s[] = a.split(",");
    for(int i=0; i<s.length;i++) {
      System.out.println("분리된"+i+"번 문자열: "+s[i]);
    }
    //서브 스트링
    a= a.substring(3);
    System.out.println(a);
    System.out.println(a.hashCode());
    //문자열의 문자
    char c = a.charAt(2);
    System.out.println(c);
   }

}
