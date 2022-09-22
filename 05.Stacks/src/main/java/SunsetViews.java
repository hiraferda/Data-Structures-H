import java.util.ArrayList;
import java.util.Stack;

public class SunsetViews {
    public static void main(String[] args) {
        int[] buildings={3, 5, 4, 4, 3, 1, 3, 2};
        sunsetViews(buildings,"EAST").forEach(System.out::println);
    }
    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < buildings.length; i++) {
            while (!stack.isEmpty() && buildings[i]>=buildings[stack.peek()]){
                stack.pop();
            }
            stack.push(i);
        }
        //Now I have a stack with a building indicies that can see sunset
        return new ArrayList<Integer>(stack);
    }//end of module
}//end of class
