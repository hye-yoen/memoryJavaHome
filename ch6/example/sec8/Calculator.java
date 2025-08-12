package ch6.example.sec8;

public class Calculator {
    //리턴값이 없는 메소드 선언
    void powerOn(){
        System.out.println("전원을 키다");
    }
    
    void powerOff(){
        System.out.println("전원을 끄다");
    }
    
    //호출시 두 정수 값을 전달받고, int return
    int plus(int x , int y){
        int result = x+ y;
        return result;
    }

    //이하동문
    double divide(int x , int y){
        double result = (double)x / (double)y;
        return result;
    }


    // ----------------------------------
    double areaRectangle(double width){
        return width * width;
    }

    double areaRectangle(double width, double height){
        return width* height;
    }

}
