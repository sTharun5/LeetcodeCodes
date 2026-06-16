class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> prefixSum = new HashMap<>();
        int cnt = 0;
        int sum = 0;

        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            if(sum == k){
                cnt++;
            }

            if(prefixSum.containsKey(sum-k)){
                cnt = cnt + (prefixSum.get(sum-k));
            }

            if(prefixSum.containsKey(sum)){
                int add = prefixSum.get(sum);
                add++;
                prefixSum.put(sum,add);
            }
            else{
                 prefixSum.put(sum,1);
            }

        }
        return cnt;
    }
}