
import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        map.put(95, "Siddhi");
        map.put(97, "Yogita");
        map.put(77, "Shravani");
        map.put(60, "Vedika");
        map.put(97,"Pragati");//key 97 override
        map.put(4,null);//null allow
        map.put(8,null);//multiple null allow
        System.out.println("HashMap"+map);
    }
    
}
