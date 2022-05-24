package day11;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
 
public class TestClient {
 
  public static void main(String[] args) {
    System.out.println("클라이언트 프로그램 작동.....");
 
    Socket socket = null;
    
    try {
      socket = new Socket(args[0],2022);
      System.out.println("서버에 연결 되었습니다....");
      
      InetAddress ia = socket.getInetAddress();
      int port = socket.getLocalPort();
      String ip = ia.getHostAddress();
      System.out.println("접속한 서버정보: loca port-"+port+" 서버ip-"+ip);
      
      BufferedReader reader = 
          new BufferedReader(new InputStreamReader(socket.getInputStream()));
      
      String line = reader.readLine();
      System.out.println(line);
      
    } catch (UnknownHostException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      try {
        socket.close();
        System.out.println("서버와 접속을 종료했습니다.");
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      
    }
    
   //아무키나 누를 때까지 대기합니다. 
    InputStream is = System.in; 
    try{ 
        is.read(); 
    }catch(Exception e){ 
         
    }    
    System.out.println("Client 프로그램 실행을 종료합니다.");         
 
  }
 
}