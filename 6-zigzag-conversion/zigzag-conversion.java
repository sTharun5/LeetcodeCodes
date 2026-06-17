class Solution {
    public String convert(String s, int numRows) {
        String ans = "";
        if(numRows == 1)return s;

        for(int i=0;i<numRows;i++){
            int flag=1;
            int j = i;
            while(j < s.length()){
                ans = ans + s.charAt(j);
                if(i == 0 || i == numRows-1){
                    j = j + (numRows-1)*2;
                }
                else if(flag%2!=0){
                    j = j +  (numRows-1)*2 - (2*i);
                }
                else{
                    j = j+ (2*i);
                }
                flag++;
            }
        }
        return ans;
    }
}