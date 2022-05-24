package homework;

public class BookTest {

  public static void main(String[] args) {
    
    BookDTO bt1 = new BookDTO ();
    bt1.setIsbn("21424\t ㅣ Java Basic\t ㅣ 김하나  ㅣ Jaen.kr \t ㅣ 15000 ㅣ Java 기본 문법 ");
    bt1.setTitle("");
    bt1.setAuthor("");
    bt1.setPublisher("");
    bt1.setPrice("");
    BookDTO bt2 = new BookDTO();
    bt2.setIsbn("");
    bt2.setTitle("33455\t ㅣ JDBC Pro\t ㅣ 김철수  ㅣ Jaen.kr \t ㅣ 23000 ㅣ ");
    bt2.setAuthor("");
    bt2.setPublisher("");
    bt2.setPrice("");
   
    BookDTO bt3 = new BookDTO();
    bt3.setIsbn("");
    bt3.setTitle("");
    bt3.setAuthor("55355\t ㅣ Servlet/JSP\t ㅣ 박자바  ㅣ Jaen.kr \t ㅣ 41000 ㅣ Model2 기반");
    bt3.setPublisher("");
    bt3.setPrice("");
    BookDTO bt4 = new BookDTO();
    bt4.setIsbn("");
    bt4.setTitle("");
    bt4.setAuthor("");
    bt4.setPublisher("35332\t ㅣ Android App\t ㅣ 홍길동  ㅣ Jaen.kr \t ㅣ 25000 ㅣ Lightweight Framework");
    bt4.setPrice("");
    BookDTO bt5 = new BookDTO();
    bt5.setIsbn("");
    bt5.setTitle("");
    bt5.setAuthor("");
    bt5.setPublisher("");
    bt5.setPrice("35355\t ㅣ OOAD분석, 설계\t ㅣ 소나무  ㅣ Jaen.kr \t ㅣ 30000 ㅣ ");
    

    System.out.println("*************도서목록*************");
   
    System.out.println(bt1.toString());
    System.out.println(bt2.toString());
    System.out.println(bt3.toString());
    System.out.println(bt4.toString());
    System.out.println(bt5.toString());
   
 
  }
}
