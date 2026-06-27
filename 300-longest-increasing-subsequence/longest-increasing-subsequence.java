class Solution {
    int dp[][];
    int compute(int i,int prevInd,int[]nums){
        if(i >= nums.length)return 0;
        
        int val = 0;
        int val2 = 0;
        if(dp[prevInd+1][i] != -1){
            return dp[prevInd+1][i]; 
        }

        if(prevInd == -1 || nums[i] > nums[prevInd]){
           val = 1 +  compute(i+1,i,nums);
        }
       
        
        val2 = compute(i+1,prevInd,nums);
        

        return dp[prevInd+1][i] =  Math.max(val,val2);
    }
    public int lengthOfLIS(int[] nums) {
        dp = new int[nums.length+1][nums.length+1];
        for(int d[] : dp){
            Arrays.fill(d,-1);
        }
        return compute(0,-1,nums);
    }
}