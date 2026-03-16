class Solution {
    int dp[][];
    int func(int i,int j,int m,int n){
        if(i>=m || j >= n)
        return  0;

          if(i==m-1 && j== n-1)
        return dp[i][j] = 1;


        if(dp[i][j] != 0){
            return dp[i][j];
        }

      

   
        return  dp[i][j] = func(i+1,j,m,n) + func(i,j+1,m,n);
    }
    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        for(int x[] : dp){
            Arrays.fill(x,0);
        }
        return func(0,0,m,n);
        
    }
}