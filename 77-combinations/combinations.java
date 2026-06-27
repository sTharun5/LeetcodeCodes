class Solution {

    public void combo(int i,int n,int k, List<List<Integer>> ans,List<Integer> temp){
        if(k <= 0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        if(i > n)return;
      
     

        for(int j = i; j <= n ; j++){
            temp.add(j);
            combo(j+1,n,k-1,ans,temp);
            temp.remove(temp.size()-1);
           
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        combo(1,n,k,ans,new ArrayList<>());
        return ans;
    }
}