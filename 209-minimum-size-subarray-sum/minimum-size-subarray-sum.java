class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int min = nums.length+1;
        int sum = 0;

        while(right < nums.length ){
            sum = sum + nums[right];
          
            while(sum >= target){
                sum = sum - nums[left];
                 min = Math.min(min,right-left+1);
                left++;
            }
           
            
             right++;
        }
        if(min == nums.length+1)return 0;
        return min;
    }
}