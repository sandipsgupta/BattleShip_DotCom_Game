public class SimpleDotCom {

    int numofHits = 0;
    int[] locationcells;

    //Locationcells = new Locationcells;

   public void setLocationcells(int[] locations) {
       locationcells = locations;
   }
        public String checkYourself(String stringGuess){
            //Guess #1 Scenario
            int guess = Integer.parseInt(stringGuess); //Convert the string to an int

            String result = "miss"; //Default string variable as miss!

            //Guess#2 Scenario
            for (int cell : locationcells) { //For loop to repeat the guess from the locationcells array.Cell is one variable/value of Locationcells array
                if (guess == cell) {
                    result = "hit";
                    //Guess #3 scenario
                    numofHits++;
                    break;
                }
            }
            if (numofHits == locationcells.length) { //Final logic to kill each .com (ship)
                result = "kill";
            }
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