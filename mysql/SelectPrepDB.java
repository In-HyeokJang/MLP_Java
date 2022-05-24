package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectPrepDB {

  public static void main(String[] args) {
    String url = "jdbc:mysql://127.0.0.1:3306/javadb?useUnicode=true&characterEncoding=utf8";
    String user ="javauser"; // mysql 이름
    String passwd = "zkfltmak12!"; // mysql 비번
    String driver = "com.mysql.cj.jdbc.Driver";

    Connection con = null; //db연결객체
    PreparedStatement pstmt = null;//sql 전송객체
    ResultSet rs = null;// 결과를 담는 객체
    StringBuffer sql = new StringBuffer();
    sql.append(" select addressnum, name, handphone, address ");
    sql.append(" from address ");
    sql.append(" where addressnum = ? "); // ?에 들어갈거는 값
    
    try {
      Class.forName(driver);
      con=DriverManager.getConnection(url, user, passwd);
      pstmt = con.prepareStatement(sql.toString());
      pstmt.setInt(1, 4);// 첫번째 물음표에다가 4를 넣어줘라는 뜻
      
      rs = pstmt.executeQuery();
      
      if(rs.next()) {
        int addressnum = rs.getInt(1);
        String name = rs.getString(2);
        String handphone = rs.getString(3);
        String address = rs.getString(4);
        
        System.out.println("번호: "+addressnum);
        System.out.println("이름: "+name);
        System.out.println("전화번호: "+handphone);
        System.out.println("주소: "+address);    
      }
      
      
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }finally {
      try {
        if(rs !=null)rs.close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      try {
        if(pstmt !=null)pstmt.close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      try {
       if(con !=null) con.close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
}
