public class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        // Loop through the haystack
        for (int i = 0; i <= n - m; i++) {
            // Check substring of same length as needle
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }

        // If not found
        return -1;
    }
}
