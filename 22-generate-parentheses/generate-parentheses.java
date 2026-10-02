class Solution {

    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();

       solve(n, 0, 0, "", ans);

        return ans;
    }

    void solve(int n, int a, int b,
                   String temp, List<String> ans) {

        
        if (temp.length() == 2 * n) {
            ans.add(temp);
            return;
        }

           if(a > n || b > n ){
             return;
           }

        {
             if( a < n ){
           solve(n, a + 1, b,temp + "(", ans );
             }
        }
        {
       if(b < a){
           solve(n, a, b + 1 , temp + ")", ans);
       }

        }
        }
        }
        

      
    
