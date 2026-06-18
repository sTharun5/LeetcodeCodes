class Solution {
    public void reverse(StringBuilder s,int l,int r){
        while(l <= r){
            char temp = s.charAt(l);
            s.setCharAt(l,s.charAt(r));
            s.setCharAt(r,temp);
            l++;
            r--;
        }
    }
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder(s);
        reverse(str,0,str.length()-1);
        int i = 0;
        int j = 0;
        int start = 0;
        int end = 0;
      

        while(j < str.length()){
            // check for non-space character
            while(j < str.length() && str.charAt(j) == ' '){
                j++;
            }
            start = i;
            // shifting of character to space
            while(j < str.length() && str.charAt(j) != ' '){
                str.setCharAt(i,str.charAt(j));
                j++;
                i++;
            }
            if(i < str.length())
            str.setCharAt(i,' ');
            end = i - 1;
            i++;
             

            // reverse start to end
            reverse(str,start,end);
        }
       
        return new String(str.substring(0,end+1)).strip();
    }
}