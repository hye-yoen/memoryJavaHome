package ch8.example.sec4;

import ch8.example.sec3.RemotoControl;

public class Television implements RemoteControl{
    private int volume;

    public void turnOn(){
        System.out.println("TV를 켭니다.");
    }

    public void turnOff(){
        System.out.println("TV를 끕니다");
    }

    public void setVolume(int volume){
        if(volume>RemoteControl.MAX_VALUME){
            this.volume = RemoteControl.MAX_VALUME;
        }
        else if ( volume<RemotoControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VALUME;
        }
        else{
            this.volume = volume;
        }
        System.out.println("현재 TV vlume" + this.volume);
    }
}
