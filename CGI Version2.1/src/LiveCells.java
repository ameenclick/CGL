import java.util.ArrayList;

public class LiveCells extends Cells {
	private int[][] liveCells;
	/**
	 * LiveCells Extend Cells Class
	 * @param size
	 * @param liveCells
	 */
    public LiveCells(int size,ArrayList<ArrayList<Integer>> liveCells) {
    	
    	super(size,liveCells);
    }
}
