import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    // 7) BOOLEANS: simple variables that are only "true" or "false"



    // 8) IF/ELSE: this is how your computer makes simple decisions based on "True" or "False"

    // Check if myBoolean from above is true/false and print the result for both cases


    // Ask the user for a number, then print if that number is positive or negative


    // Print a riddle to the user, then ask for an answer. Tell the user if they are right/wrong


    // 9) CALCULATOR: time to improve on your old calculator by giving the user some options

    // This is OLD code from yesterday; modify this with IF and ELSE statements!
    System.out.println("What is the first number?");
    int number1 = Integer.parseInt(reader.nextLine());
    System.out.println("What is the second number?");
    int number2 = Integer.parseInt(reader.nextLine());

    int result = number1 + number2;

    System.out.println(number1 + " + " + number2 + " = " + result);

    // 10) WHILE LOOPS: this is how we can make some lines of code run multiple times, or forever



    // 11) FOR LOOPS: this is another way to run code multiple times

    // Write a FOR loop here that does the exact same thing as the WHILE loop above


    // You can learn about factorials here: https://en.wikipedia.org/wiki/Factorial


    // 12) MULTIPLE CONDITIONS: this is how we check if multiple things together are true/false

    // Rewrite the FOR loop from above to use a WHILE loop instead
    // that stops calculating once the total reaches one million


    reader.close();
  }
}
