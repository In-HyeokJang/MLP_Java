package day03;

class Score{
  //이름(name),국어(kuk),영어(eng),수학(math)
  //메소드 total(), avg(),printScore()
  private String name;
  private int kuk;
  private int eng;
  private int math;
  // Score s1~s3을 위해 생성자 생성
  public Score() {}
  // s4 생성자 생성
  public Score(String name, int kuk, int eng, int math) {
    this.name=name;
    this.kuk=kuk;
    this.eng=eng;
    this.math=math;
  }
  
  //setter
  public void setName(String name) {
    this.name = name;
  }
  public void setKuk(int kuk) {
    this.kuk = kuk;  
  }
  public void setEng(int eng) {
    this.eng = eng;
  }  
  public void setMath(int math) {
    this.math = math;
  }
  // getter
  public String getName() {
    return name;
  }
  public int getKuk() {
    return kuk;
  }
  public int getEng() {
    return eng;
  }
  public int getMath() {
    return math;
  }
  
  public int total() { // 국어 영어 수학 총점
    return kuk + eng + math;
  }
  public double avg() { //총점 나누기
    return total() /3;
  }
  public void printScore() {
    System.out.println(" ");
    System.out.println("이름:"+name);
    System.out.println("국어점수:"+ kuk);
    System.out.println("영어점수: " +eng);
    System.out.println("수학점수: " +math);
    System.out.println("총점: " +total());
    System.out.println("평균: " +avg());
    
  }
}
class Grade extends Score{ //avg가지고 A B C 등급 나누기 printScore 오버라이딩
  
  public Grade () {} // 생성자
  public Grade(String name, int kuk, int eng, int math) { //매개변수생성자
    super(name, kuk, eng, math);
    
  }
  public String calcGrade() {//등급계산메소드
    String grade = null;
    
    int score = (int)avg()/10; // 부모 클래스에서 avg를 Double로 받아서 자식 클래스에서 int로 캐스팅 해주고 switch문에는 Double랑 Float는 안되서 int로 캐스팅 해준거
    switch(score) {
    case 10:
    case 9:
     grade="A등급입니다";
      break;
    case 8:
      grade="B등급입니다";
      break;
    case 7:
      grade="C등급입니다";
      break;
    case 6:
      grade="D등급입니다";
      break;
    default:
      grade="F등급입니다";
      break;
    }
    
    return grade;
  }
  @Override
  public void printScore() {
    // TODO Auto-generated method stub
    super.printScore();
    System.out.println("등급: " + calcGrade());
  }
 
}
public class ScoreCalc {

  public static void main(String[] args) {
    // 3개의 객체를 만든 후 총점과 평균을 구해서 출력하기

    Score s1 = new Score();
    Score s2 = new Score();
    Score s3 = new Score();
    Score s4 =new Score("4번",50,60,70);
    s4.printScore();
    
    s1.setName ("1번");
    s1.setKuk (19);
    s1.setEng (85);
    s1.setMath (87);
    s1.printScore();
    
    s2.setName("2번");
    s2.setKuk (90);
    s2.setEng(100);
    s2.setMath(100);
    s2.printScore();
    
    s3.setName("3번");
    s3.setKuk(100);
    s3.setEng(100);
    s3.setMath (80);
    s3.printScore();
    
    // 상속받고 오버라딩 추가 해서 만듬
    Grade g = new Grade();
    g.setName("5번");
    g.setKuk(100);
    g.setEng(70);
    g.setMath(90);
    g.printScore();
    
    Grade g2 = new Grade("6번",96,96,100);
    g2.printScore();
    
    
    
    
    
  }

}
