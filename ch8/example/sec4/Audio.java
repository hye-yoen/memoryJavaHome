package ch8.example.sec4;

public class Audio implements RemoteControl{
    private int volume;

    public void turnOn(){
        System.out.println("Audio를 켭니다.");
    }

    public void turnOff(){
        System.out.println("Audio를 끕니다");
    }

    public void setVolume(int volume){
        if(volume>RemoteControl.MAX_VALUME){
            this.volume = RemoteControl.MAX_VALUME;
        }
        else if ( volume< RemoteControl.MIN_VALUME){
            this.volume = RemoteControl.MIN_VALUME;
        }
        else{
            this.volume = volume;
        }
        System.out.println("현재 Audio vlume" + this.volume);
    }
}


