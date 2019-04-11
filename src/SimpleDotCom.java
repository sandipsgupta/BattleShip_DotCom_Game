import java.util.ArrayList;

public class SimpleDotCom {

    int numofHits = 0;
    //int[] locationcells;

    //Locationcells = new Locationcells;
    private ArrayList<String> locationCells = new ArrayList<>();
    // private int numOfHits;
    // don’t need that now
    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    /*public void setLocationcells(int[] locations) {
        locationcells = locations;
    }*/
    public String checkYourself(String userInput) {
        //Guess #1 Scenario
        // int guess = Integer.parseInt(stringGuess); //Convert the string to an int

        String result = "miss"; //Default string variable as miss!
        //for (guess = 1; guess < 9; guess++) {

        //Guess#2 Scenario
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            } // close if
        } // close outer if

                /*for (int cell : locationcells) { //For loop to repeat the guess from the locationcells array.Cell is one variable/value of Locationcells array
                    if (guess == cell) {
                        result = "hit";
                        //Guess #3 scenario
                        numofHits++;
                        break;
                    }
                }

            if (numofHits == locationcells.length) { //Final logic to kill each .com (ship)
                result = "kill";
            }*/
        System.out.print(result);
        return result; //Return the result back to the calling method
    }

}



/*
String checkyourself;


    public int getnumofhits() {return getnumofhits(); }

    public void setnumofhits( int numofhits){ this.numofhits = numofhits; }

    public int getLocationcells() {return Locationcells[20]; }
    public void setLocationcells(int[] locationcells) { this.Locationcells = locationcells; }


    String checkyourself(String UserGuess){

     return checkyourself;
    }
 */