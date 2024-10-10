// 17. Letter Combinations of a Phone Number
// Difficulty: Medium
// Category: Backtracking

class Solution {
    private void solve(String digit, StringBuilder output, int index, List<String> ans, String[] mapping) {
        if (index >= digit.length()) {
            ans.add(output.toString());
            return;
        }
        
        int num = digit.charAt(index) - '0';
        String value = mapping[num];
        
        for (int i = 0; i < value.length(); i++) {
            output.append(value.charAt(i));
            solve(digit, output, index + 1, ans, mapping);
            output.deleteCharAt(output.length() - 1);
        }
    }
    
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0)
            return ans;
        
        StringBuilder output = new StringBuilder();
        int i = 0;
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        solve(digits, output, i, ans, mapping);
        return ans;
    }
}