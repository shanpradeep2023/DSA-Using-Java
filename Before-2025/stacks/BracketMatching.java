package stacks;

import java.util.Stack;

public class BracketMatching {
    public static boolean cheak(String s){
        Stack<Character> stack = new Stack<>();
        for(char a : s.toCharArray()){
            switch (a) {
                case '{':
                case '[':
                case '(':
                    stack.push(a);
                    break;

                case ')':
                    if(stack.isEmpty() || stack.pop() != '(')
                        return false;
                    break;
                
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{')
                        return false;
                    break;

                case ']':
                    if(stack.isEmpty() || stack.pop() != '[')
                        return false;
                    break;
            
                default:
                    break;
            }

            
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "{{[[(())]]}}";
        System.out.println(cheak(s1));
    }
}
