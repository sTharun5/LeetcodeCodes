class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        func(nums,0,0,ans,new ArrayList<>(),target);
        return ans;
    }

    public void func(int nums[],int i,int currSum, List<List<Integer>> ans,List<Integer> curr,int target){
        if(currSum > target)
        return;
        if(i == nums.length)
        return;
        if(currSum == target){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int j = i; j < nums.length ; j++){
            curr.add(nums[j]);
            func(nums,j,currSum+nums[j],ans,curr,target);
            curr.remove(Integer.valueOf(nums[j]));
        }
    }
}