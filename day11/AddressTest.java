package day11;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressTest {

  public static void main(String[] args) {
    try {
      InetAddress address = InetAddress.getLocalHost();
      System.out.println("로컬 컴퓨터의 이름: "+address.getHostName());
      System.out.println("로컬 컴푸터의 IP주소: " + address.getHostAddress());
      
      address = InetAddress.getByName("java.sun.com");
      System.out.println("java.sun.com 도메인 이름과 IP주소: "+address);
      InetAddress sw[] = InetAddress.getAllByName("naver.com");
      for(int i=0;i<sw.length;i++) {
        System.out.println(sw[i]);
      }
      
    } catch (UnknownHostException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
