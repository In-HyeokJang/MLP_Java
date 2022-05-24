package team;

public class TeamDTO { //기본생성자, 지역변수 있는 생성자, toString, setter,getter 생성
                        
  private int    no     ;
  private String name   ;
  private String phone  ;
  private String email  ;
  private String skils  ;
  private String address;
 
  public TeamDTO() {
    super();
  }

  public TeamDTO(String name, String phone, String email, String skils, String address) {
    super();
    this.name = name;
    this.phone = phone;
    this.email = email;
    this.skils = skils;
    this.address = address;
  }

  @Override
  public String toString() {
    return "TeamDTO [no=" + no + ", name=" + name + ", phone=" + phone + ", email=" + email + ", skils=" + skils
        + ", address=" + address + "]";
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSkils() {
    return skils;
  }

  public void setSkils(String skils) {
    this.skils = skils;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
