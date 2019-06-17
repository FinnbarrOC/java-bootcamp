import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    // 7) BOOLEANS: simple variables that are only "true" or "false"

    boolean myBoolean = true;

    String secret = "password123";
    System.out.println(secret.equals("password123"));

    int magicNumber = 249;
    System.out.println(magicNumber > 300);

    // 8) IF/ELSE: this is how your computer makes simple decisions based on "True" or "False"

    // Check if myBoolean from above is true/false and print the result for both cases
    if (myBoolean == true) {
      System.out.println("myBoolean must be true");
    }
    else {
      System.out.println("myBoolean must be false");
    }

    // Ask the user for a number, then print if that number is positive or negative
    System.out.println("What number do you choose?");
    int mysteryNumber = Integer.parseInt(reader.nextLine());

    if (mysteryNumber < 0) {
      System.out.println(mysteryNumber + " is a negative number");
    }
    else {
      System.out.println(mysteryNumber + " is a positive number");
    }

    // Print a riddle to the user, then ask for an answer. Tell the user if they are right/wrong
    System.out.println("Say my name, and I disappear. What am I?");
    String answer = reader.nextLine();

    if (answer.equals("silence")) {
      System.out.println("You solved my riddle!");
    }
    else {
      System.out.println("Sorry, wrong answer.");
    }

    // 9) CALCULATOR: time to improve on your old calculator by giving the user some options

    System.out.println("What is the first number?");
    int number1 = Integer.parseInt(reader.nextLine());
    System.out.println("What is the second number?");
    int number2 = Integer.parseInt(reader.nextLine());
    System.out.println("Would you like to add or subtract?");
    String operation = reader.nextLine();

    if ((operation.equals("add"))) {
      System.out.println(number1 + number2);
    }
    else {
      System.out.println(number1 - number2);
    }

    // 10) WHILE LOOPS: this is how we can make some lines of code run multiple times, or forever

    int counter = 0;
    while(counter < 10) {
      System.out.println(counter);
      counter += 1;
    }

    // 11) FOR LOOPS: this is another way to run code multiple times

    // Write a FOR loop here that does the exact same thing as the WHILE loop above
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }

    // You can learn about factorials here: https://en.wikipedia.org/wiki/Factorial
    System.out.println("What number should we find the factorial of?");
    int factorialNumber = Integer.parseInt(reader.nextLine());

    int total = 1;
    for (int i = 1; i < factorialNumber + 1; i++) {  // Check for off-by-one errors here
      total = total * i;
    }

    System.out.println("The factorial of " + factorialNumber + " =");
    System.out.println(total);

    // 12) MULTIPLE CONDITIONS: this is how we check if multiple things together are true/false

    System.out.println("What color am I?");
    String animalColor = reader.nextLine();
    System.out.println("How many legs do I have?");
    int animalLegs = Integer.parseInt(reader.nextLine());

    if (animalColor.equals("white") && animalLegs == 4) {
      System.out.println("I must be a polar bear!");
    }
    else if (animalColor.equals("green") || animalLegs == 8) {
      System.out.println("I'm either a lizard or a spider?");
    }
    else if (!animalColor.equals("white") && animalLegs != 4) {
      System.out.println("I'm definitely NOT a polar bear then.");
    }
    else {
      System.out.println("I don't know what I am!");
    }

    // Rewrite the FOR loop from above to use a WHILE loop instead
    // that stops calculating once the total reaches one million
    System.out.println("What number should we find the factorial of?");
    int factorialNumber2 = Integer.parseInt(reader.nextLine());

    int total2 = 1;
    int i = 1;

    while (i < factorialNumber2 + 1 && total2 < 1000000) {
      total2 = total2 * i;
      i += 1;
    }

    System.out.println("The factorial of " + factorialNumber2 + " =");
    System.out.println(total2);

    reader.close();
  }
}
