import java.util.*;
class Activity_Selection{
    public static void main(String[]args){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};   //sorted

        ArrayList <Integer> ans = new ArrayList<>();
        int maxActivity=1; //as first activity has to be performed
        ans.add(0);
        int lastEnd = end[0];

        for (int i=1;i<end.length;i++){
            if (start[i]>=lastEnd){
                maxActivity++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("Total no of Activities Performed:"+maxActivity);
        for (int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }

    }
}
//if end is not sorted according to start 


// public static void main(String[]args){
//         int start[]={1,3,0,5,8,5};
//         int end[]={2,4,6,7,9,9};   //sorted

//         //if end array is not sorted in according with start
//         //sorting
//         int activities[][]=new int[start.length][3];
//         for (int i=0;i<start.length;i++){
//             activities[i][0] = i;
//             activities[i][1] = start[i];
//             activities[i][2] = end[i];
//         }
//         //for sorting array
//         Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));

//         ArrayList <Integer> ans = new ArrayList<>();
//         int maxActivity=1; //as first activity has to be performed
//         ans.add(activities[0][0]);
//         int lastEnd = activities[0][2];

//         for (int i=1;i<end.length;i++){
//             if (activities[i][1]>=lastEnd){
//                 maxActivity++;
//                 ans.add(activities[i][0]);
//                 lastEnd = activities[i][2];
//             }
//         }
//         System.out.println("Total no of Activities Performed:"+maxActivity);
//         for (int i=0;i<ans.size();i++){
//             System.out.print("A"+ans.get(i)+" ");
//         }