package memo;

import java.util.List;

public class MemoTest {

  public static void main(String[] args) {
    MemoDAO dao =new MemoDAO();
    
   // list(dao);
    //read(dao);
    create(dao);
    //update(dao);
    //delete(dao);
  }

  private static void delete(MemoDAO dao) {
    int memono = 2;
    if(dao.delete(memono)) {
      p("성공");
    }else {
      p("실패");
    }
    
  }

  private static void update(MemoDAO dao) {
    MemoDTO dto = dao.read(4);
    dto.setTitle("MySQL수업");
    dto.setContent("SQL");
    
    if(dao.update(dto)) {
      p("성공");
      p("-----------------");
      dto = dao.read(4);
      p(dto);
    }else {
      p("실패");
    }
    
  }

  private static void create(MemoDAO dao) {
    MemoDTO dto = new MemoDTO(0,"홍길동","myslq 수업2222","DAO,DTO 설정합니다222","1234",0,"2022-04-28");
    if(dao.create(dto)) {
      p("성공");
      p("--------------");
      p(dto);
    }else {
      p("실패");
    }
    
  }

  private static void read(MemoDAO dao) {
    int memono = 4;
    MemoDTO dto = dao.read(memono);
    p(dto);
    
    
  }

  private static void list(MemoDAO dao) {
    List<MemoDTO> list = dao.list();
    //System.out.println(list.size());// 3개 확인
    for(int i=0; i<list.size(); i++) {
      MemoDTO dto = list.get(i);
      p(dto);
      p("----------");
      
    }
    
  }

  private static void p(String string) {
    System.out.println(string);
    
  }

  private static void p(MemoDTO dto) {
   p("이름: "+ dto.getWname());
   p("타이틀: "+ dto.getTitle());
   p("비밀번호: "+ dto.getPasswd());
   p("날짜: "+dto.getWdate());
    
  }
}
