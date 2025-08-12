package ch7.example.sec6.package2;

import ch7.example.sec6.package1.A;

public class D extends A{ //다른 패키지는 원래 불가 but 자식클래스는 가능 0
    public D(){
        //A() 생성자 호출 (new를 이용해 직접 호출 불가)
        super();
    }
    
    public void method1(){
        //A 필드 값 변경
        this.field = "value";
        //A 메소드 호출
        this.method();

    }

    //   public void method(){
    //     A a = new A();       //직접 객체 생성x
    //     a.field = "value";
    //     a.method();
    // }
}
