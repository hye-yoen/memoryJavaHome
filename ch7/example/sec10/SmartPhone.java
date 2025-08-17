package ch7.example.sec10;

public class SmartPhone extends Phone{
    SmartPhone(String owner){
        super(owner);
    }

    void internetSearch(){
        System.out.println("인터넷을 검색을 합니다.");
    }
}
