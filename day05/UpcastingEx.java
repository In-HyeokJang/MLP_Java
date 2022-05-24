package day05;
//부모 클래스
class  Person {
  String name;
  String id;

  public Person(String name) {// 생성자
  this.name = name;
   }
}
//자식 클래스
class  Student extends Person {
  String grade;
  String department;

  public Student(String name) {// 생성자
  super(name);
   }
}

public class UpcastingEx {
  public static void main(String[] args) {
    
  
    Person p;
    Student s = new Student("홍길동");
    p = s; // 업캐스팅

    System.out.println(p.name); // 오류 없음
    //  p.grade = 'A';
    //  p.department = "COM";
//    Student s2 = (Student)p; // 다운캐스팅 부모,자식 다 접근
//    s2.grade = "A";
//    s2.department = "COM";
  }

}
