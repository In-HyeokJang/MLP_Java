package mysql;

import java.sql.Connection;

import utility.DBClose;
import utility.DBOpen;

public class DriverTestMySql {

  public static void main(String[] args) {
    Connection con = null;
    
    try {
      con =DBOpen.getConnection();
      System.out.println("데이터베이스 접속이 성공했습니다.");
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }finally {
      DBClose.close(con);
    }
    
  }
}
