class Solution {
    public String convert(String s, int numRows) {

        if(s.length()==1 || numRows==1)return s;
        String ans = "";
        int n = s.length();
        for (int i = 0; i < numRows; i++) {
            int j = i;
            int flag = 1;

            while (j < n) {
                ans = ans + s.charAt(j);
                // 4 
                if (i == 0 || i == numRows - 1) {
                    j = j + (numRows - 1) * 2;
                } else if (flag % 2 == 1) {
                    j = j + ((numRows - 1) * 2) - (2 * i);
                } else {
                    j = j + (2 * i);
                }
                   flag = flag + 1;
            }
         
        

        }
        return ans;
    }
}