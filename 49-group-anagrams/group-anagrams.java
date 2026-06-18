class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for(int i=0;i<strs.length;i++){
            char[] word = strs[i].toCharArray();
            Arrays.sort(word);
            String curr = new String(word);


            if(map.containsKey(curr)){
                map.get(curr).add(strs[i]);
            }
            else{
                List<String> temp  = new ArrayList<>();
                temp.add(strs[i]);
                map.put(curr,temp);
            }
           
        }
        for(List<String> ele : map.values()){
            ans.add(ele);
        }

        return ans;
    }
}