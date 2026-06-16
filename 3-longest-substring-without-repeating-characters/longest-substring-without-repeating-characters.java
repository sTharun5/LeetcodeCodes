class Solution {
    public int lengthOfLongestSubstring(String s) {

        int i = 0;
        int j = 0;
        int len = 0;
        int max = 0;

        HashMap<Character,Integer> map = new HashMap<>();


        while(j < s.length()){
            if(map.containsKey(s.charAt(j)) && map.get(s.charAt(j)) >= i){
                i = map.get(s.charAt(j)) + 1;
            }
            map.put(s.charAt(j),j);
            len = j-i+1;
            if(max < len) max = len;
            j++;
        }

        return max;
        
    }
}