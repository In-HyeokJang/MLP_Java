package team;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import utility.DBClose;
import utility.DBOpen;

public class TeamDAO {
  /**
   * db의 한건의 데이터 삭제 (DML)
   * @param no의 레코드의 유일한 값 primary key
   * @return flag 성공/삭제
   */
  public boolean delete(int no) {
    boolean flag = false;
    Connection con = DBOpen.getConnection();
    PreparedStatement pstmt = null;
    
    StringBuffer sql = new StringBuffer();
    sql.append(" delete from team ");
    sql.append(" where no = ? ");
    
    try {
      pstmt = con.prepareStatement(sql.toString());
      pstmt.setInt(1, no);
      int cnt = pstmt.executeUpdate();
      if(cnt>0) flag = true;
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }finally {
      DBClose.close(pstmt, con);
    }
    
    
    return flag;    
  }

  /**
   * db의 한건의 레코드 업데이트(DML)
   * @param dto 업데이트할 데이터
   * @return flag 성공/삭제
   */
  public boolean update(TeamDTO dto) {
    boolean flag = false;
    Connection con = DBOpen.getConnection();
    PreparedStatement pstmt = null;
    
    StringBuffer sql = new StringBuffer();
    sql.append(" update team ");
    sql.append(" set phone = ?, ");
    sql.append("     email = ?, ");
    sql.append("     skils = ?, ");
    sql.append("     address = ? ");
    sql.append(" where no = ? ");
    
    try {
      pstmt = con.prepareStatement(sql.toString());
      pstmt.setString(1, dto.getPhone());
      pstmt.setString(2, dto.getEmail());
      pstmt.setString(3, dto.getSkils());
      pstmt.setString(4, dto.getAddress());
      pstmt.setInt(5, dto.getNo());
      
      int cnt = pstmt.executeUpdate(); // DB로 sql문 전송
      if(cnt>0) flag =true; // 갱신된 레코드 수가 0보다 크면 성공이다
      
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }finally {
      DBClose.close(pstmt, con);
    }
    
    
    return flag;
  }
  /**
   * db로 한건의 레코드 전송(DML)
   * @param dto 등록할 한건의 데이터
   * @return flag 성공/실패
   */
  public boolean create(TeamDTO dto) {
    boolean flag = false;
    Connection con = DBOpen.getConnection();
    PreparedStatement pstmt = null;
    
    StringBuffer sql = new StringBuffer();
    sql.append(" insert into team(name, phone, email, skils, address) ");
    sql.append(" values(?, ?, ?, ?, ?) ");
    
    try {
      pstmt = con.prepareStatement(sql.toString());// sql전송객체 생성
      pstmt.setString(1, dto.getName());
      pstmt.setString(2, dto.getPhone());
      pstmt.setString(3, dto.getEmail());
      pstmt.setString(4, dto.getSkils());
      pstmt.setString(5, dto.getAddress());
      
      int cnt = pstmt.executeUpdate(); // 전송객체에 sql문을 가지고 전송, 갱신된 레코드 수 반환
      if(cnt>0)flag = true;
      
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }finally {
      DBClose.close(pstmt, con);
    }
    
    return flag;
  }
  
 /**
  * b에서 한건의 레코드를 가져옴(DQL)
  * @param no는 유일한 primary key
  * @return 한건의 레코드
  */
  public TeamDTO read(int no) {
    TeamDTO dto = null;
    Connection con = DBOpen.getConnection();
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    
    StringBuffer sql = new StringBuffer();
    sql.append(" select * from team ");
    sql.append(" where no = ? ");
    
    try {
      pstmt=con.prepareStatement(sql.toString());
      pstmt.setInt(1, no);
      
      rs = pstmt.executeQuery();
      
      if(rs.next()) {
        dto = new TeamDTO();
        dto.setNo(rs.getInt("no"));
        dto.setName(rs.getString("name"));
        dto.setPhone(rs.getString("phone"));
        dto.setEmail(rs.getString("email"));
        dto.setSkils(rs.getString("skils"));
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
   * db에서 여러건의 레코드를 가져옴(DQL)
   * @return List 가져온 데이터
   */
// CRUD (create read(1개,전체), update, delete)
  public List<TeamDTO> list(){
    List<TeamDTO> list = new ArrayList<TeamDTO>();
    Connection con =DBOpen.getConnection();
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    
    StringBuffer sql = new StringBuffer();
    sql.append(" select no ,name, phone, email, skils ");
    sql.append("  from team ");
    sql.append(" order by name desc ");
    
    try {
      pstmt =con.prepareStatement(sql.toString());
      rs = pstmt.executeQuery();
      while(rs.next()) {
        TeamDTO dto = new TeamDTO();
        dto.setNo(rs.getInt("no"));
        dto.setName(rs.getString("name"));
        dto.setPhone(rs.getString("phone"));
        dto.setEmail(rs.getString("email"));
        dto.setSkils(rs.getString("skils"));
        
        list.add(dto);
      }
      
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }finally {
      DBClose.close(rs, pstmt, con);
    }   
    return list;
  }
}
