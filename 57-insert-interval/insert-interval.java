class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> temp = new ArrayList<>();
        int i=0;

        while(i<intervals.length && intervals[i][1] < newInterval[0]){
            temp.add(intervals[i]);
            i++;
        }


        while(i < intervals.length && intervals[i][0] <=  newInterval[1]){
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            
            i++;
        }
        temp.add(newInterval);

        for(int k = i;k<intervals.length;k++){
            temp.add(intervals[k]);
        }

        int ans[][] = new int[temp.size()][2];

        int m=0;

       for(int[]b : temp){  
        ans[m++] = b;
        
       }

   

        return ans;

        
    }
}