package day07;
class ThisData{ 
    int i; 
    int j; 
    int k; 
     
    //ⓐ 
    public ThisData(){ // 생성자
        this.i=0; 
        this.j=0; 
        this.k=0; 
    } 
     
    //ⓑ 
    public ThisData(int i){ // 생성자 
        this.i=i; 
    } 
     
    //ⓒ 
    public ThisData(int i, int j){ //생성자
        this(i);  //ⓑ 호출되어 초기화됩니다. 
        this.j=j; 
    } 
} 

public class ThisExam { 
    public static void main(String[] args) { 
        ThisData od = new ThisData(100, 90); 
         
        System.out.println("od.i: " + od.i); 
        System.out.println("od.j: " + od.j); 
        System.out.println("od.k: " + od.k);         
    } 
} 