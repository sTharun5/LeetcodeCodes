class Solution {
    public int hIndex(int[] citations) {
        int freq[] = new int[citations.length+1];
        for(int i =0;i<citations.length;i++){
            if(citations[i] >= citations.length)
            freq[citations.length]++;
            else
            freq[citations[i]]++;
        }

        int cnt = 0;

        for(int i=citations.length;i>=0;i--){
            cnt = cnt + freq[i];
            if(cnt >= i) return i;
        }
        return 0;
    }
}