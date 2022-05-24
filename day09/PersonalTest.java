package day09;

import java.io.Serializable;

class Personsal implements Serializable{
  String name;
  transient String secretInfo;
  int age;
  transient int secretNum;
  
  //생성자 선언
  Personsal(String name, String sinfo, int age, int snum){
    this.name =name;
    secretInfo = sinfo;
    this.age=age;
    secretNum = snum;
  }
}
public class PersonalTest {

  public static void main(String[] args) {
    
  }
}
