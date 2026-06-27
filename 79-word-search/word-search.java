class Solution {

    public boolean bool(int i,int j,int k,char[][] board,String word)
    {
        if(k == word.length()){
            return true;
        }
        if(i < 0 || i == board.length ||  j < 0 || j == board[0].length){
            return false;
        }


       

        if(board[i][j] == word.charAt(k)){
            char temp = board[i][j] ;
            board[i][j] = '#';
            boolean has = bool(i+1,j,k+1,board,word)  ||  bool(i,j+1,k+1,board,word) || bool(i-1,j,k+1,board,word) ||  bool(i,j-1,k+1,board,word);
            board[i][j] = temp;
            return has;
        }
        else{
            return false;
        }
       
    }
    public boolean exist(char[][] board, String word) {

       boolean bool = false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                    bool = bool || bool(i,j,0,board,word);
            }
        }
        return bool;
    }
}