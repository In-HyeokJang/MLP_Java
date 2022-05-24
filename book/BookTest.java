package book;

import java.util.List;

public class BookTest {
  public static void main(String[] args) {
    BookDAO dao = new BookDAO();

    //list(dao);
    //read(dao);
    create(dao);
    //update(dao);
    //delete(dao);
  }

  private static void delete(BookDAO dao) {
    int isbn = 1;
    if(dao.delete(isbn)) {
      p("성공");
    }else {
      p("실패");
    }
    
  }

  private static void update(BookDAO dao) {
    BookDTO dto = dao.read(1);
    dto.setPrice(12800);
    
    if(dao.update(dto)) {
      p("성공");
      dto = dao.read(1);
      p(dto);
    }else {
      p("실패");
    }
    
  }

  private static void create(BookDAO dao) {
    BookDTO dto = new BookDTO(3,"브라질에 비가 내리면 스타벅스 주식을 사라","피터나바로","에프엔미디어",
        16200,"경제의 큰 흐름에서 기회를 잡는 매크로 투자 가이드","2022-04-25");
    if(dao.create(dto)) {
      p("성공");
    }else {
      p("실패");
    }
  }

  private static void read(BookDAO dao) {
    int isbn = 1;
    BookDTO dto =dao.read(isbn);
    p(dto);
    
  }

  private static void list(BookDAO dao) {
    List<BookDTO> list = dao.list();
    for(int i=0; i<list.size();i++) {
      BookDTO dto = list.get(i);
      p(dto);
      p("---------------");
    }
    
  }

  private static void p(String string) {
    // TODO Auto-generated method stub
    System.out.println(string);
  }

  private static void p(BookDTO dto) {
    p("도서번호: "+dto.getIsbn());
    p("도서명: "+dto.getTitle());
    p("저자: "+dto.getAuthor());
    p("출판사: "+dto.getPublisher());
    p("가격: "+dto.getPrice());
    p("상세: "+dto.getBook_desc());
    p("발행일: "+dto.getPublish_date());
  }
}
