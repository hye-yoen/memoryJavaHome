package ch7.example.sec10;

public abstract class Phone {
    String owner;

    Phone(String owner){
        this.owner = owner;
    }

    void turnOn(){
        System.out.println("turn on phone");
    }
    void turnOff(){
        System.out.println("turn off phone");
    }
}

