class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
       // remember word break is something new concept of memoization..

       HashSet<String> set = new HashSet<>(wordDict);
       int max_len = 0;
       for(String word : wordDict){
          max_len =   Math.max(word.length(),max_len);
       }



       boolean dp[] = new boolean[s.length()+1];
       dp[0] = true;
       for(int i=1;i<=s.length();i++){
        int max = max_len;
        for(int j=i-1;max>=0 && j>=0;j--,max--){
            if(set.contains(s.substring(j,i)) && dp[j])
            {
                dp[i] = true;
                break;
            }
        }
       }
       return dp[s.length()];
    }
}