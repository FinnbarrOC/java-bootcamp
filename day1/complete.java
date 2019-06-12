import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // A line with two forward slashes is a "comment"; it's greyed-out and does nothing.
    // We'll use them to leave you notes and instructions below!


    // 1) OUTPUT: first, we want the computer to show us some text

    System.out.println("Hello, World!");

    // 2) VARIABLES: we can use variables like labeled boxes to hold data for us

    String myMessage = "My favorite color is green";
    System.out.println(myMessage);
    int myNumber = 42;
    System.out.println("My favorite number is " + myNumber);

    // 3) TYPE CONVERSION: all varibles have fixed types, but we can convert between types if needed

    String stringNumber = "10";
    System.out.println(stringNumber + 7);  // This does NOT give us 17 like we would expect!
    int intNumber = Integer.parseInt(stringNumber);
    System.out.println(intNumber + 7);     // This works properly

    // 3) INPUT: now let's type a message to the computer, save it, and print it back out

    Scanner reader = new Scanner(System.in);

    System.out.println("Type your name, then press Enter:");
    String myName = reader.nextLine();
    System.out.println(myName);
    System.out.println("My friend " + myName + " is learning to code!");

    // 4) MATH: try some simple addition/subtraction, then see how fast your computer really is!

    System.out.println(2 + 3);
    System.out.println(12 * 12);
    System.out.println(33432 / 596);
    System.out.println(25 * 24 * 23 / 87);

    // 5) IF/ELSE: this is how your computer makes simple decisions based on "True" or "False"

    System.out.println("What number do you choose?");
    int mysteryNumber = Integer.parseInt(reader.nextLine());
    if (mysteryNumber < 0) {
      System.out.println(mysteryNumber + " is a negative number");
    }
    else {
      System.out.println(mysteryNumber + " is a positive number");
    }

    System.out.println("Say my name, and I disappear. What am I?");
    String answer = reader.nextLine();
    if (answer.equals("silence")) {
      System.out.println("You solved my riddle!");
    }
    else if (answer.equals("Silence")) {
      System.out.println("You solved my riddle!");
    }
    else {
      System.out.println("Sorry, wrong answer.");
    }

    // 6) CALCULATOR: time to combine everything you've learned to make a simple calculator!

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

    // 7) WHILE LOOPS: this is how we can make some lines of code run multiple times, or forever

    while(true) {
      System.out.println("What is the first number?");
    int numberA = Integer.parseInt(reader.nextLine());
    System.out.println("What is the second number?");
    int numberB = Integer.parseInt(reader.nextLine());
    System.out.println("Would you like to add, subtract, or quit?");
    String operation2 = reader.nextLine();

      if (operation2.equals("quit")) {
        System.out.println("Goodbye");
        break;
      }
      else if (operation2.equals("add")) {
        System.out.println(numberA + numberB);
      }
      else {
        System.out.println(numberA - numberB);
      }
    }

    // 8) FOR LOOPS: this is another way to run code multiple times; this should get interesting
    // (you can learn about factorials here: https://en.wikipedia.org/wiki/Factorial)

    System.out.println("What number should we find the factorial of?");
    int factorialNumber = Integer.parseInt(reader.nextLine());
    
    int total = 1;
    for (int i = 1; i < factorialNumber + 1; i++) {  // Check for off-by-one errors here
      total = total * i;
    }

    System.out.println("The factorial of " + factorialNumber + " =");
    System.out.println(total);

    reader.close();
  }
}
