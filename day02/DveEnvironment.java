package day02;

public class DveEnvironment {

  public static void main(String[] args) {
    
    String[] lang = new String[3];
    String[] script =new String[3];
    String[] dbms = {"Oracle","ms-sql","my-sql"};
    
    lang[0] = "java"; lang[1]="C#"; lang[2]="C";
    script[0] ="JSP"; script[1]="ASP.NET"; script[2]="PHP";
    
    for(int i=0; i <= 2; i++) {
      System.out.println(lang[i] + "-"+script[i]+"-"+dbms[i]);
    }

  }

}
