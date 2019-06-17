import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    // 13) ARRAYS: just like a shelf holds boxes, an array holds variables

    int[] numberArray = {1, 3, 5, 7, 9};
    int[] blankArray = new int[10];

    System.out.println(numberArray[2]);
    System.out.println(blankArray[7]);

    for (int i = 0; i < numberArray.length; i++) {
      System.out.println(numberArray[i]);
    }

    for (int currentNumber : numberArray) {
      System.out.println(currentNumber);
    }

    // 14) FUNCTIONS: how we use code that's written somewhere else

    // Write your own function; go to the bottom of the page and fill it in
    System.out.println(numberTransformer(5));

    // 15) CHARACTERS: single letters or numbers

    char letter = 'q';
    char number = '7';

    System.out.println(letter + " " + number);

    // Strings have built-in functions; let's try some out
    String helloString = "hello";
    char[] helloArray = new char[helloString.length()];

    for (int i = 0; i < helloString.length(); i++) {
      helloArray[i] = helloString.charAt(i);
    }

    // A much easier function to do the work for us
    helloArray = helloString.toCharArray();

    // We can also convert back from Array ---> String
    helloString = new String(helloArray);

    // 16) ARRAYLISTS: "smart" arrays that have helpful functions built in!

    // Let's first turn an ordinary Array into a shiny new ArrayList
    char[] oldArray = {'n', 'i', 'f', 't', 'y'};
    ArrayList<Character> newArrayList = new ArrayList<>();
    
    for (char oldLetter : oldArray) {
      newArrayList.add(oldLetter);
    }

    // Now check if a certain letter is in the ArrayList
    char guessLetter = 't';

    if (newArrayList.contains(guessLetter)) {
      System.out.println("You guessed it!");
    }
    else {
      System.out.println("Nope, not this time");
    }


    reader.close();
  }

  public static int numberTransformer(int inputNumber) {

    // Do something here with inputNumber to create outputNumber
    int outputNumber = inputNumber * inputNumber + 356;

    return outputNumber;
  }

}
