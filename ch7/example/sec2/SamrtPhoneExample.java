package ch7.example.sec2;

public class SamrtPhoneExample {
    public static void main(String[] args) {
        //SmartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
    
        System.out.println(myPhone.model);
        System.out.println(myPhone.color);

        System.out.println("와이파이 상태" + myPhone.wifi);
        //Phone으로 부터 상소받은 메소드 호출
        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("hi");
        myPhone.sendVoice("hi");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}
