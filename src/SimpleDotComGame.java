public class SimpleDotComGame {

    public static void main(String[] args) {

        int numofGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
//
        int randomNum = (int) (Math.random() * 5); //Instead of predefined no. choose random no for locations

       int[] locations = {randomNum, randomNum + 1, randomNum + 2};
       // int[] locations = {4, 5, 6};
        theDotCom.setLocationcells(locations);

        boolean isAlive = true;

        while (isAlive == true) {
            String userGuess = helper.getUserInput("Enter a number\t");
            String result = theDotCom.checkYourself(userGuess);

            numofGuesses++;

            if (result.equals("kill"))
                isAlive = false;

            //System.out.print("The .com ship sank");
            System.out.println("\tYou took\t" +  numofGuesses + "\tguesses");

        }
    }
}

   // String testResult = "failed";

/*}   if (result.equals("hit")){
            testResult ="passed";
        }
        System.out.println(testResult);
    }
*/