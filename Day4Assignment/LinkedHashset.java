import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset{
    public static void main(String[] args) {
        
        Set<String> li=new LinkedHashSet<>();
        li.add("Siddhi");
        li.add("Yogita");
        li.add("Pragati");
        li.add("Shravani");
        li.add("Yogita");//duplicate not allow
        li.add(null);//null allowed
        li.add(null);//repeate null not allow
        
        System.out.println("LinkedHashset:"+li);
    }
    
}

