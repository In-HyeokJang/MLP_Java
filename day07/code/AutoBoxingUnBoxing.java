package day07.code;

public class AutoBoxingUnBoxing {

  public static void main(String[] args) {
    int i =10;
    Integer intObject = i;
    System.out.println(intObject); //auto Boxing
    i = intObject + 10; // UnBoxing
    System.out.println("i="+ i);

  }

}
