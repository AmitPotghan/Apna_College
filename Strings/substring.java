public class substring {
    public static void sub_string(String str,int si,int ei){
        String substr="";
        for (int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        System.out.println(substr);
    }
    public static void main(String[] args) {
        String str="HelloWorld";
        //sub_string(str, 3, 7);

        //inbuild java function;
        System.out.println(str.substring(3,7));

    }
}
