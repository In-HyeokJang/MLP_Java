package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectPrepList {

  public static void main(String[] args) {

    //전체내용 읽어 오는거
    String url = "jdbc:mysql://127.0.0.1:3306/javadb?useUnicode=true&characterEncoding=utf8";
    String user ="javauser"; // mysql 이름
    String passwd = "zkfltmak12!"; // mysql 비번
    String driver = "com.mysql.cj.jdbc.Driver";
    
    Connection con = null;
    PreparedStatement pstmt =null;
    ResultSet rs = null;
    StringBuffer sql = new StringBuffer();
    sql.append(" select addressnum, name, handphone, address ");
    sql.append(" from address ");
    sql.append(" order by name desc ");
    
    try {
      Class.forName(driver);
      con =DriverManager.getConnection(url, user, passwd);
      pstmt = con.prepareStatement(sql.toString());
      
      rs = pstmt.executeQuery();
      
      while(rs.next()) {
        int addressnum = rs.getInt(1);
        String name = rs.getString(2);
        String handphone = rs.getString(3);
        String address = rs.getString(4);
        
        System.out.println("번호: "+ addressnum);
        System.out.println("이름: "+ name);
        System.out.println("전화번호: "+ handphone);
        System.out.println("주소: "+ address);
        System.out.println("---------------------");
      }
      
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }finally{
      try {
       if(rs !=null) rs.close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      try {
       if(pstmt !=null) pstmt.close();
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
