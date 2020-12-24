import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CGITestCase {

	@Test
	public void test() {
		ConveyGameOfLife convey=new ConveyGameOfLife();
		//System.out.println("======TEST ONE EXECUTED=======");
		int[][] l = {{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
		Board board = new Board(10,l);
	    Assertions.assertEquals("CurrentGenration",board.createBoard(10,l));
	    System.out.println(board.createBoard(10,l));
	    String current="..........\n"
	    		+ "...**.....\n"
	    		+ "....*.....\n"
	    		+ "..........\n"
	    		+ "..........\n"
	    		+ "...**.....\n"
	    		+ "..**......\n"
	    		+ ".....*....\n"
	    		+ "....*.....\n"
	    		+ "..........\n";
	    Assertions.assertEquals(current,board.returnBoard());
	    board.printBoards();
	    String nextGen="..........\n"
	    		+ "...**.....\n"
	    		+ "...**.....\n"
	    		+ "..........\n"
	    		+ "..........\n"
	    		+ "..***.....\n"
	    		+ "..**......\n"
	    		+ "...**.....\n"
	    		+ "..........\n"
	    		+ "..........\n";
	    board.nextState(); 
	    Assertions.assertEquals(nextGen,board.returnBoard());
	    System.out.println("NextGenration");
	    board.printBoards();   
	}

}
