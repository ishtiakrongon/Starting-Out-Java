package Algorithms;
import java.util.Stack;


public class ds_Stack {
    
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        // Checking empty stacks

        // Adding elements to the stack
        stack.push("World of Warcraft");
        stack.push("Valorant");
        stack.push("League of Legends");
        stack.push("Dota 2");
        stack.push("CS::GO");

        // Checking empty stacks
        System.out.println(stack.empty());

        // Printing Stack
        System.out.println(stack);

        // remove top element
        String hateGame = stack.pop();
        System.out.println("My least playing game: " + hateGame);

        // look at the top element
        System.out.println(stack.peek());

    }

}
