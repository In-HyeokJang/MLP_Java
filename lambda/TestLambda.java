package lambda;
interface PrintString{
  void showString (String str);
}
public class TestLambda {

  public static void main(String[] args) {
    PrintString str = s -> System.out.println(s);
    
    str.showString("Hello");
    
    showMySting(str);
    
    PrintString reStr = returnString();
    reStr.showString("Hello");
  }

  private static PrintString returnString() {
    // TODO Auto-generated method stub
    return s->System.out.println(s + " world");
  }

  private static void showMySting(PrintString str) {
    str.showString("Hello Lambda");
    
  }
}
