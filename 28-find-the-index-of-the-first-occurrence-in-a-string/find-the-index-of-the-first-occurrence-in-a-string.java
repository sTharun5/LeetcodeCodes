class Solution {
    public int strStr(String s1, String s2) {
        int i =0;
       

        while(i < s1.length()){
            int j=0;
            int k=i;
            while(j < s2.length() && k < s1.length() && s1.charAt(k) == s2.charAt(j)){
                k++;j++;
            }
            if(j == s2.length()){
                return i;
            }
            else{
                j=0;
            }
            i++;
        }
        
        return -1;
    }
}