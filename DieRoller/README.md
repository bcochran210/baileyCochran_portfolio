# DieRoller
# Project Summary

The following application, upon running, rolls 5 die each with a different number of faces. The different face values consist of 4, 6, 8, 10, 12, 20, and 100. The program will first assign each of the die a face value. Then, the program will "roll" each die, randomly selecting a value between one and the total face value. Once these numbers have been determined, the program will then display the information to the user in the following format:

"d6 = 4",

this output means that a six sided die was rolled, and it landed on four. This will be repeated for the other four die. 

# Running the Program

The program requires an understanding of the Command Prompt if on Windows, Terminal if on Mac, and Java 8.0 or higher installed on the target system.

To launch the program, the user most access their Command Prompt or Terminal, depending on the user's preferred OS. Then, the use needs to navigate to `Drive:\Project Folder Location\DieRoller\dist`. Once there, type in the command `java -jar "TicTacToe.jar"`. Once the command has been typed in, the program will automatically roll the 5 die, and display their outputs. 

The output is displayed as: d# (number of faces on the die) = # (face the die landed on).

# Classes Documentation

The project consists of two major classes. A main class that choses the the die face, and calls upon the die class to create new dies, and roll each one, and sends that value back to the main class, which then displays the value to the user.

## Class: Main

This is a user defined class that is in charge of randomly selecting a face value, assigning it to the five different die, and displaying the result to the user.

### Constructor(s)

There are no constructors in this class. The main purpose of this class is to intiate the five die that will be rolled, and assign each die a face value. Then, this information is handed off to the "Die" class. This class is also responsible for the output of the rolls.

### Attribute(s)

| **Attribute** | **Description** |
| :---        |    :----:   |
| `int[] dieChoices` | An array list of integers that contains all possible face values for the die. |
| `Random gen` | Creates a new random generator to be used to randomly select a face value to assign to the die. |
| `Die rollOne` | A "Die" object that creates a new die object and assigns a face value to that die. |
| `Die rollTwo` | A "Die" object that creates a new die object and assigns a face value to that die. |
| `Die rollThree` | A "Die" object that creates a new die object and assigns a face value to that die. |
| `Die rollFour` | A "Die" object that creates a new die object and assigns a face value to that die. |
| `Die rollFive` | A "Die" object that creates a new die object and assigns a face value to that die. |

### Methods
| **Returns** | **Method** |
| :---        |    :----:   |
| Void | `System.out.println(rollOne + ", " + rollTwo + ", " + rollThree + ", " + rollFour + ", " + rollFive);` | 
| | *Displays the result of each die's roll to the user.* |

## Class: Die

A user defined class that assigns the face value to the die, rolls and recieves a result, and then formats the result in the "d# = #" format. The information is then handed back to the "Main" class to be displayed to the user.

### Constructor(s)

`public Die(int newNumFaces)`

*Creates a new die object using the number of faces provided by the face value from the `Main` class. Then it rolls the die.*

### Attribute(s)

| **Attribute** | **Description** |
| :---        |    :----:   |
| `private int faceValue` | An integer that stores the face value of the rolled die. |
| `private int numFaces` | An integer that stores the number of faces on the die. |
| `int newFaceValue` | An integer specific to the `Roll()` method that temporarily holds the face of the value until it is assigned to `faceValue` and returned. |


### Methods
| **Returns** | **Method** |
| :---        |    :----:   |
| Integer | `roll()` |
| | *Takes the number of faces provided by the `Die` constructor and randomly selects a number between 1 - the maximum number of faces. The value is then assigned to `newFaceValue` which is then assigned to `faceValue` and then returned to the `Main` class.* |
| Integer | `getFaceValue()` |
| | *Returns the current `faceValue` to the class that calls it.* |
| Integer | `getNumFaces()` |
| | *Returns the current `numFaces` to the class that calls it.* |
| String | `toString()` |
| | *Formats the result of the die roll as "d(numFaces) = (faceValue)" (i.e. d4 = 2) and returns it as a string to the class that calls it.*|
