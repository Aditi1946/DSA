class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxar = 0;
        
        while (i < j) {
            int currar = Math.min(height[i], height[j]) * (j - i);
            maxar = Math.max(maxar, currar);
            
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;  // <-- This is the correction
            }
        }
        
        return maxar;
    }
}
