package day02.test;

public class Ex04 {

  public static void main(String[] args) {
    
    int score = 50;
    
    switch(score/10) {
    case 10:
    case 9:
      System.out.println("등급은 A입니다");
      break;
    case 8:
      System.out.println("등급은 B입니다");
      break;
    case 7:
      System.out.println("등급은 C입니다");
      break;
    case 6:
      System.out.println("등급은 D입니다");
      break;
    default:
      System.out.println("노력하세요");
    
    }
//    >>>> Switch를 이용한 실습예제 2 
//
//    점수              출력 내용 
//    ================================ 
//    100 
//    99~90           등급은 A입니다. 
//    89~80                  B 
//    79~70                  C 
//    69~60                  D 
//    59 이하         노력하세요. 
    
    

  }

}
