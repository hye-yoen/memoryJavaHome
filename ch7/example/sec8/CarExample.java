package ch7.example.sec8;

public class CarExample {
    public static void main(String[] args) {
        // car 객체 생성
        Car mycar = new Car();

        // Tire 객체 장착
        mycar.tire = new Tire();
        mycar.run();

        //Hankook 객체 장착
        mycar.tire = new HankookTire();
        mycar.run();

        //K... 객체 장착
        mycar.tire = new KumhoTire();
        mycar.run();
    } 
}
