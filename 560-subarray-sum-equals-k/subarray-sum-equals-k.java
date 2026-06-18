class Solution {
    public int subarraySum(int[] nums, int k) {

        //       sum , count
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int max = 0;
        int cnt = 0;

        for (int i = 0; i < nums.length; i++) {

            sum = sum + nums[i];
            if (sum == k) {
                cnt++;
            }

            if (map.containsKey(sum - k)) {
                cnt = map.get(sum - k) + cnt;
            }

            if (map.containsKey(sum)) {
                int c = map.get(sum);
                map.put(sum, c + 1);
            } else {
                map.put(sum, 1);
            }
        }

        return cnt;
    }
}