
public class largest_element {
    public static int get_largest(int array[]){
        int largest=Integer.MIN_VALUE; //-infinity
        for (int i=0;i<array.length;i++){
            if (array[i]>largest){
                largest=array[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={10,6,98,65,78,20,6};

        System.out.println("The greatest Number in an array is:"+get_largest(numbers));
    }
}
