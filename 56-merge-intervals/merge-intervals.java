class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,((a,b) ->  a[0]-b[0]));
        List<int []> temp = new ArrayList<>();

        
       
        int []curr = new int[2];
        curr[0] = intervals[0][0];
        curr[1] = intervals[0][1];

        int k = 0;
        int flag = 0;

        for(int i=1;i<intervals.length;i++){
            flag=0;
            if(curr[1] >= intervals[i][0]){
                flag =1;
                curr[1] = Math.max(curr[1],intervals[i][1]);
                 k=i;
            }
            else{
                temp.add(curr);
                curr = new int[2];
                curr[0] = intervals[i][0];
                curr[1] = intervals[i][1];
                k=i;
            }
           
        }

        if(flag==1 && k == intervals.length-1){
            temp.add(curr);
            k++;
        }
       
        for(int t=k;t<intervals.length;t++){
            temp.add(intervals[t]);
        }

        int [][] ans = new int[temp.size()][2];

        k = 0;
        for(int h[] : temp){
            ans[k++] = h;
        }

        return ans;
    }
}