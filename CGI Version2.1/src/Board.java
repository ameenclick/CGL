import java.util.ArrayList;

public class Board {
	private int n;
	ArrayList<ArrayList<Integer> >  liveCells = new ArrayList<ArrayList<Integer> >();
	private boolean[][] board;
	private boolean[][] boardnew;
	private boolean isNull=false;
	/** 
	 * Board class contian all board functions and paramerters
	 * @ n
	 * @ new[][]
	 * @ board
	 * */

	public Board(int size,ArrayList<ArrayList<Integer> >  l) {
		this.n=size;
        this.liveCells=l;
        board = new boolean[n][n];
	}
	
	public Board()
	{
	}
	
	/**
     * Creates initial genration [board]
     * @param n  size of the board n X n
     * @param liveCells[][]  array of live cells
     */
	public String createBoard(int n,ArrayList<ArrayList<Integer> > liveCells){
		 for(int row=0;row<liveCells.size();row++)
	       {
	            board[liveCells.get(row).get(0)][liveCells.get(row).get(1)]=true;
	       }
	       return ("CurrentGeneration");
	}
	
	
	/**
     * Method to gerate a next generation. Call the printBoard
     * to print the next generation.
     * 
     * @param board[][] board
     * 
     */
	public void nextState() {
		//System.out.println("NextGenration");
        boardnew=new boolean[board.length][board[0].length];
        boolean isTrue=false;
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
        if( this.isEmptyBoard(boardnew))
        {
        	this.setisNull(true);
        	setBoard(boardnew);
        }
        else if(this.checkBoardEquality(boardnew))
	    {
	        	this.setisNull(true);
	    }
	    else
	    {
	        	setBoard(boardnew);
	    }
        
	}
	
	public boolean checkBoardEquality(boolean boardnew[][]) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				if(boardnew[i][j] != board[i][j])
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean isEmptyBoard(boolean board[][]) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				if(board[i][j])
				{
					return false;
				}
			}
		}
		return true;
	}

	
	public boolean[][] getBoard(){
		return this.board;
	}
	
	public void setBoard(boolean boardnew[][])
	{
		for(int i=0;i<boardnew.length;i++)
        {
            for(int j=0;j<boardnew[0].length-1;j++)
            { 
            	this.board[i][j]=boardnew[i][j];
            }
        }
	}
	
	public void setisNull(boolean isNull) {
		this.isNull=isNull;
	}
	
	public boolean getisNull() {
		return this.isNull;
	}

}
