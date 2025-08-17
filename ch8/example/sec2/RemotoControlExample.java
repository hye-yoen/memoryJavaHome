package ch8.example.sec2;

public class RemotoControlExample {
    public static void main(String[] args) {
        RemotoControl rc;
        rc = new Television();
        rc.turnOn();

        rc = new Audio();
        rc.turnOn();
    }
}
