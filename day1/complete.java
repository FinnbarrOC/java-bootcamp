import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // A line with two forward slashes is a "comment"; it's greyed-out and does nothing.
    // We'll use them to leave you notes and instructions below!

    // 1) OUTPUT: first, we want the computer to show us some text

    System.out.println("Hello, World!");
    System.out.println("Hello... " + "World!");

    // 2) VARIABLES: we can use variables like labeled boxes to hold data for us

    String myMessage = "My favorite color is green";
    int myNumber = 42;
    System.out.println(myMessage);
    System.out.println("My favorite number is " + myNumber);

    // 3) INPUT: now let's type a message to the computer, save it, and print it back out

    Scanner reader = new Scanner(System.in);

    System.out.println("Type your name, then press Enter:");
    String myName = reader.nextLine();
    System.out.println(myName);
    System.out.println("My name is " + myName);

    // 4) MATH: try some simple addition/subtraction, then see how fast your computer really is!
    //          (because we are using integers, answers will be rounded off to whole numbers)

    System.out.println(2 + 3);
    System.out.println(12 * 12);
    System.out.println(33432 / 596);
    System.out.println(25 * 24 * 23 / 87);

    // 5) TYPE CONVERSION: all varibles have fixed types, but we can convert between types if needed

    String stringNumber = "10";
    System.out.println(stringNumber + 7);  // This does NOT give us 17 like we would expect!
    int intNumber = Integer.parseInt(stringNumber);
    System.out.println(intNumber + 7);     // This works properly

    // 6) CALCULATOR: time to combine everything you've learned to make a simple calculator!

    System.out.println("What is the first number?");
    int number1 = Integer.parseInt(reader.nextLine());
    System.out.println("What is the second number?");
    int number2 = Integer.parseInt(reader.nextLine());

    int sum = number1 + number2;

    System.out.println(number1 + " + " + number2 + " = " + sum);

    reader.close();
  }
}
