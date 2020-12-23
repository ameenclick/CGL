
public class Board {
	private int n;
	private int[][] liveCells;
	private boolean[][] board;
	private boolean[][] boardnew;
	/** 
	 * Board class contian all board functions and paramerters
	 * @ n
	 * @ new[][]
	 * @ board
	 * */

	public Board(int size, int[][] l) {
		this.n=size;
        this.liveCells=l;
        board = new boolean[n][n];
	}
	
	/**
     * Creates initial genration [board]
     * @param n  size of the board n X n
     * @param liveCells[][]  array of live cells
     */
	public void createBoard(int n,int liveCells[][]){
		 for(int row=0;row<liveCells.length;row++)
	       {
	            board[liveCells[row][0]][liveCells[row][1]]=true;
	       }
	       System.out.println("CurrentGenration");
	}
	private boolean[][] newb;
	/**
     * Printing Board
     * @param board[][]
     * @param n
     * @return
     */
	
	public void printBoards() {
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
	public void nextState() {
		System.out.println("NextGenration");
        boardnew=new boolean[board.length][board[0].length];
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
        setBoard(boardnew);
        //printBoard();
	}

	public void setBoard(boolean boardnew[][])
	{
		for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length-1;j++)
            { 
            	this.board[i][j]=boardnew[i][j];
            }
        }
	}

}
