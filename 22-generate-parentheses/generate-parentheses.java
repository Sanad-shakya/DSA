class Solution {

    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();

        backtrack(n, 0, 0, "", ans);

        return ans;
    }

    void backtrack(int n, int open, int close,
                   String temp, List<String> ans) {

        // All n pairs are used
        if (temp.length() == 2 * n) {
            ans.add(temp);
            return;
        }

        // We can add '('
        if (open < n) {
            backtrack(n, open + 1, close,
                      temp + "(", ans);
        }

        // We can add ')' only if it is valid
        if (close < open) {
            backtrack(n, open, close + 1,
                      temp + ")", ans);
        }
    }
}