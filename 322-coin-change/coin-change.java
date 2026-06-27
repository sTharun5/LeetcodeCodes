class Solution {

    int dp[][];

    public int func(int i,int[]coins,int amount){
        if(i >= coins.length)return Integer.MAX_VALUE;
        if(amount < 0) return Integer.MAX_VALUE;
        if(amount == 0)return 0;
        if(dp[i][amount] != -1)return dp[i][amount];
        int val= func(i,coins,amount-coins[i]);
        int val2 = func(i+1,coins,amount);
        if(val != Integer.MAX_VALUE){
            val = 1 + val;
        }
         
        return dp[i][amount] = Math.min(val,val2);
    }
    public int coinChange(int[] coins, int amount) {

      dp= new int[coins.length][amount+1];

        for(int d[] : dp)
        Arrays.fill(d,-1);

        if(amount == 0)return 0;
        
         int val = func(0,coins,amount);
         if(val == Integer.MAX_VALUE)
         return -1;
         return val;
    }
}