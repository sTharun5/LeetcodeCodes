class Solution {
    int dp[][];
    public int compute(int i, int j, String word1, String word2) {
        if (i == word1.length())
            return word2.length() - j;

        if (j == word2.length())
            return word1.length() - i;

        if(dp[i][j] != -1)return dp[i][j];

        int computer = word1.length() + word2.length();
        int computers = word1.length() + word2.length();

        if (word1.charAt(i) == word2.charAt(j)) {
            computers = compute(i + 1, j + 1, word1, word2);
        }

        else {
            int min1 = compute(i + 1, j, word1, word2);
            int min2 = compute(i, j + 1, word1, word2);
            int min3 = compute(i + 1, j + 1, word1, word2);
            computer = 1 + Math.min(min1, Math.min(min2, min3));
        }
        return dp[i][j] = Math.min(computer, computers);
    }

    public int minDistance(String word1, String word2) {

        dp = new int[word1.length()+1][word2.length()+1];
        for(int d[] : dp){
            Arrays.fill(d,-1);
        }
        if (word1.length() == 0)
            return word2.length();
        if (word2.length() == 0)
            return word1.length();

        return compute(0, 0, word1, word2);
    }

}