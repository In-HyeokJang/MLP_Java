package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UPdateDB {

  public static void main(String[] args) {
    String url = "jdbc:mysql://127.0.0.1:3306/javadb?useUnicode=true&characterEncoding=utf8";
    String user ="javauser"; // mysql 이름
    String passwd = "zkfltmak12!"; // mysql 비번
    String driver = "com.mysql.cj.jdbc.Driver";

    Connection con = null; //DB연결 객체
    Statement stmt =null; //SQL전송 객체, 쿼리문 전송 객체
    
    try {
      Class.forName(driver);
      
      con = DriverManager.getConnection(url, user, passwd);
      stmt = con.createStatement();
      
      StringBuffer sql = new StringBuffer();
      sql.append(" update address ");
      sql.append(" 	set handphone = '010-5555-5555',");
      sql.append(" 		address = '터키' ");
      sql.append(" 	where addressnum = 4 ");
      
      int cnt = stmt.executeUpdate(sql.toString());
      System.out.println("레코드 "+ cnt +"개가 수정 되었습니다.");
      
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }finally {
      try {
        if(stmt !=null)stmt.close();
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
