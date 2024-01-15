public class largest_string {
    public static String largestString(String []fruits){
        String largest=fruits[0];
        for (int i=0;i<fruits.length;i++){
            if (largest.compareTo(fruits[i]) < 0){
                largest=fruits[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        String fruits[]={"apple","banana","z"};
        System.out.println(largestString(fruits));

    }
}
