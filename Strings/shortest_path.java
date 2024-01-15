public class shortest_path {
    public static void shortestpath(String str){
        int x=0,y=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='E'){
                x++;
            }
            else if(str.charAt(i)=='N'){
                y++;
            }
            else if (str.charAt(i)=='W'){
                x--;
            }
            else{
                y--;
            }
        }
        int k=(x*x-0) + (y*y-0);
        double shortest=Math.sqrt(k);
        System.out.println("The shortest path is:"+shortest);

    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        shortestpath(str);
    }
}
