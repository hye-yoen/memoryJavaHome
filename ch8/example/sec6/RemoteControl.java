package ch8.example.sec6;

public interface RemoteControl {
    //상수 필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //추상 메소드
    void turnOn();
    void setVolume(int volume);
    void turnOff();

    //디폴트 인스턴스 메소드
    default void setMute(boolean mute){
        if(mute){
            System.out.println("무음 처리");
            setVolume(MIN_VOLUME);
        }
        else{
            System.out.println("무음해제");
        }
    }

    //정적메소드
    static void ChangeBattry(){
        System.out.println("리모콘 건전지 교환");
    }
    
}
