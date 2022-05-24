package day05;
class TypeConvert{
  String url = "http://www.kma.go.kr"; 

  public void setUrl(String url){ this.url = url; } 
  public String getUrl(){ return this.url; }
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "TypeConvert에서 오버라이딩된 메소드입니다.";
  } 

}
// 업캐스팅 예제
public class TypeConvertTest {

  public static void main(String[] args) {
   TypeConvert tc = new TypeConvert();
   
   Object obj = tc; // 업캐스팅
   //System.out.println(obj.);// 오류
   System.out.println(tc.getUrl());
   
   System.out.println(obj.hashCode());
   System.out.println(tc.hashCode());
   
   //System.out.println(tc.toString()); // toString 사용
   System.out.println(obj.toString());// toString 사용
  }

}
