class Solution {

    void reverse(String s){
        
    }
    public String reverseWords(String s) {
        String[] words = s.strip().split("\\s+");
        StringBuilder word = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            word.append(words[i]);
            if(i!=0)
            word.append(" ");
        }

        String str = new String(word);

       
        return str;
    }
}