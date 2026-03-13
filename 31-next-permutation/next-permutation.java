class Solution {
    public void nextPermutation(int[] nums) {

        int ind = -1;

        for(int i = nums.length-1;i>=1;i--){
            if(nums[i] > nums[i-1]){
                ind = i-1;
                break;
            }
        }

        if(ind == -1){
            int y = 0;
            int z = nums.length-1;

            while(y <= z){
                int tem = nums[y];
                nums[y] = nums[z];
                nums[z] = tem;
                y++;
                z--;
            }
            return;
        }

        int k = ind + 1;
        int swap = k;

        for(int j = nums.length-1;j>=k;j--){
            if(nums[j] > nums[ind]){
                swap = j;
                break;
            }
        }

        int temp = nums[ind];
        nums[ind] = nums[swap];
        nums[swap] = temp;

        int y = k;
            int z = nums.length-1;

            while(y <= z){
                int tem = nums[y];
                nums[y] = nums[z];
                nums[z] = tem;
                y++;
                z--;
            }

        System.out.println(swap);

    }
}