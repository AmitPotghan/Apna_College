public class find_permutation {
    public static void permutation(String str,String ans){
        if (0==str.length()){
            System.out.println(ans);
        }
        for (int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newStr=str.substring(0, i) +str.substring(i+1);
            permutation(newStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str="RRDD";
        permutation(str, "");

    }
}
