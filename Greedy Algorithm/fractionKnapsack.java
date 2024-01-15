import java.util.*;
public class fractionKnapsack {
    public static void main(String[] args) {
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int W=50;

        double ratio[][]=new double[val.length][2];

        for (int i=0;i<val.length;i++){
            ratio[i][0] = i;
            ratio[i][1]=val[i]/(double)weight[i];
        }
    
        //ratio must be in always descending order ,if not we sort 

        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]))  ;
        //return sorted ratio array (Ascending order); so for ratio in descending order we run reverse loop

        int Capacity=W;
        int maxValue=0;
        for (int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(weight[idx] <= Capacity){
                maxValue = maxValue + val[idx];
                Capacity = Capacity - weight[idx];
            }else{
                maxValue += (ratio[i][1] * Capacity);
            }
        }
        System.out.println("Max Value of KnapSack is:"+maxValue);
    }
}
