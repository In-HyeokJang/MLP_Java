package day09;

import java.util.ArrayList;

class Jumsu{
  //멤버변수
  String name;
  int kuk;
  int eng;
  int tot;
  int avg;
  //생성자
  public Jumsu(){}
  public Jumsu(String name,int kuk,int eng) {
    this.name =name;
    this.kuk=kuk;
    this.eng=eng;
    tot = kuk + eng;
    avg = tot/2;
  }
}
public class ArrayListTest {

  public static void main(String[] args) {
    Jumsu s1 = new Jumsu("초롱이",100,80);
    Jumsu s2 = new Jumsu("재은이",100,100);
    Jumsu s3 = new Jumsu("인혁이",90,100);
    
    ArrayList v = new ArrayList();
    v.add(s1);//업캐스팅
    v.add(s2);//업캐스팅
    v.add(s3);//업캐스팅
    
    for(int i =0; i<v.size();i++) {
      Jumsu s=(Jumsu)v.get(i); // 다운캐스팅 점수타입으로 형변환 해줘야 함
      System.out.print(s.name + "\t");
      System.out.print(s.kuk + "\t+");
      System.out.print(s.eng + "\t");
      System.out.print(s.tot + "\t");
      System.out.println(s.avg);
    }
  }
  }