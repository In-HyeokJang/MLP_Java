package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatePrep {

  public static void main(String[] args) {

    //전체내용 읽어 오는거
    String url = "jdbc:mysql://127.0.0.1:3306/javadb?useUnicode=true&characterEncoding=utf8";
    String user ="javauser"; // mysql 이름
    String passwd = "zkfltmak12!"; // mysql 비번
    String driver = "com.mysql.cj.jdbc.Driver";
    
    Connection con = null;
    PreparedStatement pstmt = null;
    
    StringBuffer sql = new StringBuffer();
    sql.append(" update address ");
    sql.append("  set handphone = ?, address = ? ");
    sql.append("  where addressnum = ? ");
    
    try {
      Class.forName(driver);
      con = DriverManager.getConnection(url, user, passwd);
      pstmt = con.prepareStatement(sql.toString());
      pstmt.setString(1,"010-9999-9999");
      pstmt.setString(2, "서울");
      pstmt.setInt(3, 4);
      
      int cnt = pstmt.executeUpdate();
      System.out.println("레코드 "+cnt+"개가 수정되었습니다.");
      
      
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }finally {
      try {
        if(pstmt !=null)pstmt.close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      try {
        if(con !=null)con.close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
}

