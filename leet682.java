
import java.util.Stack;
//栈的应用，之前用的比较少
public class leet682 {
    public static void main(String[] args) {
        String[] ops = {"5", "2", "C", "D", "+"};
        String[] test = {"36", "28", "70", "65", "C", "+", "33", "-46", "84", "C"};
        System.out.println(calPoints(test));
    }

    public static int calPoints(String[] operations) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                Integer pop = stack.pop();
                int last = stack.peek() + pop;
                stack.push(pop);
                stack.push(last);
            } else if (operations[i].equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (operations[i].equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.valueOf(operations[i]));
            }
        }
        for (Integer i : stack)
            result += i;
        return result;
    }
}
