class Solution {
    Boolean dp[][] ;
    public boolean func(int si,int pi,String s,String p){
        if(s.length() == si && p.length() == pi)return true;

        if(dp[si][pi] != null)return dp[si][pi];

        if(p.length() == pi)return dp[si][pi] = false;

        
        
        if(s.length() == si){
            int h = pi;
            while(pi < p.length() && p.charAt(pi) == '*'){
                pi++;
            }
            return dp[si][h] = pi == p.length();
        }

        

        if(s.charAt(si) == p.charAt(pi) || p.charAt(pi) == '?')return  dp[si][pi] = func(si+1,pi+1,s,p);
        if(p.charAt(pi) == '*'){
              boolean skip = func(si, pi + 1, s, p);

            // '*' matches one character
            boolean take = func(si + 1, pi, s, p);

           return dp[si][pi] = skip || take;
        }
        return false;

    }
    
    public boolean isMatch(String s, String p) {
        dp = new Boolean[s.length()+1][p.length()+1];
        return func(0,0,s,p);
        
    }
}


// simple -> if same s+1 p+1
// if ? then also s+1 p+1
// if * then we need to check whole string with the next character of p
// if both reaches end true
// if patt reaches end false
// if s reachs end also fail but if pat has ** till last of the string 