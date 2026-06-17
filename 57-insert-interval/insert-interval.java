class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();

        int i=0;

        while(i < intervals.length && intervals[i][1] < newInterval[0]){
            ans.add(intervals[i]);
            i++;
        }   

        while(i < intervals.length && intervals[i][0] <=  newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
           newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
           
            i++;
        }

         ans.add(newInterval);

         while(i < intervals.length){
            ans.add(intervals[i]);
            i++;
         }

        

       

        int [][] t = new int[ans.size()][2];
         for(int j=0;j<ans.size();j++){
            t[j][0] = ans.get(j)[0];
            t[j][1] = ans.get(j)[1];
        }

        return t;
    }
}