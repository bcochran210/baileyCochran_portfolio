package DieRoller;

public class Die {
    
    //Intiate variables
    private int faceValue;
    private int numFaces;
    
    //Method to roll the die
    public int roll() {
        //Set the the face value as a random number based on the number of the
        //faces
        int newFaceValue = (int)(Math.random()* numFaces) + 1;
        this.faceValue = newFaceValue;
        return faceValue;
    }
    
    //Method to return the face value
    public int getFaceValue() {
        return faceValue;
    }
    
    //Method to return the number of faces
    public int getNumFaces() {
        return numFaces;
    }
    
    //Return the number of faces and value of the roll in d# = # format
    public String toString(){
        return "d" + this.getNumFaces() + " = " + this.getFaceValue();
    }
    
    //Method to allow main method to create new die
    public Die(int newNumFaces){
        this.numFaces = newNumFaces; //set the num faces specified in main value to this.numFaces
        roll(); //roll the die with the number of faces specified
    }
}
