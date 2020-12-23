import java.util.Scanner;

/**
 * ****************Conways Game Of Life***********************************
 * Initially, there is a board with some cells which may be alive or dead. 
 * Task is to generate the next generation of cells based on the following rules: 
 *     
 * Rule 1: Any live cell with fewer than two live neighbors dies, as if caused by under
 * population. 
 * Rule 2:Any live cell with two or three live neighbors lives on
 * to the next generation. 
 * Rule 3: Any live cell with more than three live  neighbors dies, as if by overpopulation. 
 * Ruele 4: Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 * 
 * Step 1 => find the no Of Neighbors that are alive; 
 * Step 2 => apply rules of game to get next generation by use the if conditions
 * to check all neighbors excluding it self as given video lecture
 * 
 * *************Rules of Life********************* 
 * Lonely cell will die ==> aliveNeighbours < 2 ;
 * Cell will die due to overpopulation ==> aliveNeighbours > 3 
 * A new cell will born ==> if currently dead cell have aliveNeighbours == 3
 * 
 * @author Ameen N.A and 20031J0031
 * @version Version 2.1
 */
public class ConveyGameOfLife{
    /**
     * Main Class for running the whole program
     * All the function will be initialize from this class
     * @param args
     * @param size
     * @param l
     */
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        //Reading size of the board here
        int size=scan.nextInt();
        int m = scan.nextInt();
        int[][] l = new int[m][2];
        int i = 0;
        //Reading no.of intital live cells
        while (scan.hasNextInt()) {
            l[i][0] = scan.nextInt();
            l[i++][1] = scan.nextInt();
            if(m==i) {
            	break;
            }
        }
        //Create object of the Board Class
        Board board = new Board(size,l);
        board.createBoard(size,l);
        board.printBoards();
        //Board newb = new Board(size,l);
        board.nextState();
        board.printBoards();
        scan.close();
    }
}