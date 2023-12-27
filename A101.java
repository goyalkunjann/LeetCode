class Solution {
    public int minCost(String colors, int[] neededTime) {
         int ans = 0;
        int idx = 0;
        while(idx < colors.length()) {
            char curr = colors.charAt(idx);
            int maxi = neededTime[idx];
            int sum = 0;
            while(idx < colors.length()) {
                if(colors.charAt(idx) != curr) {
                    idx--;
                    break;
                }
                sum += neededTime[idx];
                maxi = Math.max(maxi, neededTime[idx]);
                idx++;
            }
            ans += sum - maxi;
            idx++;
        }
        return ans;
    }
}
