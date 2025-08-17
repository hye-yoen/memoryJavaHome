package ch7.example.sec9;

public class InstancesoExample {
    //main 메소드에서 바로 호출하기 위해 정적 메소드 선언???? 이게 뭔...?
    public static void PersonInfo(Person person){
        System.out.println("name"+ person.name);
        person.walk();

        //person이 참조하는 객체가 studnt타입인지 확인
        if (person instanceof Student student){
            System.out.println("sudentNo" + student.StudentNo);
            student.study();
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("홍길동");

        PersonInfo(p1);
        System.out.println();

        Person p2 = new Student("김길동",10);
        PersonInfo(p2);
    }

}
