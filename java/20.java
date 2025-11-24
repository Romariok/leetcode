class Solution {
   public boolean isValid(String s) {
       Stack<Character> st = new Stack<Character>();
       for (char c: s.toCharArray()){
           if (st.isEmpty()){
               if(c == '}' || c == ']' || c == ')' ) return false;
               st.push(c);
               continue;
           }

           switch (c){
               case ']':
                   if (st.pop() != '[') return false;
                   break;
               case '}':
                   if (st.pop() != '{') return false;
                   break;
               case ')':
                   if (st.pop() != '(') return false;
                   break;
               default:
                   st.push(c);
                   break;
           }
       }
       return st.isEmpty();
   }
}