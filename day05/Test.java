package day05;
class Person1{
  String name;
  String phone;
  static int ID;

  public void setName(String s) {
  name = s;
          }
  public String getPhone() {
  return phone;
  }
  public static int getID() {
  return ID;
  }
  
}

class Professor extends Person1{
  
  protected void estName(String s) {
    //접근 제어자가 다름
    // protected ->public으로 수정 해줘야 함
    }
  public String getPhone() {
    return phone;
  }
  public void getPhone(int s) { 
    // 오버로딩에서 문제가 생겨서 ()써줘야함
    //위에 메소드가 있어서?
    // ()안에 무슨 타입인지 안들어가서?
  }
  // public int getID() { 
    //오버라이딩을 할 수 없음
    //static는 오버라이딩을 할 수 없다.
    
  }

public class Test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
