package day08;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex3 {
  public static void prn(ResultSet r) throws SQLException {//
    
    while(r.next()) {
      
    }
  }
  public static void main(String[] args) {

    String url = "";
    String user = "";
    String password = "";
    String dirver = "";

    Connection con = null;
    try {
      Class.forName(dirver);

      con = DriverManager.getConnection(url, user, password);
      
      Statement st =con.createStatement();
      
      ResultSet r = st.executeQuery("");
      
      prn(r);
      
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
    

      try {
        con.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}
