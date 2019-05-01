import java.io.*;
import java.util.ArrayList;//<java.lang.String>;
import java.util.Arrays;

public class SimpleDotComGame {

  /*  public static void main(String[] args) {

        int numofGuesses = 0;
        GameHelper helper = new GameHelper();


        SimpleDotCom theDotCom = new SimpleDotCom();

        SimpleDotCom.setLocationCells((ArrayList<String>)Arrays.stream(locations).boxed().map(String::valueOf).collect(Collectors.toList()));
        int randomNum = (int) (Math.random() * 5); //Instead of predefined no. choose random no for locations



       int[] locations = {randomNum, randomNum + 1, randomNum + 2};

        int[] locations = {4, 5, 6};
        theDotCom.setLocationcells(locations);

        theDotCom.setLocationCells();


        boolean isAlive = true;
        for (numofGuesses = 1; numofGuesses < 9; numofGuesses++) {

            while (isAlive == true) {

                String userGuess = helper.getUserInput("Enter a number\t");
                String result = theDotCom.checkYourself(userGuess);

                numofGuesses++;

                if (result.equals("kill"))
                    isAlive = false;

                //System.out.print("The .com ship sank");
                System.out.println("\tYou took\t" + numofGuesses + "\tguesses");

            }
        }
    }



/*}   if (result.equals("hit")){
            testResult ="passed";
        }
        System.out.println(testResult);
    }
*/

    public static void main(String[] args) {
        GameHelper helper = new GameHelper();
        SimpleDotCom dotCom = new SimpleDotCom();

        // create and add locations using random generator
        int rnd = (int) (Math.random() * 5);
        dotCom.setLocationCells(new ArrayList<>(Arrays.asList(String.valueOf(rnd), String.valueOf(rnd + 1), String.valueOf(rnd + 2)))); //The change of int [] declaration to Arraylist

        //replace int[] to Arraylist;

        boolean isAlive = true;
        int numOfGuesses = 0;

        while (isAlive == true) {
            String result = dotCom.checkYourself(helper.getUserInput("Enter a number"));
            numOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;
               //1 System.out.println("\n");
                System.out.println("\n" + "You took " + numOfGuesses + " guesses, to" + "destroy the DotCom");
            }
        }
    }
}