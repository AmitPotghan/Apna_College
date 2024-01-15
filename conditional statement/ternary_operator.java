public class ternary_operator {
    public static void main(String[] args) {
        int number=99;
        String type=((number)%2 ==0)? "Even":"Odd";
        System.out.println(type);


        int marks=3;
        String rc=((marks)>=33)? "Pass":"fail";
        System.out.println(rc);
    }
}
