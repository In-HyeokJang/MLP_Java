package memo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import utility.DBClose;
import utility.DBOpen;

public class MemoDAO {

  /**
   * db로 한건의 레코드 등록(DML)
   * @param dto  등록할 한건의 레코드
   * @return 성공/실패
   */
 public boolean create(MemoDTO dto) {
   boolean flag = false;
   Connection con = DBOpen.getConnection();
   PreparedStatement pstmt = null;
   
   StringBuffer sql = new StringBuffer();
   
   sql.append(" insert into memo (wname, title, content, passwd, viewcnt, wdate) ");
   sql.append(" values (?, ?, ?, ?, ?, ?) ");
   
   try {
    pstmt =con.prepareStatement(sql.toString());
    pstmt.setString(1, dto.getWname());
    pstmt.setString(2, dto.getTitle());
    pstmt.setString(3, dto.getContent());
    pstmt.setString(4, dto.getPasswd());
    pstmt.setInt(5, dto.getViewcnt());
    pstmt.setString(6,dto.getWdate());
    
    int cnt = pstmt.executeUpdate();
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
  * db에서 한개의 레코드 가져오기 (DQL)
  * @param memono 의 pk
  * @return 한개의 레코드
  */
 public MemoDTO read(int memono) {
   MemoDTO dto = null;
   Connection con = DBOpen.getConnection();
   PreparedStatement pstmt = null;
   ResultSet rs = null;
   
   StringBuffer sql = new StringBuffer();
   sql.append(" select * from memo ");
   sql.append(" where memono = ? ");
   
   try {
    pstmt = con.prepareStatement(sql.toString());
    pstmt.setInt(1, memono);
    
    rs = pstmt.executeQuery();
    
    if(rs.next()) {
      dto = new MemoDTO();
      dto.setMemono(rs.getInt("memono"));
      dto.setWname(rs.getString("wname"));
      dto.setTitle(rs.getString("title"));
      dto.setContent(rs.getString("content"));
      dto.setPasswd(rs.getString("passwd"));
      dto.setViewcnt(rs.getInt("viewcnt"));
      dto.setWdate(rs.getString("wdate"));
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
  * DB에서 한건의 레코드 수정 (DML)
  * @param dto 수정할 데이터
  * @return 성공/실패
  */
 
 public boolean update(MemoDTO dto) {
   boolean flag = false;
   Connection con = DBOpen.getConnection();
   PreparedStatement pstmt = null;
   
   StringBuffer sql = new StringBuffer();
   sql.append(" update memo ");
   sql.append(" 	set title = ? , ");
   sql.append(" 		content = ? ");
   sql.append(" 	where memono = ? ");
   
   try {
    pstmt = con.prepareStatement(sql.toString());
    pstmt.setString(1, dto.getTitle());
    pstmt.setString(2, dto.getContent());
    pstmt.setInt(3, dto.getMemono());
    
    int cnt = pstmt.executeUpdate();
    if(cnt>0)flag=true;
  } catch (SQLException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  }finally {
    DBClose.close(pstmt, con);
  }
   return flag;
 }
 
 
 /**
  * DB에서 한건의 레코드 삭제 (DML)
  * @param memone pk값
  * @return 성공/실패
  */
 
 public boolean delete(int memono) {
   boolean flag = false;
   Connection con = DBOpen.getConnection();
   PreparedStatement pstmt = null;
   
   StringBuffer sql = new StringBuffer();
   sql.append(" delete from memo ");
   sql.append(" where memono = ? ");
   
   try {
    pstmt = con.prepareStatement(sql.toString());
    pstmt.setInt(1, memono);
    
    int cnt = pstmt.executeUpdate();
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
  * db에서 여러 건의 레코드 가져오기(DQL)
  * @return List 가져온 데이터
  */
 public List<MemoDTO> list(){
   List<MemoDTO> list = new ArrayList<MemoDTO>();
   Connection con = DBOpen.getConnection();
   PreparedStatement pstmt = null;
   ResultSet rs = null;
   
   StringBuffer sql = new StringBuffer();
   sql.append(" select wname, title, passwd, wdate ");
   sql.append(" from memo ");
   sql.append(" order by wname desc ");
   
   try {
    pstmt = con.prepareStatement(sql.toString());
    rs = pstmt.executeQuery();
    while(rs.next()) {
      MemoDTO dto = new MemoDTO();
      dto.setWname(rs.getString("wname"));
      dto.setTitle(rs.getString("title"));
      dto.setPasswd(rs.getString("passwd"));
      dto.setWdate(rs.getString("wdate"));
      
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
