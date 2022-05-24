package day02.test;

public class Ex03 {

  public static void main(String[] args) {
    char c = 'C';
    String str = "C"; // "abcd"
                      //  0123 
//    switch(str.charAt(0)){
//    case 'A':
//      System.out.println("입력된 코드는 A입니다");
//      break;
//    case 'B':
//      System.out.println("입력된 코드는 B입니다");
//      break;
//    case 'C':
//      System.out.println("입력된 코드는 C입니다");
//      break;
//    case 'D':
//      System.out.println("입력된 코드는 D 입니다");
//      break;
//    default:
//      System.out.println("A에서 D까지 코드입니다");
  // if 문으로
    if(c=='A') {
      System.out.println("입력된 코드는 A입니다");
    }else if (c=='B') {
      System.out.println("입력된 코드는 B입니다");
    }else if (c=='C') {
      System.out.println("입련된 코드는 C입니다");
    }else if (c=='D') {
      System.out.println("입련된 코드는 D입니다");
    }else {
      System.out.println("A에서 D까지 코드입니다.");
      
    }
  }

}
