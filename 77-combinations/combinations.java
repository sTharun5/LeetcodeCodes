class Solution {

    public void combo(int i,int n,int k, List<List<Integer>> ans,List<Integer> temp){
        if(k == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        if(i > n)return;

            temp.add(i);
            combo(i+1,n,k-1,ans,temp);
            temp.remove(temp.size()-1);
            combo(i+1,n,k,ans,temp);
        
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        combo(1,n,k,ans,new ArrayList<>());
        return ans;
    }
}