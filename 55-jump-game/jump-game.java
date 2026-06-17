class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;

        for(int curr = 0; curr < nums.length ; curr++){
             if(max < curr) return  false;
            max = Math.max(max,curr+nums[curr]);
           
        }
        return true;

    }
}