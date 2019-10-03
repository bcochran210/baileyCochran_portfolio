package DieRoller;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        
        //Array to hold all of the different die face values
        int[] dieChoices = new int[]{4, 6, 8, 10, 12, 20, 100};
        
        //Random "generator" to use random method with the array to select a random index
        Random gen = new Random();
        
        //Create five new die items, each selecting a random face value
        //and rolling with said face value
        Die rollOne = new Die(dieChoices[gen.nextInt(dieChoices.length)]);
        Die rollTwo = new Die(dieChoices[gen.nextInt(dieChoices.length)]);
        Die rollThree = new Die(dieChoices[gen.nextInt(dieChoices.length)]);
        Die rollFour = new Die(dieChoices[gen.nextInt(dieChoices.length)]);
        Die rollFive = new Die(dieChoices[gen.nextInt(dieChoices.length)]);
        
        //Print the die rolls
        System.out.println(rollOne + ", " + rollTwo + ", " + rollThree + ", " + rollFour + ", " + rollFive);
        
    }
    
}
