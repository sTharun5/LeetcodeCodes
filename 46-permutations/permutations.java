class Solution {

    public void swap(int i,int j,int nums[]){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }

    public void permutation(int i,int nums[], List<List<Integer>> ans,List<Integer> temp){
        if(i == nums.length-1){

            for(int k : nums){
                temp.add(k);
            }
            ans.add(new ArrayList<>(temp));
            temp.clear();
            return;
        }

        for(int j=i;j<nums.length;j++){
            swap(i,j,nums);
            permutation(i+1,nums,ans,temp);
            swap(i,j,nums);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutation(0,nums,ans,new ArrayList<>());
        return ans;
    }
}