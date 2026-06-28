class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums)set.add(i);
        int max = 0;

        for(int i=0;i<nums.length;i++){

            if(!set.contains(nums[i]-1)){
                int count = 1;
                int j = 1;
                while(set.contains(nums[i]+j)){
                    set.remove(nums[i]+j);
                    count++;
                    j++;
                   
                }
                max = max < count ? count : max;

            }
        }

        return max;



    }
}