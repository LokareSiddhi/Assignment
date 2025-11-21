import java.util.List;
import java.util.LinkedList;

public class EX3{
    public static void main(String[] args) {
        
        List<Integer> li=new LinkedList<>();
        li.add(95);
        li.add(97);
        li.add(47);
        li.add(5);
        li.add(null);
        li.add(null);
        li.add(null);
        li.add(null);

        for(Integer n:li){
            System.out.println(n);
        }
        //System.out.println("Roll no:"+li);
    }
    
}