package ch8.example.sec4;

public class RemoteControlExample {
    public static void main(String[] args) {
        //인터페이스 벼수 선언
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
    
    }   
}
