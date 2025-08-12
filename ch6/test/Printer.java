package ch6.test;

public class Printer {
    //16은 인스턴스 멤버 이용 -> 실행창에서 메소드 호출 필요???
    public void println(int value){
        System.out.println(value);
    }  
    
     public void println(boolean value){
        System.out.println(value);
    }   

     public void println(double value){
        System.out.println(value);
    }   

     public void println(String value){
        System.out.println(value);
    } 

    //17 정적 추가요~~ ==> 이거 알아볼것
    //     public static void println(int value){
    //     System.out.println(value);
    // }  
    
    //  public static void println(boolean value){
    //     System.out.println(value);
    // }   

    //  public static void println(double value){
    //     System.out.println(value);
    // }   

    //  public static void println(String value){
    //     System.out.println(value);
    // } 
}
