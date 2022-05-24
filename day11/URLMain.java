package day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class URLMain {

  public static void main(String[] args) {
    try {
      URL url = new URL("https://www.naver.com");//인터넷 주소 객체
      System.out.println("Port: "+url.getPort());
      System.out.println("Protocal: "+url.getProtocol());
      System.out.println("HostName: "+url.getHost());
      System.out.println("File: "+url.getFile());
      
      String temp;
      BufferedReader br =
          new BufferedReader(new InputStreamReader(
              url.openStream(),"UTF-8"));
      
      while((temp =br.readLine())!=null){
        System.out.println(temp);
      }
      br.close();
      
    } catch (MalformedURLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (UnsupportedEncodingException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
