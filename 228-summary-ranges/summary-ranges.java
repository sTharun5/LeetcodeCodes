class Solution {
    public List<String> summaryRanges(int[] nums) {
        int i=0;
        int j=1;
        int flag=0;
        List<String> ans = new ArrayList<>();

        while(i < nums.length ){

            
            flag=0;
            int k = i;
            while(j < nums.length && 1 + nums[k] == nums[j]){
                flag=1;
                k++;
                j++;

            }

            if(flag == 0){
                ans.add("" + nums[i]);
                i++;
                j++;
            }
            else{
                if(j <= nums.length){
                String a = "" + nums[i] + "->" + nums[j-1];
                ans.add(a);
                }
                 i = j;
                 j++;
            }
               

        }
        
         return ans;


    }
}