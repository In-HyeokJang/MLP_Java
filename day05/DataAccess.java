package day05;
class Data{ //맴버 변수 , 필드
  private String name;
  private String season;
  private int year;
  
  public void setName(String name) {
    this.name=name;
  }
  public void setSeason(String season) {
    this.season=season;
  }
  public void setYear(int year) {
    if(year>=20 && year<=30) { // 데이터 제한 해서 저장하기
      this.year = year;
  } else {
    System.out.println("입력될 수 있는 나이는 20~30");
  }
 }   
  public String getName() {
    return name;
  }
  public String getSeason() {
    return season;
  }
  public int getYear() {
    return year;
  }
}

public class DataAccess {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Data d = new Data();
    // d.name="왕눈이";
    d.setName("왕눈이");
    d.setSeason("봄");
    d.setYear(40);
    
    System.out.println(d.getName());
    System.out.println(d.getSeason());
    System.out.println(d.getYear());
    
    
  }

}
