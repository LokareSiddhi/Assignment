import java.util.HashSet;
import java.util.Set;

public class Hashset{
    public static void main(String[] args) {
        
        Set<Integer> li=new HashSet<>();
        li.add(95);
        li.add(97);
        li.add(47);
        li.add(5);
        li.add(97);//double value print hot nahi ani order pn maintain nahi
        
        for(Integer n:li){
            System.out.println(n);
        }
        //System.out.println("Roll no:"+li);
    }
    
}

