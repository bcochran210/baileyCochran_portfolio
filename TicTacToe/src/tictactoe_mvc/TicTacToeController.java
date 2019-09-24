package TicTacToe_MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TicTacToeController implements ActionListener {
    
    /* Initialize view & model */
    
    private TicTacToeView view;
    private TicTacToeModel model;
    
    /* Constructor for controller */
    
    public TicTacToeController(int width){
        
        model = new TicTacToeModel(width);
        view = new TicTacToeView(width, this);
        JFrame win = new JFrame("Tic-Tac-Toe");
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(view);
        win.pack();
        win.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent event) { 
        
        String name = ((JButton) event.getSource()).getName();
        int row = Integer.parseInt(String.valueOf(name.charAt(6)));
        int col = Integer.parseInt(String.valueOf(name.charAt(7)));
        
        updateSquares();
        if (model.makeMark(row,col) == true)
        updateSquares();
        
        for(int i = 0; i < view.returnSquares().length; i++){
            for(int j = 0; j < view.returnSquares().length; j++){ 
                if (model.isGameover() == true) {
                    view.showResult(model.getResult().toString()); 
                    view.returnSquares()[i][j].setEnabled(false);
                }
            }
        }

    }
    
    public void updateSquares() {

    /* Loop through all of the squares and set the text of each button
       to reflect the text in the squares. */

        for (int i =0; i < model.getWidth(); i++){
            for (int j =0; j < model.getWidth(); j++){
                view.returnSquares()[i][j].setText
                    (model.getMark(i,j).toString());
            }
        }

    }
    
}