class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
        return false;

        HashMap<Character,Character> map1 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i))){
                if(map1.get(s.charAt(i)) != t.charAt(i))
                return false;
            }
            else{
                map1.put(s.charAt(i),t.charAt(i));
            }
        }

        map1.clear();

        for(int i=0;i<s.length();i++){
            if(map1.containsKey(t.charAt(i))){
                if(map1.get(t.charAt(i)) != s.charAt(i))
                return false;
            }
            else{
                map1.put(t.charAt(i),s.charAt(i));
            }
        }

        return true;



    }
}