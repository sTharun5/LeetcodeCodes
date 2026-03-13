class Solution {
    int dp[];

    int func(int n){

         if(n<0)return 0;

         if(dp[n] != -1){
            return dp[n];
         }
        if(n==0)return 1;
        return dp[n] = func(n-1)+func(n-2);
    }
 
    public int climbStairs(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);
       return func(n);
    }
}