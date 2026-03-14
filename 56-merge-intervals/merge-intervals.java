class Solution {
    public int[][] merge(int[][] intervals) {
        int ans[][] = new int[intervals.length][2];
        Arrays.sort(intervals,new cc());

        int k = 0;
        ans[0] = intervals[0];

        for(int i=1;i<intervals.length;i++){
        
        if(intervals[i][0] <= ans[k][1]){
            int max = ans[k][1];
            if(max < intervals[i][1])
            max = intervals[i][1];
            ans[k][0] = ans[k][0];
            ans[k][1] = max;
            
        }
        else{

            k++;
            ans[k][0] = intervals[i][0];
            ans[k][1] = intervals[i][1];

        }
            
        }
k++;
 int temp[][] = new int[k][2];

 for(int i=0;i<k;i++){
    temp[i] = ans[i];
 }

       
        return temp;
    }
}

class cc implements Comparator<int[]>{
    public int compare(int a[],int b[]){
        return a[0] - b[0];
    }
}