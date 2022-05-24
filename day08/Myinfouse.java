package day08;
//인터페이스
interface MyinfoInter{
  String getName(); // 추상메소드
  String gttPhone(); // 추상메소드
}

class Myinfo implements MyinfoInter{
  private String name;
  private String phone;
  private String address;
  private int age;
  
  Myinfo(){}
  Myinfo(String name, String phone, String address, int age){
    this.name =name;
    this.phone=phone;
    this.address=address;
    this.age=age;
  }
  // 마우스 우 클릭 > source > Gatter amd Setter 클릭 후 생성
  @Override
  public String getName() {
    // TODO Auto-generated method stub
    return name;
  }

  @Override
  public String gttPhone() {
    // TODO Auto-generated method stub
    return phone;
  }
  public String getAddress() {
    return address;
  }
  public int getAge() {
    return age;
  }
}
public class Myinfouse {

  public static void main(String[] args) {
    // 객체 생성
    MyinfoInter info = new Myinfo("장인혁","010-9789-1261","왕십리",28);
    System.out.println(info.getName());
    System.out.println(info.gttPhone());
    //System.out.println(info.getAge()); 접근불가능 // info 헤쉬코드는 인터페이스를 바라보고 있어서 불가능
    //System.out.println(info.getAddress());

  }

}
