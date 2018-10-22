import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinStackImpl {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());   // --> Returns -3.
        minStack.pop();
        System.out.println(minStack.top());      // --> Returns 0.
        System.out.println(minStack.getMin());   // --> Returns -2.

        MinStack minStack2 = new MinStack();
        minStack2.push(-2);
        minStack2.push(0);
        minStack2.push(-1);
        System.out.println(minStack2.getMin());
        System.out.println(minStack2.top());
        minStack2.pop();
        System.out.println(minStack2.getMin());
    }

}

class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> stack;
    List<Integer> list;
    public MinStack() {
        stack = new Stack<>();
        list = new ArrayList<>();
    }

    public void push(int x) {
        stack.push(x);
        if(list.isEmpty())
            list.add(x);
        else  {
            if(list.get(list.size()-1) > x)
                list.add(x);
        }
    }

    public void pop() {
        int temp = stack.pop();
        if(list.get(list.size() - 1) == temp)
            list.remove(list.size()-1);
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return list.get(list.size()-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
