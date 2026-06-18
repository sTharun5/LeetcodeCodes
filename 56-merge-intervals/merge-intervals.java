class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        int current[] = intervals[0];
        ArrayList<int[]> store = new ArrayList<>();

        for(int i=0;i<intervals.length;i++){
            if(current[1] >= intervals[i][0]){
                current[1] = Math.max(intervals[i][1],current[1]);
            }
            else{
                store.add(current);
                current = intervals[i];
            }
        }
        store.add(current);
        int ans[][] = new int[store.size()][2];
        for(int i=0;i<store.size();i++){
            ans[i][0] = store.get(i)[0];
            ans[i][1] = store.get(i)[1];
        }
        return ans;
        
    }
}