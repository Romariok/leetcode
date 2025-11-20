class Solution {
   public int evalRPN(String[] tokens) {
       Stack<Integer> stack = new Stack<Integer>();
       int n1 = 0;
       int n2 = 0;
       for (String token : tokens) {
           switch (token) {
               case "+":
                   stack.push(stack.pop() + stack.pop());
                   break;
               case "*":
                   stack.push(stack.pop() * stack.pop());
                   break;
               case "-":
                   n2 = stack.pop();
                   n1 = stack.pop();
                   stack.push(n1 - n2);
                   break;
               case "/":
                   n2 = stack.pop();
                   n1 = stack.pop();
                   stack.push(n1 / n2);
                   break;

               default:
                   stack.push(Integer.parseInt(token));
                   break;
           }
       }

       return stack.peek();
   }
}