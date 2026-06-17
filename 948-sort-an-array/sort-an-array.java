class Solution {

    public void merger(int[]nums,int low,int mid,int high){
        int ls = mid-low+1;int rs = high-mid;
        int la[] = new int[ls];
        int ra[] = new int[rs];

        int i=0;int j=0;
        for(i=0;i<ls;i++){
            la[i] = nums[i+low];
        }
        for(j=0;j<rs;j++){
            ra[j] = nums[j+mid+1];
        }

        i=0;j=0;
        int k=low;

        while(i < ls && j < rs){
            if(la[i] < ra[j]){
                nums[k++] = la[i++];
            }
            else{
                nums[k++] = ra[j++];
            }
        }

        while(i < ls)nums[k++] = la[i++];
        while(j < rs)nums[k++] = ra[j++];

    }


    public void mergeSort(int[]nums,int low,int high){
        if(low < high){
            int mid = (low+high) / 2;
            mergeSort(nums,low,mid);
            mergeSort(nums,mid+1,high);
            merger(nums,low,mid,high);
        }
    }
    public int[] sortArray(int[] nums) {
        
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}