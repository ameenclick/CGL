
public class Board {
	private int n;
	private boolean[][] liveCells;
	private boolean[][] board;
	private boolean[][] new;
	/** 
	 * Board class contian all board functions and paramerters
	 * @ n
	 * @ new[][]
	 * @ board
	 * */
	public void Board(n,l) {
		this.n=n;
        this.liveCells=l;
        board = new boolean[n][n];
       
	}
	/**
     * Creates initial genration [board]
     * @param n  size of the board n X n
     * @param lliveCells[][]  array of live cells
     */
	public boolean[][] creatBoard(n,board){
		 for(int row=0;row<liveCells.length;row++)
	       {
	            board[liveCells[row][0]][liveCells[row][1]]=true;
	       }
	       System.out.println("CurrentGenration");
	       printBoard(board);
	       return board;
	}
	
	
	 /**
     * Printing Board
     * @param board[][]
     * @param n
     * @return
     */
	public void printBoard(boolean board[][]) {
		for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length-1;j++)
            {
               if(board[i][j])
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(".");
                }
            }
            if(board[i][board[0].length-1])
            {
                  System.out.print("*");
            }
            else{
                System.out.print(".");
            }
            System.out.println();
        }
	}
	
	
	/**
     * Method to gerate a next generation. Call the printBoard
     * to print the next generation.
     * 
     * @param board[][] board
     * 
     */
	public nextState(boolean board[][]) {
		System.out.println("NextGenration");
        boolean[][] boardnew=new boolean[board.length][board[0].length];
        int x=board.length,y=board[0].length;
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                boardnew[i][j]=false;
            }
        }
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                int count=0;
                for(int i1=i-1;i1<=i+1;i1++)
                {
                    for(int j1=j-1 ; j1<=j+1; j1++)
                    {
                        if(board[(i1 + x) % x][(j1 + y) % y])
                        {
                            count +=1;
                        }
                    }
                }
                if(board[i][j])
                    count--;
                if(count<2 && board[i][j])
                {
                    boardnew[i][j]=false;
                }
                else if((count == 2 || count ==3) && board[i][j])
                {
                    boardnew[i][j]=true;
                }
                else if(count>3 && board[i][j])
                {
                    boardnew[i][j]=false;
                }
                else if(count == 3 && !board[i][j])
                {
                    boardnew[i][j]=true;
                }

            }
        }
        printBoard(boardnew);
	}
}
