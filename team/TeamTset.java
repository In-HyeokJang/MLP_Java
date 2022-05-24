package team;

import java.util.List;


public class TeamTset {

  public static void main(String[] args) {
    TeamDAO dao = new TeamDAO();
    
    //list(dao);
    read(dao);
    //create(dao);
    //update(dao);
    //delete(dao);

}

  private static void delete(TeamDAO dao) { // 레코드 하나 삭제
    int no = 4;
    if(dao.delete(no)) {
      p("성공");
    }else {
      p("실패");
    }
  }

  private static void update(TeamDAO dao) { // 레코드 하나 수정
    TeamDTO dto = dao.read(4);
    dto.setPhone("010-1234-5678");
    dto.setEmail("00@gamil.com");
    dto.setSkils("sql");
    dto.setAddress("인천");
    
    if(dao.update(dto)) {
      p("성공");
      p("--------------");
      dto = dao.read(4);
      p(dto);
    }else {
      p("실패");
    }
  }

  private static void create(TeamDAO dao) { // 레코드 하나 생성
    TeamDTO dto = new TeamDTO("김길동","010-0000-0000","JIH@naver.com","java","서울시");
    if(dao.create(dto)) {
      p("성공");
    }else {
      p("실패");
    }
  }

  private static void read(TeamDAO dao) { // 하나의 레코드만 읽어오는거
    int no = 1;
    TeamDTO dto = dao.read(no);
    p(dto);
    
  }

  private static void list(TeamDAO dao) {
    List<TeamDTO> list = dao.list();
    //System.out.println(list.size()); //workbench의 Team의 갯수
    for(int i=0; i<list.size();i++) { // i를 workbench의 갯수만큼 for문으 돌겠다
     TeamDTO dto = list.get(i); // TeamDTO를 dto로 하고 가져온거를 담겠다 dto에다가
     p(dto);
     p("--------------");
    }
  }

  private static void p(String string) {//p("-----")꺼
    System.out.println(string);
    
  }

  private static void p(TeamDTO dto) {// p(dto)꺼
    p("번호: "+dto.getNo());
    p("이름: "+dto.getName());
    p("전화번호: "+dto.getPhone());
    p("이메일: "+dto.getEmail());
    p("보유기술: "+dto.getSkils());
   }
}
