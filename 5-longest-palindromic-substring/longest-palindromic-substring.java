class Solution {

    public String compute(String s,int i,int j){
        int flag = 0;
        while(i >= 0 && j<s.length() && s.charAt(i) == s.charAt(j)){
            flag =1;
            i--;
            j++;
        }
        if(flag==1)
        return s.substring(i+1,j);
        return "";
    }
    public String longestPalindrome(String s) {
        String ans = "";
        

        for(int i=0;i<s.length();i++){
            String max1 = compute(s,i,i);
            String max2 = compute(s,i,i+1);
            if(ans.length() < max1.length()){
                ans = new String(max1);
            }
            if(ans.length() < max2.length()){
                ans = new String(max2);
            }
        }
        return ans;
    }
}