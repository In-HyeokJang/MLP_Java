package book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import team.TeamDTO;
import utility.DBClose;
import utility.DBOpen;



public class BookDAO {
  /**
   * DB에서 레코드 하나 삭제
   * @param isbn에 저장
   * @return성공/실패
   */
  public boolean delete(int isbn) {
    boolean flag = false;
    Connection con = DBOpen.getConnection();
    PreparedStatement pstmt = null;
    
    StringBuffer sql = new StringBuffer();
    sql.append(" delete from book ");
    sql.append(" where isbn = ? ");
    
    try {
      pstmt = con.prepareStatement(sql.toString());
      pstmt.setInt(1, isbn);
      
      int cnt = pstmt.executeUpdate();
      if(cnt>0) flag =true;
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }finally {
      DBClose.close(pstmt, con);
    }
    
    
    return flag;
    
  }
  /**
   * DB의 레코드 한개 수정
   * @param dto에 저장
   * @return 성공/실패
   */
  public boolean update(BookDTO dto) {
    boolean flag = false;
    Connection con = DBOpen.getConnection();
    PreparedStatement pstmt = null;
    
    StringBuffer sql = new StringBuffer();
    sql.append(" update book ");
    sql.append(" set price = ?, ");
    sql.append(" where isbn = ?  ");
    
    try {
      pstmt = con.prepareStatement(sql.toString());
      pstmt.setInt(1, dto.getPrice());
      pstmt.setInt(2, dto.getIsbn());
      
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
   * DB에서 하나의 레코드 생성
   * @param dto에 저장할 데이터
   * @return 저장이 성공/실패
   */
  
  public boolean create(BookDTO dto) {
    boolean flag = false;
    Connection con = DBOpen.getConnection();
    PreparedStatement pstmt = null;
    
    StringBuffer sql = new StringBuffer();
    sql.append(" insert into book(title, author, publisher, price, book_desc, publish_date) ");
    sql.append(" values (?, ?, ?, ? , ?, ?) ");
    
    try {
      pstmt= con.prepareStatement(sql.toString());
      pstmt.setString(1,dto.getTitle());
      pstmt.setString(2,dto.getAuthor());
      pstmt.setString(3, dto.getPublisher());
      pstmt.setInt(4, dto.getPrice());
      pstmt.setString(5, dto.getBook_desc());
      pstmt.setString(6,dto.getPublish_date());
      
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
   * db에서 하나의 레코드만 읽어오기(DQL)
   * @param isbn는 유일한 primary key
   * @return 한건의 레코드
   */
  public BookDTO read(int isbn) {
    BookDTO dto = null;
    Connection con = DBOpen.getConnection();
    PreparedStatement pstmt = null;
    ResultSet rs =null;
    
    StringBuffer sql = new StringBuffer();
    sql.append(" select * from book ");
    sql.append(" where isbn = ? ");
    
    try {
      pstmt = con.prepareStatement(sql.toString());
      pstmt.setInt(1, isbn);
      
      rs=pstmt.executeQuery();
      
      if(rs.next()) {
        dto = new BookDTO();
        dto.setIsbn(rs.getInt("isbn"));
        dto.setTitle(rs.getString("title"));
        dto.setAuthor(rs.getString("author"));
        dto.setPublisher(rs.getString("publisher"));
        dto.setPrice(rs.getInt("price"));
        dto.setBook_desc(rs.getString("book_desc"));
        dto.setPublish_date(rs.getString("publish_date"));
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
 * db에서 여러 건의 레코드 가져오기(DQL)
 * @return list 가져온 데이터
 */
  public List<BookDTO> list() {
    List<BookDTO> list = new ArrayList<BookDTO>();
    Connection con = DBOpen.getConnection();
    PreparedStatement pstmt = null;
    ResultSet rs = null;
   
    StringBuffer sql = new StringBuffer();
    sql.append(" select isbn, title, author, publisher, price, book_desc, publish_date ");
    sql.append(" from book ");      
    try {
      pstmt = con.prepareStatement(sql.toString());
      rs = pstmt.executeQuery();
      while(rs.next()) {
        BookDTO dto = new BookDTO();
        dto.setIsbn(rs.getInt("isbn"));
        dto.setTitle(rs.getString("title"));
        dto.setAuthor(rs.getString("author"));
        dto.setPublisher(rs.getString("publisher"));
        dto.setPrice(rs.getInt("price"));
        dto.setBook_desc(rs.getString("book_desc"));
        dto.setPublish_date(rs.getString("publish_date"));
        
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
