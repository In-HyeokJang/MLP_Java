package day03.code;
public class Pay { 

  public static void main(String[] args) { 
    java.util.Scanner in = new java.util.Scanner(System.in); 
     
    // ------------------------------------------ 
    // 입력  
    // ------------------------------------------ 
    System.out.print("경력 년수를 입력하세요: "); 
    int year = in.nextInt();  
    System.out.print("자녀수를 입력하세요: "); 
    int child = in.nextInt(); 
    System.out.print("자격증 선택(0-없음, 1-기능사, 2-산업기사, 3-기사): ");
    int s = in.nextInt();
     

    // ------------------------------------------ 
    // 처리  
    // ------------------------------------------ 
    int year_pay = year * 200000; 
    int child_pay = child * 200000; 
    int basic = 1600000;
    int s_pay = 0;
    String s_name;
    if(s == 1) {
      s_pay = 100000;
      s_name = "기능사";
    }else if (s == 2) {
      s_pay = 150000;
      s_name = "산업기사";
    }else if (s == 3) {
      s_pay = 200000;
      s_name = "기사";
    }else {
      s_name = "없음";
    }
    int decide_pay = basic + year_pay + child_pay + s_pay; // 결정된 급여  
    int annual_salary = decide_pay * 13;           // 연봉 
     
    // ------------------------------------------ 
    // 출력  
    // ------------------------------------------ 
    System.out.println("-----------------------"); 
    System.out.println("JAVA 개발자 급여 내역서"); 
    System.out.println("-----------------------"); 
    System.out.println("기본급     : " + basic); 
    System.out.println("경력 년수  : " + year); 
    System.out.println("경력 수당  : " + year_pay); 
    System.out.println("자녀수     : " + child); 
    System.out.println("자녀 수당  : " + child_pay); 
    System.out.println("자격증 수당  : " + s_pay);
    System.out.println("자격증 수당  : " + s_name);
    System.out.println("결정된 급여: " + decide_pay); 
    System.out.println("결정된 연봉: " + annual_salary); 
    System.out.println("-----------------------"); 
     
  } 

} 