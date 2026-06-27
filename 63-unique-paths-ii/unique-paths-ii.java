class Solution {
    int dp[][];

    int paths(int i,int j,int[][] nums){
        if(i >= nums.length || i<0 || j >= nums[0].length || j< 0 )return 0;
        if(nums[i][j] == 1) return 0;
        if(dp[i][j] != -1)return dp[i][j];
        if(i == nums.length-1 && j == nums[0].length-1 && nums[i][j] == 0)return 1;

        return dp[i][j] = paths(i+1,j,nums) + paths(i,j+1,nums);
    }
    public int uniquePathsWithObstacles(int[][] nums) {
        dp = new int[nums.length+1][nums[0].length+1];

        for(int d[] : dp){
            Arrays.fill(d,-1);
        }

        return paths(0,0,nums);
    }
}