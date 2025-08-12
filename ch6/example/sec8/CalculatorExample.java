package ch6.example.sec8;

public class CalculatorExample {
    public static void main(String[] args) {
        // Calculator  객체 생성
        Calculator myCalc = new Calculator();

        //리턴값 없는 함수 호출
        myCalc.powerOn();

        int result1 = myCalc.plus(5, 6);
        System.out.println("result1 : " + result1);

        int x =10;
        int y = 4;
        double result2 = myCalc.divide(x, y);
        System.out.println("result2" + result2);

        myCalc.powerOff();

        //------------------------------------
        Calculator myCalcu = new Calculator();

        double result11 = myCalcu.areaRectangle(10);

        double result12 = myCalcu.areaRectangle(10, 20);
        System.out.println(result11);
        System.out.println(result12);

    }
}
