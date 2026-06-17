class Solution {
    public int jump(int[] nums) {
        int currEnd = 0;
        int farthest = 0;
        int jumps = 0;

        for(int curr = 0; curr < nums.length-1; curr++){
            farthest = Math.max(farthest,curr+nums[curr]);

            if(curr == currEnd){
                jumps++;
                currEnd = farthest;
            }

        }
        return jumps;
    }
}