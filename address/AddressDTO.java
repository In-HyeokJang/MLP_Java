package address;

public class AddressDTO {// 데이터를 가지고 이동하는거 DTO,데이터 벨류 오브젝트라고도 한다., 가방이라고 생각하면 편함
  
  private int addressnum   ;
  private String name      ;
  private String handphone ;
  private String address   ;
  
  public AddressDTO() { // 기본 생성자
    super();
  }
// 매개변수 있는 생성자 + this 까지
  public AddressDTO(int addressnum, String name, String handphone, String address) {
    super();
    this.addressnum = addressnum;
    this.name = name;
    this.handphone = handphone;
    this.address = address;
  }
  // toString 있는거 
  @Override
  public String toString() {
    return "AddressDTO [addressnum=" + addressnum + ", name=" + name + ", handphone=" + handphone + ", address="
        + address + "]";
  }
  // Setter, Getter 생성
  public int getAddressnum() {
    return addressnum;
  }
  public void setAddressnum(int addressnum) {
    this.addressnum = addressnum;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getHandphone() {
    return handphone;
  }
  public void setHandphone(String handphone) {
    this.handphone = handphone;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
}
