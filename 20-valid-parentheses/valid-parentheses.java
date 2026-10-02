class Solution {
    public boolean isValid(String s) {
        Stack <Character> s1 = new Stack<>();

        for( char a : s.toCharArray()){
            if( s1.size() == 0){
                s1.push(a);
                continue;
            }

            if( a == ')' && s1.peek() == '('){
                s1.pop();
                continue;
            }
             if( a == ']' && s1.peek() == '['){
                s1.pop();
                continue;
            }
             if( a == '}' && s1.peek() == '{'){
                s1.pop();
                continue;
            }
            else s1.push(a);
        }

       return s1.size() == 0;
    }
}