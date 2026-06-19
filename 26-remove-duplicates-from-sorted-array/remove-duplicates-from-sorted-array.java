class Solution {
    public int removeDuplicates(int[] nums) {
        
        int j =0;
        int i=0;
        int k=0;

        while(j < nums.length){

            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
            j++;
        }
        return i+1;
        
    }
}