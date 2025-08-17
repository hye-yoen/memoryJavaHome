package ch8.example.sec4;

public interface RemoteControl {
    //상수 필드
    int MAX_VALUME = 10;
    int MIN_VALUME = 0;

    //추상 메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
