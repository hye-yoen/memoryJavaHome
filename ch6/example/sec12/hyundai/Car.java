package ch6.example.sec12.hyundai;
//import문으로 다른 패키지 클래스 사용을 명시
import ch6.example.sec12.hankook.SnowTire;
import ch6.example.sec12.kumho.AllSeasonTire;


public class Car {
    ch6.example.sec12.hankook.Tire tire1 = new ch6.example.sec12.hankook.Tire();
    ch6.example.sec12.kumho.Tire tire2 = new ch6.example.sec12.kumho.Tire();
    SnowTire tire3 = new SnowTire();
    AllSeasonTire tire4 = new AllSeasonTire();
    //우와 던져버리고 싶다.... 
}
