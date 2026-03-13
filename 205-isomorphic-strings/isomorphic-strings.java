class Solution {
    public boolean isIsomorphic(String s, String t) {
        char arr[] = new char[200];
         char arr2[] = new char[200];
        for(int i=0;i<t.length();i++)
        {
            if(arr[s.charAt(i)] == '\u0000')
            arr[s.charAt(i)] = t.charAt(i);
            else
            {
                if( arr[s.charAt(i)] != t.charAt(i))
                return false;
            }

             if(arr2[t.charAt(i)] == '\u0000')
            arr2[t.charAt(i)] = s.charAt(i);
            else
            {
                if( arr2[t.charAt(i)] != s.charAt(i))
                return false;
            }
        }


        return true;
    }
}