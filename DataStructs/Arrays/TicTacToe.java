package DataStructs.Arrays;

public class TicTacToe {
    protected static final int X=1,O=-1;//players
    protected static final int EMPTY=0;//empty cell
    protected int board[][]=new int[3][3];//game board
    protected int player;          //current player


    public TicTacToe(){
        clearBoard();//clears board
    }

    public void clearBoard(){
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++)
            board[i][j] = EMPTY;
            player = X;  //first player is X
        }
    }

    /**puts an X or O at position i,j */
    public void putMark(int i,int j) throws IllegalArgumentException{
        if((i<0) || (i>2) || (j<0) || (j>2))
        throw new IllegalArgumentException("Invalid board position");
        if(board[i][j] != EMPTY)
        throw new IllegalArgumentException("Board position occupied");
        board[i][j] = player;//place mark for current player 
        player=-player;//switch players (uses the fact that O=-X)
    }

    public boolean isWin(int mark){
        return ((
           ( board[0][0] + board[0][1]+board[0][2]==mark*3)
           || ( board[1][0] + board[1][1]+board[1][2]==mark*3)
           || ( board[2][0] + board[2][1]+board[2][2]==mark*3)
           || ( board[0][0] + board[1][0]+board[2][0]==mark*3)
           || ( board[0][1] + board[1][1]+board[2][1]==mark*3)
           || ( board[0][2] + board[1][2]+board[2][2]==mark*3)
           || ( board[0][0] + board[1][1]+board[2][2]==mark*3)
           || ( board[2][0] + board[1][1]+board[0][2]==mark*3)

        ));
    }

    //returns the winning player or a 0 to indicate a tie
    public int winner(){
        if(isWin(X))
        return (X);
        else if (isWin(O))
        return (O);
        else 
        return(O);
    }

}
