public class Constructors {
    public static void main(String[] args) {
        Student std1 = new Student(101, "John Cena", "15");
        std1.studentInfo();
        Student std2 = new Student(102, "The Undertaker");
        std2.studentInfo();
    }
}
class Student{
    private int rollNo;
    private String name;
    private String age;

    public Student(int rollNo, String name, String age){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }
    public Student(int rollNo, String name){
        this(rollNo, name, "18");
    }
    public void studentInfo(){
        System.out.println("Name = " + this.name + ", Roll No = " + this.rollNo + ", Age = " + this.age);
    }
}
