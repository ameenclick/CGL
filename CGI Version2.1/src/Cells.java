import java.util.ArrayList;

public class Cells extends Board{
	private boolean board[][];
	/**
	 * Alls Cells Represent in this Class
	 * @param size
	 * @param liveCells
	 */
   
    
    public Cells(int size, ArrayList<ArrayList<Integer>> l) {
    	//Code
    	super(size,l);
    	this.board=super.getBoard();
	}

	/**
	 * Return the board string for check in test case
	 * @param game*/
	public String toString() {
		String game="";
		for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length-1;j++)
            {
               if(board[i][j])
                {
                    game+="*";
                }
                else{
                    game+=".";
                }
            }
            if(board[i][board[0].length-1])
            {
                  game+="*";
            }
            else{
                game+=".";
            }
            game+="\n";
        }
		return game;
	}
}
