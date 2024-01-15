import java.util.*;
public class beautiful_arraylist {
    public static ArrayList<Integer> beautiful(int n){
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(1);
        for (int i=2;i<=n;i++){
            ArrayList<Integer>temp=new ArrayList<>();
            for (Integer e:ans){
                
                if (2*e<=n){
                    temp.add(2*e);
                }
            }
            for (Integer e:ans){
                if (2*e-1<=n){
                    temp.add(2*e-1);
                }
            }
            ans=temp;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(beautiful(5));

    }
}
