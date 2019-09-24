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

This is a user defined class that is considered to be the "main" class. This class calls upon `TicTacToeController` to execute the game. This class is also responsible for accepting the user's specified board size if they wish to change the size.

### Constructor(s)

There are no actual constructors within this class. This classes function is only to call upon the TicTacToeController using either the default board size, or the user specified board size.

### Attribute(s)

| **Attribute** | **Description** |
| :---        |    :----:   |
|`private static final int DEFAULT_WIDTH ` | Sets the default width of the board. |
| `int width` | Stores a integer to be used as the width of the board. | 
| `TicTacToeController controller` | Initiates the TicTacToeController class. |

### Methods
| **Returns** | **Method** |
| :---        |    :----:   |
| Void | `public static void main(String[] args)` |
| | Allows for the user to enter a string value at the end of the start command within the Command Prompt \ Terminal. The string that is entered, as long as it an integer greater than 0, is then converted to an Integer value and stored in the "width" variable. If no number is entered, then the Default_Width, which is 3, is used instead. Then the TicTacToeController class is called with the value of "width". |

## Class: TicTacToeController
