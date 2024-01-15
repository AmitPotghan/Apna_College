public class removeduplicates {
    public static void removeDuplicates(String str,int index,StringBuilder newstr,boolean map[]){
        if (index == str.length()){
            System.out.println(newstr);
            return;
        }
        char currentchar=str.charAt(index);
        if (map[currentchar - 'a'] == true){
            //duplicate;
            removeDuplicates(str, index + 1, newstr, map);
        }else{
            map[currentchar - 'a']=true;
            removeDuplicates(str, index+1, newstr.append(currentchar), map);
        }
    }
    public static void main(String[] args) {
        String str="appnnacollege";
        boolean arr[]=new boolean[26];
        removeDuplicates(str, 0, new StringBuilder(""),arr);
    }
}
