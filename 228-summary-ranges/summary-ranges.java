class Solution {
    public List<String> summaryRanges(int[] nums) {
        Arrays.sort(nums);
        List<String> list = new ArrayList<>();
        int i=0;
            while(i < nums.length){
            int count  = 0;
            int j=i;
            
            while(j < nums.length-1 && nums[j]+1 == nums[j+1]){
                j++;
              
                count++;
            }
           
           
            if(count == 0){
                list.add(Integer.toString(nums[j]));
                i++;
            }
            else if(count > 0){
               String temp = "";
               temp = temp + nums[i] + "->" + nums[j];
               list.add(temp);
               i=j+1;

            }
            else
            i = j+1;
        }
        return list;
    }
}