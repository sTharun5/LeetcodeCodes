class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int max = 0;

        int i = 0;
        int j = 0;

        while(j < s.length()){
            if(map.containsKey(s.charAt(j)) && i <= map.get(s.charAt(j))){
                    max = Math.max(max,j-i);
                    i = map.get(s.charAt(j)) + 1 ;
                    
            }
           
            map.put(s.charAt(j),j);
            j++;
            
        
        }
        max = Math.max(max,j-i);
        return max;
    }
}