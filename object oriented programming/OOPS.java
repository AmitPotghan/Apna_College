public class OOPS{
    public static void main(String[] args) {
        pen p=new pen();
        p.setcolor("blue");
        p.settip(5);
        System.out.println(p.color);
        System.out.println(p.tip);
    }
}
class pen{
    String color;
    int tip;

    void setcolor(String newcolor){
        color=newcolor;
    }

    void settip(int t){
        tip=t;
    }
}