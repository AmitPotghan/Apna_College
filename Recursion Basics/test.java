public class test {
    public static void printreverse(String str,int i){
        if (i==str.length()){
            return;
        }
        printreverse(str, i+1);
        System.out.print(str.charAt(i));

    }
    public static void main(String[] args) {
        printreverse("abcd", 0);
    }
}
