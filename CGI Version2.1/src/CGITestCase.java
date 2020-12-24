import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CGITestCase {
	/**
	 * Test Cases for checking all the generation in Convey Game of Life
	 */
	@Test
	public void test() {
		int[][] l = {{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
		LiveCells board = new LiveCells(10,l);
		//Test Case 1
	    Assertions.assertEquals("CurrentGeneration",board.createBoard(10,l));
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
	  //Test Case 2
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
	    System.out.println("NextGeneration");
	    board.printBoards(); 
	  //Test Case 3
	    nextGen="..........\n"
	    		+ "...**.....\n"
	    		+ "...**.....\n"
	    		+ "..........\n"
	    		+ "...*......\n"
	    		+ "..*.*.....\n"
	    		+ "..........\n"
	    		+ "..***.....\n"
	    		+ "..........\n"
	    		+ "..........\n";
	    board.nextState(); 
	    Assertions.assertEquals(nextGen,board.returnBoard());
	    System.out.println("NextGeneration");
	    board.printBoards();
	  //Test Case 4
	    nextGen="..........\n"
	    		+ "...**.....\n"
	    		+ "...**.....\n"
	    		+ "...**.....\n"
	    		+ "...*......\n"
	    		+ "...*......\n"
	    		+ "..*.*.....\n"
	    		+ "...*......\n"
	    		+ "...*......\n"
	    		+ "..........\n";
	    board.nextState(); 
	    Assertions.assertEquals(nextGen,board.returnBoard());
	    System.out.println("NextGeneration");
	    board.printBoards();   
	}

}
