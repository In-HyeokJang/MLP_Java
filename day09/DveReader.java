package day09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 결과 파일을 읽어와서 표준출력장치에 출력한다.
 * @author win64
 *
 */
public class DveReader {

  public static void main(String[] args) {
    String filename = "C:/Aistudy_JIH/java/dev_output.txt";
    
    try {
      FileReader fr = new FileReader(filename);
      BufferedReader br = new BufferedReader(fr);
      
      while(true) {
        String line =br.readLine();
        
        if(line == null) break;
        
        System.out.println(line);
      }
      br.close();
      fr.close();
    }catch(FileNotFoundException e) {
      e.printStackTrace();
    }catch(Exception e) {
      e.printStackTrace();
    }
    
    
  }
}
