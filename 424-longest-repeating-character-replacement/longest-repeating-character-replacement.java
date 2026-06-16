class Solution {
    public int characterReplacement(String s, int k) {
        int j = 0;
        int n = s.length();
        int hash[] = new int[26];
        int i=0;
        int maxfreq = 0;
        int max = 0;

        while(j < n)
        {
            hash[s.charAt(j)-'A']++;
            maxfreq = Math.max(maxfreq,hash[s.charAt(j) - 'A']);

            if((j-i+1) - maxfreq > k)
            {
                hash[s.charAt(i) -'A']--;   
                 i++;
            }

            max= Math.max(max,j-i+1);
            j++;
        }
        return max;

    }
}