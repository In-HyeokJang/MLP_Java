package day08.code.copy;

import java.util.StringTokenizer;

public class StringTokenizerEx {

  public static void main(String[] args) {
   StringTokenizer st =new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐","/"); //객체 생성
   while (st.hasMoreTokens()) {
     System.out.println(st.nextToken());
   }

  }

}
