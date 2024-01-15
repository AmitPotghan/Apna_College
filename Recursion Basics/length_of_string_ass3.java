public class length_of_string_ass3 {
    public static void Length_of_String(String str,int index,int count){
        if (index == str.length()){
            System.out.println(count);
            return;
        }
        
        Length_of_String(str, index+1,count+1);
    }
    public static void main(String[] args) {
        String str="Amit";
        Length_of_String(str, 0,0);
    }
}
