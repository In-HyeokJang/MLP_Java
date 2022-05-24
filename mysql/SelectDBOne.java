package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDBOne {

  public static void main(String[] args) {
    String url = "jdbc:mysql://127.0.0.1:3306/javadb?useUnicode=true&characterEncoding=utf8";
    String user ="javauser"; // mysql 이름
    String passwd = "zkfltmak12!"; // mysql 비번
    String driver = "com.mysql.cj.jdbc.Driver";

    Connection con = null; //DB연결 객체
    Statement stmt =null; //SQL전송 객체, 쿼리문 전송 객체
    ResultSet rs = null; // DQL의 결과를 받는 객체
    
    try {
      Class.forName(driver);
      con = DriverManager.getConnection(url, user, passwd);
      stmt = con.createStatement(); //전송객체 만들기
          
      StringBuffer sql = new StringBuffer();
      sql.append(" select addressnum, name, handphone, address "); //workbench에서 가져옴
      sql.append(" from address ");
      sql.append(" where addressnum =4 ");
      
      rs =stmt.executeQuery(sql.toString());
      
      if(rs.next()) {
        int addressnum = rs.getInt(1); //첫번째 정수 컬럼
        String name = rs.getString(2); // 두번째 문자열 컬럼
        String handphone = rs.getString("handphone"); // 컬럼명으로 가져오기, sql에서 명시한 이름으로 해야 가져옴
        String address = rs.getString("address");
        System.out.println("번호: "+addressnum);
        System.out.println("성명: "+name);
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
       if(rs !=null) rs.close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      
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
