class Solution {
    public int evalRPN(String[] tokens) {
        int a, b;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i=0;i<tokens.length;i++){
            if (tokens[i].equals("+")){
                b = stack.pop();
                a = stack.pop();
                stack.push(a+b);
            }
            else if (tokens[i].equals("-")){
                b = stack.pop();
                a = stack.pop();
                stack.push(a-b);
            }
            else if (tokens[i].equals("*")){
                b = stack.pop();
                a = stack.pop();
                stack.push(a*b);
            }
            else if (tokens[i].equals("/")){
                b = stack.pop();
                a = stack.pop();
                stack.push(a/b);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
}
