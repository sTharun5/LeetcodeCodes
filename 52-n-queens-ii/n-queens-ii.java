class Solution {
    public int totalNQueens(int n) {
        char board[][] = new char[n][n];
        List<List<String>> ans = new ArrayList<>();
        

        for(char row[] : board){
            Arrays.fill(row,'.');
        }
       
        func(board,ans,0,n);
        return ans.size();
    }

    public boolean isValid(char [][]board,int row,int col){
        // all eight dierections u need to check
        for(int row_up = row-1; row_up >= 0 ; row_up--)
        {
            if(board[row_up][col] == 'Q')
            return false;
        }

         for(int col_left = col-1; col_left >= 0 ; col_left--)
        {
            if(board[row][col_left] == 'Q')
            return false;
        }

         for(int row_down = row+1; row_down < board.length ; row_down++)
        {
            if(board[row_down][col] == 'Q')
            return false;
        }

         for(int col_right = col+1; col_right < board.length ; col_right++)
        {
            if(board[row][col_right] == 'Q')
            return false;
        }

        

         for(int row_up = row-1,col_right = col+1; row_up >= 0 &&  col_right < board.length; row_up--,col_right++)
        {
            if(board[row_up][col_right] == 'Q')
            return false;
        }

        for(int row_up = row+1,col_right = col+1; row_up < board.length &&  col_right < board.length; row_up++,col_right++)
        {
            if(board[row_up][col_right] == 'Q')
            return false;
        }
        for(int row_up = row+1,col_right = col-1; row_up < board.length &&  col_right >= 0; row_up++,col_right--)
        {
            if(board[row_up][col_right] == 'Q')
            return false;
        }
        for(int row_up = row-1,col_right = col-1; row_up >= 0 &&  col_right >= 0; row_up--,col_right--)
        {
            if(board[row_up][col_right] == 'Q')
            return false;
        }


        return true;


    }

    public void func(char[][] board,List<List<String>> ans,int row,int n){
        if(row == n){
            
            List<String> temp = new ArrayList<>();
            for( char Row[] : board){
                temp.add(new String(Row));
            }
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int col = 0; col < n ; col++){
            if(isValid(board,row,col)){
           
                board[row][col] = 'Q';
                func(board,ans,row+1,n);
                board[row][col] = '.';
            }
        }
        
    }
}