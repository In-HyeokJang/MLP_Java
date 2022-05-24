package day08.code;
interface MobilePhone{
  boolean sendCall(); // public 생략
  boolean receiveCall();// public 생략
  boolean sendSMS();// public 생략
  boolean receiveSMS();// public 생략
}
interface MP3{
  void play();// public 생략
  void stop();// public 생략
}
class PDA{
  public int calculate(int x, int y) {
    return x+y;
  }
}

public class SmartPhone extends PDA implements MobilePhone, MP3{

  //MobilePhone의 추상 메소드 구현
   @Override
  public void play() {
    // TODO Auto-generated method stub
    System.out.println("음악재생");
  }

  @Override
  public void stop() {
    // TODO Auto-generated method stub
    System.out.println("음악중지");
  }

  @Override
  public boolean sendCall() {
    System.out.println("call");
    return false;
  }

  @Override
  public boolean receiveCall() {
    System.out.println("receive");
    return false;
  }

  @Override
  public boolean sendSMS() {
    System.out.println("sendSMS");
    return false;
  }

  @Override
  public boolean receiveSMS() {
    System.out.println("recivesSMS");
    return false;
  }
  //메소드 추가
  public void scheduler() {
    System.out.println("일정관리");
  }
  public void applicationManager() {
    System.out.println("어플리케이션 설치/삭제");
  }
  public static void main(String[] args) {
    SmartPhone sp = new SmartPhone();
    sp.sendCall();
    sp.play();
    sp.calculate(3, 5);
    sp.applicationManager();
    
  }
  
}
