package ch5.example;

public class substring {
    public static void main(String[] args) {
        String ssn = "8880815-1234567";

        String firstrNum = ssn.substring(0,6);
        System.out.println(firstrNum);

        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
    }
    
}
