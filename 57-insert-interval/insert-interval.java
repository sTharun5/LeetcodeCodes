class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> store = new ArrayList<>();
        int i = 0;

        //add before overlapping
        while(i < intervals.length && intervals[i][1] < newInterval[0]){
            store.add(intervals[i]);
            i++;
        }

        // overlapping

        while(i < intervals.length && intervals[i][0]  <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
            store.add(newInterval);

            while(i < intervals.length){
                   store.add(intervals[i]);
                   i++;
            }
        

        int ans[][] = new int[store.size()][2];

        for( i=0;i<store.size();i++){
            ans[i][0] =store.get(i)[0];
            ans[i][1] = store.get(i)[1];
        }

        return ans;

    }
}