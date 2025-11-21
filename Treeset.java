
import java.util.Set;
import java.util.TreeSet;

public class Treeset{
    public static void main(String[] args) {
        
        Set<Integer> li=new TreeSet<>();
        li.add(95);
        li.add(97);
        li.add(47);
        li.add(5);
        li.add(97);//double value print hot nahi
        
        for(Integer n:li){
            System.out.println(n);
        }
        //System.out.println("Roll no:"+li);
    }
    
}
