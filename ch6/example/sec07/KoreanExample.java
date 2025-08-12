package ch6.example.sec07;

public class KoreanExample {
    public static void main(String[] args) {
        //Korean 객체 생성
        Korean k1 = new Korean("박자바", "011225-1234567");
        //Korean 객체 데이터 읽기
        System.out.println("k1.nation : "+ k1.nation);
        System.out.println("k1.name : "+ k1.name);
        System.out.println("k1.ssn : "+ k1.ssn);
        
        
    }
}
