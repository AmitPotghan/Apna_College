import java.util.*;
public class jobSequencing {
    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int id,int d,int p){
            this.id=id;
            deadline=d;
            profit=p;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i=0;i<jobsInfo.length;i++){
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }
        //sort on basis of profit

        Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);   // for ascending ordeer obj1.profit - obj2.profit
        
        ArrayList<Integer>seq=new ArrayList<>();
        int time=0;
        for (int i=0;i<jobsInfo.length;i++){
            Job curr=jobs.get(i);
            if (time < curr.deadline){
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("The maximum jobs are:"+seq.size());
        for (int i=0;i<seq.size();i++){
            System.out.println(seq.get(i)+" ");
        }
    }

}
