class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String res = "1";
        
        for (int i = 2; i <= n; i++) {
            StringBuilder curr = new StringBuilder();
            int count = 1;
            char prev = res.charAt(0);
            
            for (int j = 1; j < res.length(); j++) {
                if (res.charAt(j) == prev) {
                    count++;
                } else {
                    curr.append(count).append(prev);
                    prev = res.charAt(j);
                    count = 1;
                }
            }
            curr.append(count).append(prev);
            res = curr.toString();
        }
        return res;
    }
}
