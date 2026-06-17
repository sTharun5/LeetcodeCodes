class Solution {
    public int[][] merge(int[][] intervals) {
      

        List<int[]> temp = new ArrayList<>();

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int current[] = intervals[0];
        int k = 0;
     
      
        for(int i = 1; i<intervals.length;i++){
            if(current[1] >= intervals[i][0]){
                current[1] = Math.max(intervals[i][1],current[1]);
            }
            else{
           
               int [] s = new int[2];
               s[0] = current[0];
               s[1] = current[1];
               temp.add(s);
                current[0] = intervals[i][0];
                current[1] = intervals[i][1];

            }
        }
        int[] s = new int[2];
        s[0] = current[0];
        s[1] = current[1];
        temp.add(s);
         int [][] ans = new int[temp.size()][2];
        
       
        for(int i=0;i<temp.size();i++){
            int []val = temp.get(i);
            ans[i][0] = val[0];
            ans[i][1] = val[1];
            
        }

        return ans;
        
    }
}