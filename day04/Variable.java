package day04;


public class Variable {
  String movie = "트로이";
  
  public void show() {
    String movie = "영화";
    System.out.println("show 메소드영역:"+movie);
    System.out.println("show this.movie: "+this.movie );
  }
  public void title() {
    String movie = "아마겟돈";
    System.out.println("title 메소드영역:"+movie);
    System.out.println("title this.movie: "+this.movie);
  }
  public static void main(String[] args) {
    String movie = "main";
    Variable v = new Variable();
    v.show();
    v.title();
    v.title();
  }

}
