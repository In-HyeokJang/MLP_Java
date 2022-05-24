package day07.code;

public class StringBufferEx {

  public static void main(String[] args) {
    // StringBuffer의 해쉬코드는 다 같다
    StringBuffer sb = new StringBuffer("This");
    System.out.println(sb.hashCode());
    sb.append(" is pencil"); // 문자열 덧붙이기
    System.out.println(sb);
    System.out.println(sb.hashCode());
    
    sb.insert(7,  " my"); // insert는 중간에 넣겠다
    System.out.println(sb);
    System.out.println(sb.hashCode());
    
    sb.replace(8, 10, "your");// 문자열 대치
    System.out.println(sb);
    System.out.println(sb.hashCode());
    
    System.out.println(sb.length());//문자열 길이 확인하는법
    sb.setLength(5); // 스트링 버퍼 내 문자열 길이 매개체 안에 있는 숫자로 변동
    System.out.println(sb);
    System.out.println(sb.hashCode());
    
  }

}
