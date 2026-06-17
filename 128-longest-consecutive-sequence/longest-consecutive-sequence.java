class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        int cnt = 0;
        int maxLen = 0;

        for(Integer i : nums){
            set.add(i);
        }

        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                cnt=1;
                int j = 1;
                set.remove(nums[i]);
                while(set.contains(nums[i]+j)){
                    cnt++;
                    set.remove(nums[i]+j);
                    j++;
                }
                
                maxLen = maxLen < cnt ? cnt : maxLen;
            }
        }
        return maxLen;
    }
}