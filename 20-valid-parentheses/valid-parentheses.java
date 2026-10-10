class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                stack.push(')');
            }
            else if(s.charAt(i) == '['){
                stack.push(']');
            }
            else if(s.charAt(i) == '{'){
                stack.push('}');
            }
            else{
                if(stack.size() == 0)return false;
                if(stack.peek() == s.charAt(i) || stack.peek() == s.charAt(i) || stack.peek() == s.charAt(i)){
                    stack.pop();
                    continue;
                }
                else
                return false;
            }
        }
        return stack.size() == 0;
    }
}