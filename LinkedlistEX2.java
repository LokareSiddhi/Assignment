import java.util.List;
import java.util.LinkedList;

public class LinkedlistEX2{
    public static void main(String[] args) {
        
        List<Integer> li=new LinkedList<>();
        li.add(95);
        li.add(97);
        li.add(47);
        li.add(5);
        for(int i=0;i<li.size();i++){
            System.out.println(i +":"+li.get(i));
        }
        //System.out.println("Roll no:"+li);
    }
    
}

