class Solution {
    public int hIndex(int[] citations) {
        int freq[] = new int[citations.length+1];

        for(int c : citations){
            if(c >= citations.length){
                freq[citations.length]++;
            }
            else{
                freq[c]++;
            }
        }
        int cnt = 0;
        for(int i=citations.length;i>=0;i--){
            cnt = cnt + freq[i];
            if(cnt >= i){
                return i;
            }
        }

        return 0;


    }
}