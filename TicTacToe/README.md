# TicTacToe
# Project Summary

The following application allows the user to start a game of TicTacToe with another person, and of various board sizes. The game takes turns between player X and player O, and each player takes turns until they get all of their respected symbol in a row. Wins consists of a horizontal, vertical, and diagonal line consisting of the same symbol. The application also allows for the use to specify a board size. For example, a typical TicTacToe board is 3 * 3, however, the user(s) can change the size of the board to whatever size they wish. 

# Running the Program

The program requires an understanding of the Command Prompt if on Windows, Terminal if on Mac, and Java 8.0 or higher installed on the target system.

To launch the program as a basic 3 * 3 board, simply run the file "TicTacToe_MVC.jar" located within "TicTacToe > dist" on the target machine.

To launch the program with the ability to change the board size, access the machines console. Navigate to `Drive:\Project Folder Location\TicTacToe\dist`. Once there, type in the command `java -jar "TicTacToe_MVC.jar"`. Starting with just that command will boot the game in the normal 3 * 3 configuaration. If you wish change the board size, simply add the number (only one number) at the end of the command. For instance, `java -jar "TicTacToe_MVC.jar" 5` will start the game with a 5 * 5 board.

# Classes Documentation

The project consists of 4 classes. A "main" class, a controller class, a model class, and a view class. The view class handles all of the GUI, while the controller class brings the model and view classes together. The main class executes the controller class, thus running the program.

## Class: TicTacToe

*This is a user defined class that is considered to be the "main" class. This class calls upon `TicTacToeController` to execute the game. This class is also responsible for accepting the user's specified board size if they wish to change the size.*

### Constructor(s)

There are no actual constructors within this class. This classes function is only to call upon the TicTacToeController using either the default board size, or the user specified board size.

### Attribute(s)

| **Attribute** | **Description** |
| :---        |    :----:   |
| `private static final int DEFAULT_WIDTH ` | Sets the default width of the board. |
| `int width` | Stores a integer to be used as the width of the board. | 
| `TicTacToeController controller` | Initiates the TicTacToeController class. |

### Methods
| **Returns** | **Method** |
| :---        |    :----:   |
| Void | `public static void main(String[] args)` |
| | *Allows for the user to enter a string value at the end of the start command within the Command Prompt / Terminal. The string that is entered, as long as it an integer greater than 0, is then converted to an Integer value and stored in the "width" variable. If no number is entered, then the Default_Width, which is 3, is used instead. Then the TicTacToeController class is called with the value of "width".* |

## Class: TicTacToeController

This is a user defined class that brings the data of the TicTacToeModel class and combines it with the GUI of the TicTacToeView class. This class is also responsible for direct communication between the user and the software, i.e. handles user input via buttons and visually displays the output to the user.

### Constructor(s)

`public TicTacToeController(int width)`

*Creates a new TicTacToeController that passes on the "width" to the TicTacToeModel and TicTacToeView.*

### Attribute(s)

| **Attribute** | **Description** |
| :---        |    :----:   |
| `private TicTacToeView view` | Initializes the TicTacToeView class. |
| `private TicTacToeModel model` | Initializes the TicTacToeModel class. |
| `String name` | Stores the location of a specified square. | 
| `int row` | Parses the value of `String name` to an integer to retrieve the row in which the selected square is located. |
| `int col` | Parses the value of `String name` to an integer to retrieve the column in which the selected square is located. | 

### Methods
| **Returns** | **Method** |
| :---        |    :----:   |
| Void | `actionPerformed(ActionEvent event)` |
| | *Overides the ActionListener. Captures user input from the buttons within the JFrame, and based on player turn (X or O) stores the respective symbol within the specified user location. Sets already clicked buttons to disabled to prevent players from using previously used spots. Also responsible for displaying the output for the game when the games comes to end; who won.* | 
| Void | `updateSquares()` |
| | *Loops through all of the squares and checks for user input. If a user has inputted something within the specified square, it will set the text of the button that belongs to that square to that of the symbol (X or O) of the player who clicked it.* | 

## Class: TicTacToeView

This is a user definied class that is in charge of creating the GUI for the program. 

### Constructor(s)

`public TicTacToeView(int width, TicTacToeController controller)`

*Creates a new TicTacToeView object that passes the width and calls information from the TicTacToeController class to allow use of the action listener*

### Attribute(s)

| **Attribute** | **Description** |
| :---        |    :----:   |
| `TicTacToeController controller` | Initializes the TicTacToeController class for use within the TicTacToeView class |
| `private JButton[][] squares` | A JButton that represents the squares of a TicTacToe board. The button, when clicked, will store the value of the player's symbol. |
| `private JLabel resultLabel` | A JLabel that displays the outcome of the game. |
| `private JPanel squaresPanel` | A JPanel that stores the `squares` JButtons. |
| `private int width` | An integer that stores the width that has been passed from the TicTacToeController class. |

### Methods
| **Returns** | **Method** |
| :---        |    :----:   |
| Void | `showResult(string r)` |
| | *Sets the JLabel to the result of the game through a provided string, r, and displays that in the JLabel.* | 
| JButton | `returnSquares()` | 
| | *Returns the contents of the JButton[][] squares object.* |

## Class: TicTacToeModel
