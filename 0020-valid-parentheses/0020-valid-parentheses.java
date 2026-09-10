class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        int n = s.length();

        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            } else {
                if(st.isEmpty()){
                    return false;
                } else if(c==')' && st.peek()!='('){
                    return false;
                }
                else if(c=='}' && st.peek()!='{'){
                    return false;
                }
                else if(c==']' && st.peek()!='['){
                    return false;
                  }
                  st.pop();
                  }  
                }
                if(st.isEmpty()){
                    return true;
                } else {
                    return false;
                }
                
            }
        }
        
    
