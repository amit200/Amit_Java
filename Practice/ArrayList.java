package Practice;
import java.util.*;
public class ArrayList {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("Harry");
        list.add("100");
        list.add("10.1");
        list.add("Harry");
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }

    private Iterator iterator() {
        return null;
    }

    private void add(String string) {
    }
}
