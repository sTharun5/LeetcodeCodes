class Solution {
    public boolean isValid(int [][] board,int x,int y,int i,int j){
        return (board.length > x+i && x+i >= 0 && board[0].length > y+j && y+j >= 0);
    }
    public void gameOfLife(int[][] board) {
        int x[] = new int[]{-1,1,-1,1,1,0,0,-1};
        int y[] = new int[]{-1,1,1,-1,0,1,-1,0};

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                        int count = 0;

                    for(int k=0;k<8;k++){
                        if(isValid(board,x[k],y[k],i,j)){
                            if(board[i+x[k]][j+y[k]] == 1 || board[i+x[k]][j+y[k]] == -1){
                                count++;
                            }
                
                        }
                    }
                    if(board[i][j] == 1){
                    if(count < 2 || count > 3 ){
                        board[i][j] = -1;
                    }
                }
                else{
                    if(count == 3){
                        board[i][j] = -2;
                    }
                }
                    
            }
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == -1){
                    board[i][j] = 0;
                }
                if(board[i][j] == -2){
                    board[i][j] = 1;
                }
            }
        }
    }
}