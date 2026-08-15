class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int xorAll = 0;
        boolean hasNonZero = false;
        for (int x : nums) {
            xorAll ^= x;
            if (x != 0) hasNonZero = true;
        }
        if (xorAll != 0) return n;
        if (!hasNonZero) return 0;
        return n - 1;
    }
}