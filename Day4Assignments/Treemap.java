import java.util.*;
public class Treemap {
    public static void main(String[] args) {
        Map<Integer,String>map=new TreeMap<>();
        map.put(95, "Siddhi");//key arrange in sorted order
        map.put(97, "Yogita");
        map.put(77, "Shravani");
        map.put(60, "Vedika");
        map.put(97,"Pragati");//key 97 override
        map.put(4,null);//null allow
        map.put(8,null);//multiple null allow
        // map.put(null,"Test");null key not allowed
        System.out.println("LinkedHashMap"+map);
    }
    
}
