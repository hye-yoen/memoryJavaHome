package ch8.example.sec7;

public interface Service {
    default void defaultMethod1(){
        System.out.println("defaultMethod1 증복 코드");
        defaultCommon();
    }

    default void defaultMethod2(){
        System.out.println("defaultMethod2 중복 코드");
        defaultCommon();
    }

    //private메소드
    private void defaultCommon(){
        System.out.println("defaultMethod 중복코드 A");
        System.out.println("defaultMethod 중복코드 B");
    }

    //정적 메소드
    static void staticMethod1(){
        System.out.println("staticMethod1 중복 코드");
        staticCommon();
    }
    static void staticMethod2(){
        System.out.println("staticMethod1 중복 코드");
        staticCommon();
    }

    private static void staticCommon(){
        System.out.println("staticMethod 중복 코드 C");
        System.out.println("staticMethod 중복 코드 D");
    }
}
