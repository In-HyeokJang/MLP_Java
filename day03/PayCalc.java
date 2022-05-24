package day03;
class pay{ // 클래스 : 필드
  //캡슈라 사용 (setter, getter 이용해서 사용)
  private String name;
  private int bonbong; //본붕,숫자
  
  // p1~p3을 위해 생성자 생성
  public pay() {}
  // p4 생성자 
  public pay(String name, int bonbong) {
    this.name=name;
    this.bonbong=bonbong;
  }
 
  //setter(합법적으로 숨겨진 영역에 접근해서 데이터를 저장하는 역할
  public void setName(String name) {
    this.name = name;
  }
  public void setBonbong(int bonbong) {
    this.bonbong = bonbong;
  }
  //getter(합법적으로 숨겨진 영역에 데이터를 가져온다
  public String getName() {
    return name;
  }
  public int getBonbong() {
    return bonbong;
  }
  public int tax() {
    return (int)(bonbong *0.045+0.5);
  }
  public int silsuCalc() {
    return bonbong-tax();
  }
  
  public void printCalc() {
    System.out.println("----------------");
    System.out.println("--04월 급여 내역--");
    System.out.println("----------------");
    System.out.println("성명: "+name);
    System.out.println("본봉: "+bonbong);
    System.out.println("세금: "+tax());
    System.out.println("실수령액: "+silsuCalc());
  }
}
class ExtraPay extends pay{
  private int child; //자녀수
  private int year; //근무년수
  public ExtraPay() {} //생성자
  public ExtraPay(String name, int bonbong, int year, int child) {
    super(name,bonbong);
    this.year=year;
    this.child=child;
  }
  public void setYear(int year) {
    this.year =year;
  }
  public int getYear() {
    return year;
  }
  public void setChild(int child) {
    this.child = child;
  }
  public int getChild() {
    return child;
  }
  public int calcExtra() {
    int pay=0;
    if (year == 0){        
    } else if (year == 1) {
      pay = pay + 200000;
    } else if (year == 2) {
      pay = pay + 400000;
    } else if (year == 3) {
      pay = pay + 600000;
    } else if (year == 4) {
      pay = pay + 800000;
    } else {
      pay = pay + 1500000;
    }

    // 자녀수당을 계산합니다.
    if (year >= 1) {
      if (child > 1) {
        pay = pay + (child * 200000);
      }
  } 
    return pay;
  }
  @Override
  public int silsuCalc() {
    // TODO Auto-generated method stub
    return getBonbong() + calcExtra() - tax();
  }
  @Override
  public void printCalc() {
    // TODO Auto-generated method stub
    System.out.println("----------------");
    System.out.println("--04월 급여 내역(수당)--");
    System.out.println("----------------");
    System.out.println("성명: "+getName());
    System.out.println("본봉: "+getBonbong());
    System.out.println("세금: "+tax());
    System.out.println("수당: "+calcExtra());
    System.out.println("실수령액: "+silsuCalc());
   
  }
 
  
}
public class PayCalc {

  public static void main(String[] args) {
    // 생성자가 없으면 아래 p1~p3 오류 남
    
    pay p2 = new pay();
    pay p3 = new pay();
    pay p4 = new pay("HGD",4000000);
    p4.printCalc();    
    pay p1 = new pay("왕눈이",2000000);
    p1.printCalc();
        
    p2.setName("아로미");
    p2.setBonbong(2500000);
    p2.printCalc();
    
    p3.setName("투투");
    p3.setBonbong(1500000);
    p3.printCalc();
    
    ExtraPay e = new ExtraPay();
    e.setName("홍길동");
    e.setBonbong(4000000);
    e.setYear(3);
    e.setChild(2);
    e.printCalc();
    
    ExtraPay e2 =new ExtraPay("삼길동",4000000,3,1);
    e2.printCalc();
  }

}
