package day03.test;

public class Ex02 {

  public static void main(String[] args) {
//    2. 배열의 저장된 5개의 실수를 생성후 최대값과 최소값을 구한후 
//    출력하세요. 

    double s[] = {100, 90, 80, 70, 60};
    double max = s[0];
    double min = s[0];
    
    for(int i=0; i<s.length;i++) {
     if(s[i]>max) {
        max = s[i];
    }
     if(min>s[i]) {
       min = s[i];
     }
    }
    System.out.println("최대값은 :"+max);
    System.out.println("최소값은: "+min);
    
  }

}
