class Solution {
    List<List<Integer>> ans;

    public void combo(int i,int[] nums, int target,List<Integer> temp){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(target < 0) return;
        if(i >= nums.length)return;

        for(int j=i;j<nums.length;j++){
            temp.add(nums[j]);
            combo(j,nums,target-nums[j],temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
    
    ans = new ArrayList<>();

    combo(0,nums,target,new ArrayList<>());

    return ans;
    }
}