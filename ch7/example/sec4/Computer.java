package ch7.example.sec4;

public class Computer extends Calculator{
    @Override
    public double areaCircle(double r){
        System.out.println("이하동문");
        return Math.PI * r *r ;
    }
}
