package ch7.example.sec10;

import ch7.example.sec2.SamrtPhoneExample;

public class PhoneExample {
    public static void main(String[] args) {
        //phine -> new연산자 x
        //SmartPhone new 연산자 가능 -> Phone 으로 부터 물러받은 메소드 사용사능
        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();;
        smartPhone.turnOff();

    }
}
