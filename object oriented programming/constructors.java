public class constructors {
    public static void main(String[] args) {
        Student s1=new Student("Amit");
        System.out.println(s1.name);
        
    }
}
class Student{
    String name;
    int roll;
    Student(){
        System.out.println("Constructors is called...");
    }
    Student (String name){
        this.name=name;
    }
}