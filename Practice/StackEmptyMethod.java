package Practice;
import java.lang.*;
import java.util.Stack;

public class StackEmptyMethod {
    public static void main(String[] args) {
        Stack<Integer>stk=new Stack<>();
        boolean result=stk.empty();
        System.out.println("Is the stack empty "+result);
        stk.push(23);
        stk.push(123);
        stk.push(145);
        stk.push(45);
        System.out.println("Element in stack:"+stk);
        result=stk.empty();
        System.out.println("Is the Stack empty?"+result);
    }
}
