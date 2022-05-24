package address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import utility.DBClose;
import utility.DBOpen;

public class AddressDAO { // CRUD(create, select, update, delete)처리하는애 mysql소통하는 애라고 생각 하면 좋음,
                          // 데이터에 접근하는 오브젝트다

  /**
   * db의 한건의 레코드 삭제(DML)
   * @param addressnum primary key
   * @return 성공/실패
   */
  public boolean delete(int addressnum) {
    boolean flag= false;
    Connection con =DBOpen.getConnection();
    PreparedStatement pstmt = null;
    
    StringBuffer sql = new StringBuffer();
    sql.append(" delete from address ");
    sql.append(" where addressnum = ? ");
    
    try {
      pstmt =con.prepareStatement(sql.toString());
      pstmt.setInt(1, addressnum);
      
      int cnt = pstmt.executeUpdate();
      if(cnt>0)flag = true;
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }finally{
      DBClose.close(pstmt, con);
    }
    
    return flag;
  }
  /**
   * 한건의 레코드 수정(업데이트)(DML)
   * @param dto 수정할 데이터
   * @return 성공/실패 의 값
   */
  public boolean update(AddressDTO dto) {
    boolean flag = false;
    Connection con = DBOpen.getConnection();
    PreparedStatement pstmt =null;
    
    StringBuffer sql = new StringBuffer();
    sql.append(" update address ");
    sql.append(" 	set   handphone = ?, ");
    sql.append(" 		    address = ? ");
    sql.append(" 	where addressnum = ? ");
    
    try {
      pstmt = con.prepareStatement(sql.toString());
      pstmt.setString(1, dto.getHandphone());
      pstmt.setString(2, dto.getAddress());
      pstmt.setInt(3, dto.getAddressnum());
      
      int cnt =pstmt.executeUpdate();
      if(cnt>0)flag = true;
      
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }DBClose.close(pstmt, con);
    return flag;
  }
  /**
   * db로 한건의 레코드 생성(DML)
   * @param dto 저장할 데이터
   * @return 저장이 성공했는지 실패했는지 값
   */
  public boolean create(AddressDTO dto) {
    boolean flag = false;
    Connection con = DBOpen.getConnection();// DB연걸
    PreparedStatement pstmt = null; // 전송객체
    
    StringBuffer sql = new StringBuffer(); //전송객체
    // 쿼리문
    sql.append(" insert into address(name, handphone, address) ");
    sql.append(" values(?, ?, ?) "); //?는 값만 연결된다.
    
    try {
      pstmt = con.prepareStatement(sql.toString());// 전송
      pstmt.setString(1, dto.getName()); // 첫번째 ?에 dto의 name필드값을 가져와서 연결한다
      pstmt.setString(2, dto.getHandphone()); // 두번째 ? 에 dto의 handphone 필드값을 가져와서 연결한다.
      pstmt.setString(3, dto.getAddress()); // 새번째 ? 에 dto의 Address의 필드값을 가져와서 연결한다.
      
      int cnt = pstmt.executeUpdate();
      if(cnt>0)flag = true; //등록 성공
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      DBClose.close(pstmt, con);
    }
    return flag;
  }
  /**
   * db에서 한 건의 레코드를 가져온다(DQL)
   * @param addressnum <-(pk값)
   * @return 한건의 레코드를 저장할 dto를 리턴한다
   */
  public AddressDTO read(int addressnum) {
    AddressDTO dto = null;
    Connection con = DBOpen.getConnection(); // DB연결객체
    PreparedStatement pstmt = null; // 전송객체
    ResultSet rs =null;
    
    //전송객체 생성
    StringBuffer sql = new StringBuffer();
    sql.append(" select addressnum, name, handphone, address ");
    sql.append(" from address ");
    sql.append(" where addressnum = ? ");
    
    try {
      pstmt = con.prepareStatement(sql.toString()); //전송객체 연결 만듬
      pstmt.setInt(1, addressnum); // ?에 넣을꺼가 무엇인지 만드는거
      
      rs=pstmt.executeQuery(); // rs에 들어감
      
      if(rs.next()) { // 데이터가 있다면 트루,없으면 펄스
        dto = new AddressDTO();
        dto.setAddressnum(rs.getInt("addressnum")); //rs에서 가져와서 addressnum을 DTO에 저장
        dto.setName(rs.getString("name"));
        dto.setHandphone(rs.getString("handphone"));
        dto.setAddress(rs.getString("address"));
      }
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }finally {
      DBClose.close(rs, pstmt, con);
    }    
    return dto;
  }
  /**
   * db에서 여러건의 레코드를 가져온다.(DQL(select문)
   * @return 여러건의 레코드를 list를 리턴한다
   */
  // 지역변수
  public List<AddressDTO> list() {
    List<AddressDTO> list = new ArrayList<AddressDTO>();// 생성자
    Connection con = DBOpen.getConnection();// DB연결객체 
    PreparedStatement pstmt = null; //전송객체 
    ResultSet rs = null; // 

    StringBuffer sql = new StringBuffer();// 객체 생성
    // 전송할 커리문 생성
    sql.append(" select addressnum, name, handphone, address ");
    sql.append(" from address ");
    sql.append(" order by name desc ");

    try {
      pstmt = con.prepareStatement(sql.toString());  //전송객체 생성
      rs = pstmt.executeQuery(); // pstmt의 해쉬코드를 통해서 Query를 받고 rs에 넣어준다
      while (rs.next()) {
        AddressDTO dto = new AddressDTO();// DTO객체생성에서 저장됨
        dto.setAddressnum(rs.getInt("addressnum")); // rs에서 get한거를 dto에 넣겠다
        dto.setName(rs.getString("name"));// get은 가져오는거 set은 저장하는거
        dto.setHandphone(rs.getString("handphone"));
        dto.setAddress(rs.getString("address"));

        list.add(dto); // DTO에 저장한 데이터를 list에 저장
      }

    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      DBClose.close(rs, pstmt, con);
    }
    return list;
  }
}