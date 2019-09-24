package TicTacToe_MVC;

public class TicTacToeModel {
    
    private static final int DEFAULT_WIDTH = 3;
    
    /* Mark represents player X or O, or an empty space */
    
    public enum Mark {
        
        X("X"), 
        O("O"), 
        EMPTY("");

        private String result;
        
        private Mark(String mark) {
            this.result = mark;
        }
        
        @Override
        public String toString() {
            return result;
        }
        
    };
    
    /* Returns the result for each different possible outcome:
        X = X wins
        Y = Y wins
        TIE = There was a tie
        NONE = There was not a winner */
    
    public enum Result {
        
        X("X"), 
        O("O"), 
        TIE("Tie"), 
        NONE("none");

        private String result;
        
        private Result(String mark) {
            result = mark;
        }
        
        @Override
        public String toString() {
            return result;
        }
        
    };
    
    private Mark[][] board; /* Game board */
    private boolean xTurn; /* True if X is current player */
    private int width;     /* Size of the board */
    
    
    public TicTacToeModel() {
        
        this(DEFAULT_WIDTH);
        
    }
    
    
    public TicTacToeModel(int width) {
        
        this.width = width;
        xTurn = true; /* Game starts with X */

       board = new Mark[width][width];

        /* Initialize empty board */

        for (int i=0; i < width; i++){
            for (int j =0; j < width; j++){
               board[i][j] = Mark.EMPTY;
            }
        }
             
    }
	
    public boolean makeMark(int row, int col) {
        
        /* Place the current player's mark in the square at the specified
           location, but only if the location is valid and if the square is
           empty */
        
        if (isValidSquare(row, col) == false){
            return false;
        }
        else if (isSquareMarked(row, col) == true){
            return false;
        }
        else{
            if (isXTurn() == true){
               board[row][col] = Mark.X;
                xTurn = false;
            }
            else if (isXTurn() == false){
               board[row][col] = Mark.O;
                xTurn = true;
            }
            return true;
        }
        
    }
	
    private boolean isValidSquare(int row, int col) {
        
        /* Return true if specified location is within board */
        
        if ((-1 < row) && (row < width) && (-1 < col) && (col < width)){ 
            return true;
        }

        else{
            return false;
        }
        
    }
	
    private boolean isSquareMarked(int row, int col) {
        
        /* Return true if square at specified location is already full */
      
        if (board[row][col] != Mark.EMPTY){
            return true;
        }

        else{
            return false;
        }
        
    }
	
    public Mark getMark(int row, int col) {
        
        /* Return mark from the square at the specified location */
        
        return board[row][col];
            
    }
	
    public Result getResult() {
        
        /* Use isMarkWin() to see if X or O is the winner, if the game is a
           tie, or if the game is not over, and return the corresponding Result
           value */
        
        if ((isMarkWin(Mark.X) == true)){
            return Result.X;
        }
        
        else if (isMarkWin(Mark.O) == true){
            return Result.O;
        }

        else if (isTie() == true){
            return Result.TIE;
        }
                
        else{
            return Result.NONE;
        }

    }
	
    private boolean isMarkWin(Mark mark) {
        
        /* Check the squares of the board to see if the specified player is the
           winner */
        
           int vertical = 0;
           int horizontal = 0;
           int downDiagonal = 0;
           int upDiagonal = 0;
       
        //check rows
        
        for (int i=0; i < width; i++){
            if (horizontal != width){
                horizontal = 0;
                for (int j=0; j < width; j++){
                    if(board[i][j] == mark){
                        horizontal = horizontal + 1;
                    }
                }
            }
        }

        //check columns
        
        for (int j=0; j < width; j++){
            if (vertical != width){
                vertical = 0;
                for (int i=0; i < width; i++){
                    if(board[i][j] == mark){
                        vertical = vertical + 1;
                    }
                }
            }
        }

        //check left diag
      
        for (int j = 0; j <width; j++){
            if(board[j][j] == mark){
                downDiagonal = downDiagonal + 1;
            }
        }

        //check right diag
       
        for (int j = 0; j < width; j++){
            if(board[j][width - j - 1] == mark){
                upDiagonal = upDiagonal + 1;
            }
        }
        
        /* If counter of specified win type equals the size of the board, 
        return a win */
        
        if (vertical == width){
            return true;
        }
        else if (horizontal == width){
            return true;
        }
        else if (downDiagonal == width){
            return true;
        }
        else if (upDiagonal == width){
            return true;
        }
        else{
            return false;
        }
        
    }
	
    private boolean isTie() {
        
        /* Check the squares of the board to see if the game is a tie */

        int count = 0;
        
        for (int i=0; i < width; i++){
            for (int j=0; j < width; j++){
                if (board[i][j] == Mark.EMPTY){
                    count = count + 1;
                }
            }
        }

        if (count == 0){
            return true;
        }
        else{
            return false;
        }
        
    }

    public boolean isGameover() {
        
        /* Return true if the game is over */
        
        return Result.NONE != getResult();
        
    }

    public boolean isXTurn() {
        
        /* Return true if it's x's turn */
        
        return xTurn;
        
    }

    public int getWidth() {
        
        return width;
        
    }
    
}
