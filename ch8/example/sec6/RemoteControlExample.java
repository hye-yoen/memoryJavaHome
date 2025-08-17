package ch8.example.sec6;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc ; 
        
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        
        rc.setMute(true);
        rc.setMute(false);
        
        System.out.println();
        
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        
        rc.setMute(true);
        rc.setMute(false);


        //정적메소드 호출
        RemoteControl.ChangeBattry();
    }
}
