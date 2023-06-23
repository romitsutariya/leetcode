import java.util.Stack;
class Solution {
    public boolean backspaceCompare(String s, String t) {
        if(s==null || t==null){
            return false;
        }
         s=getFinalString(s);
         t=getFinalString(t);
         return s.equals(t);
    }

     private static String getFinalString(String input) {
        Stack<Character> stack =new Stack<>();
        char ch[] =input.toCharArray();
        
        for (int i = 0; i < ch.length; i++) {
                if(ch[i]!='#'){
                    stack.push(Character.valueOf(ch[i]));
                }

                if(ch[i]=='#' && !stack.isEmpty()){
                    stack.pop();
                }
        }
        StringBuilder sb= new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}