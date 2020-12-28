import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CGITestCase {
	/**
	 * Test Cases for checking all the generation in Convey Game of Life
	 */
	@Test
	public void test() {
		
		ArrayList<ArrayList<Integer> > l = new ArrayList<ArrayList<Integer> >();
		l.add(0, new ArrayList<>(Arrays.asList(1,3)));
		l.add(1, new ArrayList<>(Arrays.asList(1,4)));
		l.add(2, new ArrayList<>(Arrays.asList(2,4)));
		l.add(3, new ArrayList<>(Arrays.asList(5,3)));
		l.add(4, new ArrayList<>(Arrays.asList(5,4)));
		l.add(5, new ArrayList<>(Arrays.asList(6,2)));
		l.add(6, new ArrayList<>(Arrays.asList(6,3)));
		l.add(7, new ArrayList<>(Arrays.asList(7,5)));
		l.add(8, new ArrayList<>(Arrays.asList(8,4)));
		Cells board = new Cells(10,l);
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
	    Assertions.assertEquals(current,board.toString());
	    System.out.println(board);
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
	    Assertions.assertEquals(nextGen,board.toString());
	    System.out.println("NextGeneration-Successful 1");
	    System.out.println(board); 
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
	    Assertions.assertEquals(nextGen,board.toString());
	    System.out.println("NextGeneration-Successful 2");
	    System.out.println(board);
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
	    Assertions.assertEquals(nextGen,board.toString());
	    System.out.println("NextGeneration-Successful 3");
	    System.out.println(board); 
	    int gen=4;
	    while(!board.getisNull())
        {
	        board.nextState();
	        System.out.println("NextGeneration-Successful "+gen++);
	        System.out.println(board);
        }
	    System.out.println("The Generation Stops with "+--gen+" Generations");
	    
	}

}
