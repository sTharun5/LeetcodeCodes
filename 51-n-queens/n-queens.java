class Solution {
    private boolean isPlaceable(List<List<String>> ans,List<String> temp,int i,int j,int n)
    {
        int row = i;
        int col = j;

        while(row >= 0)
        {
            if(temp.get(row).charAt(col) == 'Q')
            {
                return false;
            }
            row--;
        }
        row = i;

        while(row >= 0 && col >=0)
        {
              if(temp.get(row).charAt(col) == 'Q')
            {
                return false;
            }
            row--;
            col--;
        }
        row = i;
        col = j;

        while(row >= 0 && col < n)
        {
                if(temp.get(row).charAt(col) == 'Q')
            {
                return false;
            }
            row--;
            col++;
        }
        return true;
    }
    private void rec(List<List<String>> ans,List<String> temp,int n,int index)
    {
        if(n == index)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<n;i++)
        {
            if(isPlaceable(ans,temp,index,i,n))
            {
              char t[] =  temp.get(index).toCharArray();
              t[i] = 'Q';
              temp.set(index,new String(t));
              rec(ans,temp,n,index+1);
              t[i] = '.';
              temp.set(index,new String(t));
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        
        String t = "";
        for(int i=0;i<n;i++)
        t+= ".";
        for(int i=0;i<n;i++)
        temp.add(t);
        rec(ans,temp,n,0);
        return ans;
    }
}