class Solution {
    public String minRemoveToMakeValid(String s) {
      Stack<Integer> st=new Stack<>();
      StringBuilder sb=new StringBuilder(s);
      for(int i=0; i<s.length(); i++){
        char ch=s.charAt(i);
        if(ch =='('){
            st.push(i);
        }else if(ch ==')'){
            if(!st.isEmpty()) st.pop();
            else sb.setCharAt(i, '*');
        }
      }  
      while(!st.isEmpty()){
        int index = st.pop();
        sb.setCharAt(index, '*');
      }
      StringBuilder str=new StringBuilder();
      for(int i=0; i<sb.length(); i++){
        if(sb.charAt(i) != '*') str.append(sb.charAt(i));
      }
      return str.toString();
    }
}