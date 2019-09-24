package TicTacToe_MVC;

import java.awt. *;
import javax.swing. *;

public class TicTacToeView extends JPanel{

    /* Intialize the controller in order to gain access to the action listener
    for the buttons */
    
    TicTacToeController controller;

    private JButton[][] squares;
    private JLabel resultLabel;
    private JPanel squaresPanel;
    private int width;

    /* TicTacToeView method takes in width provided from the user, and 
    controller in order to allow use of the action listener */
    
    public TicTacToeView(int width, TicTacToeController controller) {
        
        this.width = width;
        this.controller = controller;

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        squares = new JButton[width][width];
        squaresPanel = new JPanel(new GridLayout(width, width));
        
        
        resultLabel = new JLabel();
        resultLabel.setName("ResultLabel");

            for (int i =0; i < width; i++){
                for (int j =0; j < width; j++){
                    squares[i][j] = new JButton();
                    squares[i][j].setPreferredSize(new Dimension(64, 64));
                    squares[i][j].addActionListener(controller);
                    squares[i][j].setName("Square" + i + j);
                    squaresPanel.add(squares[i][j]);
                    
                }
            }

        this.add(squaresPanel);
        this.add(resultLabel);
        resultLabel.setText("Welcome to Tic-Tac-Toe!");

    }
    
    /* Return the results of the game */
    
    public void showResult(String r) {
       
        resultLabel.setText(r.toUpperCase());
  
    }
    
    public JButton[][] returnSquares(){
        
        return squares;
    
    }
}