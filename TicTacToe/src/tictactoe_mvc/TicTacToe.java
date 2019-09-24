/*

Name: Bailey Cochran
Course: CS232   Section: 002
Date: 11/12/2018
Assignment: Project 2

*/

package TicTacToe_MVC;

public class TicTacToe {

    /* Establishes the default width as 3 */
    
    private static final int DEFAULT_WIDTH = 3;

    
    public static void main(String[] args) {
        
        int width = DEFAULT_WIDTH;
        
        /* If a different size is provided, the use the user specified size
        to create the gameboard, as opposed to the default size. */

        if (args.length >= 1) {
                
                width = Integer.parseInt(args[0]);
                
        }
    
        /* Intialize the controller using the user/default width */

        TicTacToeController controller = new TicTacToeController(width);
 
    }
    
}
