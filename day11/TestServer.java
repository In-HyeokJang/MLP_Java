package day11;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
 
public class TestServer {
 
  public static void main(String[] args) {
     System.out.println("***** 개발자 서버 프로그램 작동됨 *****");
     ServerSocket server = null;
     
     try {
      server = new ServerSocket(2022);
      while(true) {
        System.out.println("클라이언트 접속 대기중******");
        Socket client = server.accept(); //Lock
        
        //클라이언트 ip
        InetAddress ia = client.getInetAddress();
        String ip = ia.getHostAddress();
        int port = client.getLocalPort();
        
        System.out.println("클라이언트 정보:Local port-"+port+"ip-"+ip);
        
        //클리이언트로 환영 메세지 보내기
        BufferedWriter writer = new BufferedWriter(
        new OutputStreamWriter(client.getOutputStream()));
        
        writer.write("개발자 서버 접속 하신것을 환영합니다.");
        writer.flush();
        
        client.close(); //접속한 클라이언트와 연결 닫는다.
        
      }
      
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      try {
        server.close();
        System.out.println("서버 작동을 종료합니다.");
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
     
    //아무키나 누를 때까지 대기합니다. 
     try{ 
         InputStream is = System.in; 
         is.read(); 
     }catch(Exception e){ 
          
     } 
     System.out.println("서버 프로그램 실행을 종료합니다."); 
 
  }
 
}