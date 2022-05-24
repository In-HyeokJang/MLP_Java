package lambda;

//인터페이스 생성
interface StringConcat{
  void makeString(String s1, String s2);
}

/*
// 구현 클래스
class StringConcatImpl implements StringConcat{

  @Override
  public void makeString(String s1, String s2) {
    System.out.println(s1.concat(","+s2));
    
    
  }
  
}*/
public class TestStringConcat {

  public static void main(String[] args) {
  /*  StringConcat concat = new
        StringConcatImpl();
    
    concat.makeString("Helo", "World"); */
    int i = 100; // 지역변수
    //람다식 구현
    StringConcat concat2 = (s,v) ->{ 
    System.out.println(s.concat(","+v));
    // 에러남//지역변수 변경 불가능 i=30;
    };
    concat2.makeString("Hello","Java");
    
  }
}
