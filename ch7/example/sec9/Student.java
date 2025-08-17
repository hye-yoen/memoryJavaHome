package ch7.example.sec9;

public class Student extends Person{
    public int StudentNo;
    
    public Student(String name,int StudentNo){
        super(name);
        this.StudentNo = StudentNo
        ;

    }

    public void study(){
        System.out.println("studing");
    }
}
