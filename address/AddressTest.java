package address;

import java.util.Iterator;
import java.util.List;

public class AddressTest {
  public static void main(String[] args) {
    AddressDAO dao = new AddressDAO(); // DAO를 통해서 create 가능

    //create(dao);
    //list(dao);
    //read(dao);
    //update(dao);
    delete(dao);
  }

  private static void delete(AddressDAO dao) {
    int addressnum =4;
    if(dao.delete(addressnum)) {
      p("성공");
    }else {
      p("실패");
    }
  }

  private static void update(AddressDAO dao) {
    AddressDTO dto =dao.read(10); // workbench에 변경할 번호 맥의변수에 입력
    dto.setHandphone("000-0000-0000");
    dto.setAddress("미국");
    
    if(dao.update(dto)) {
      p("성공");
      p("-------------------");
      dto = dao.read(10);// 변경한거 확인하기 위해 다시 읽어온 후 
      p(dto); // 가져오기
    }else {
      p("실패");
    }
    
  }

  private static void read(AddressDAO dao) {
    int addressnum = 8;
    AddressDTO dto = dao.read(addressnum);
    p(dto);
    
  }

  private static void list(AddressDAO dao) {
    List<AddressDTO> list = dao.list(); // dao list mysql에 있는 걸 꺼내 준다
    // System.out.println("Address의 레코드 갯수:"+list.size()); // list에는 workbench에 있는를
    // 알려준다
    for (int i = 0; i < list.size(); i++) {
      AddressDTO dto = list.get(i);// 하나를 먼저 꺼나와서 출력하겠다
      p(dto);
      p("----------------");
    }
  }

  private static void p(AddressDTO dto) {
//    List<AddressDTO> list = dao.list(); // db목록 가져오기
//    Iterator<AddressDTO> iter = list.iterator();
//    while (iter.hasNext()) {
//      AddressDTO dto = iter.next();
//      p(dto);
//      p("------------");
//    }
//  }
    p("번호: " + dto.getAddressnum());
    p("이름: " + dto.getName());
    p("전화번호: " + dto.getHandphone());
    p("주소: " + dto.getAddress());
    // p를 메소드 생성해서 밑에로 변동 하여 간단하게 사용 가능하게 할 수있음
  }

  private static void p(String string) { // p는 오버로딩, 매개변수만 다름
    System.out.println(string); // p를 출력

  }

  private static void create(AddressDAO dao) {
    AddressDTO dto = new AddressDTO(0,"김길동","010-1234-5678","서울 강남"); // 객체 생성
    //System.out.println(dto);
    if(dao.create(dto)) {
      p("성공");      
    }else {
      p("실패");
    }

  }

}
