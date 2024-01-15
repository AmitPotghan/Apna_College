public class compression_string {
    public static void string_compression(String str){
        String newstr="";
        for (int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newstr+=str.charAt(i);
            if (count>1){
                newstr+=count.toString();

            }
        }
        System.out.println(newstr);
    }
    public static void string_compression_b(String str){
        StringBuilder sb=new StringBuilder("");
        for (int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count>1){
                sb.append(count.toString());
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String str="aaabbbccd";
        string_compression_b(str);

    }
}
