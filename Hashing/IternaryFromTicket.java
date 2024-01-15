import java.util.*;
public class IternaryFromTicket {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("Chennai","Bengaluru");
        map.put("Mumbai","Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi", "Goa");

        HashMap<String,String> mapRev = new HashMap<>();
        for (String key:map.keySet()){
            mapRev.put(map.get(key),key);
        }
        

        String start="";
        for (String s:map.keySet()){
            if (!mapRev.containsKey(s)){
                start = s;
            }
        }
        System.out.print(start);

        for (String key:map.keySet()){
            System.out.print("-->"+map.get(start));
            //update start
            start = map.get(start);
        }


    }
}
