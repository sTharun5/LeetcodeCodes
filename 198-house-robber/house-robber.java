class Solution {

    public int compute(int nums[], int i,int []dp){
        if(i >= nums.length){
            return 0;
        }
        if(dp[i] != -1)return dp[i];
      int ans = dp[i] = Math.max(nums[i] + compute(nums,i+2,dp),compute(nums,i+1,dp));
      return ans;

    }
    public int rob(int[] nums) {
        int dp[] = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return compute(nums,0,dp);
    }
}