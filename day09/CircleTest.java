package day09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Circle implements Serializable{
  int xPos;
  int yPos;
  double red;
  Circle(int x, int y, double r){//생성자
    xPos = x;
    yPos = y;
    red = r;
  }
  public void showCircleInfo() {//메소드
    System.out.printf("[%d,%d]",xPos,yPos);
    System.out.println("red : "+red);
  }
}
public class CircleTest {

  public static void main(String[] args) {
    try {
      ObjectOutputStream out = 
          new ObjectOutputStream(new FileOutputStream("object.ser"));
    //객체를 직열화 해서 파일을 내보내는 것
      out.writeObject(new Circle(1,1,2.4));
      out.writeObject(new Circle(2,2,4.8));
      out.writeObject(new String("String implements serializeble"));
      out.close();
      ObjectInputStream in = new ObjectInputStream(
          new FileInputStream("object.ser"));
      Circle c1 = (Circle)in.readObject();// 다운캐스팅 됨
      Circle c2 = (Circle)in.readObject();// 다운캐스팅 됨
      String str = (String)in.readObject();// 다운 캐스팅 됨      
      in.close();
     
      c1.showCircleInfo();
      c2.showCircleInfo();
      System.out.println(str);
      
      
      
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
