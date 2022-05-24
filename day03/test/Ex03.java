package day03.test;

public class Ex03 {

  public static void main(String[] args) {
    
//    3. 배열에 저장된 5개의 음수, 양수를 절대값을 구해서 
//       출력하세요 

    int s[] = {100,50,-50,-40,10};
    for(int i=0; i<s.length; i++) {
      if(s[i]>0) {
        s[i] = s[i];
      }
      if (s[i]<0) {
        s[i] = s[i]*-1;
      }
    System.out.println("절대값: " + s[i]);
    }
        
  }

}
