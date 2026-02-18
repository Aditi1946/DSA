import java.util.*;

class Solution {
    static String[] map = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return new ArrayList<>();
        return solve(digits, 0);
    }

    private List<String> solve(String digits, int idx) {
        if (idx == digits.length()) return Arrays.asList("");

        String letters = map[digits.charAt(idx) - '0'];
        List<String> rest = solve(digits, idx + 1);

        List<String> ans = new ArrayList<>();
        for (char c : letters.toCharArray()) {
            for (String s : rest) {
                ans.add(c + s);
            }
        }
        return ans;
    }
}
