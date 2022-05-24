package day02;

public class SwitchTest2 {
  public static void main(String[] args) {
    char c = 'C';
    String str = "C"; // "abcd"
                      //  0123 
    switch(c){ // str.charAt()문자열로 바꿔주는 명령어
      case 'A':
        System.out.println("입력된 코드는 A입니다");
        break;
      case 'B':
        System.out.println("입력된 코드는 B입니다");
        break;
      case 'C':
        System.out.println("입력된 코드는 C입니다");
        break;
      default:
        System.out.println("A에서 B까지 코드입니다");
    
    }
  }
}
