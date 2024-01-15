public class typesofconstructors {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("Amit");
        Student s3=new Student(123);
    }
}
class Student{
    String name;
    int roll;
    Student(){
        System.out.println("under non-parmeterized constructors");
    }
    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }
}
