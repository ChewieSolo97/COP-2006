import java.util.Scanner;

// decided to put general comments here, 
// not sure where else would be better
// Mitchell Donaghy last updated 3/11/17
// for some reason when printing to PDF I can only go up to
// line 68, so all my lines are (annoyingly) short
// this project is not complete yet, needs to be filled in later
// but all things necessary for Integration Project PSI 2
// Inspection are here (I think)

// a varible is a location in memory
// tatoo "class is code" on arm
// several lines will likely be used often, so I made them strings
// I partially fixed needing to restart everytime to go back 
// but it doesn't always work quite right and isn't complete

// I don't need this, but it was in the PSI so...
class NotSureWhatToDoWithThis {
  private String useless = "useless";
  private int why;

  public int getWhy() {
    return why;
  }

  public String getUseless() {
    return useless;
  }

  public void setWhy(int why2) {
    why = why2;
  }

  public void setUseless(String useless2) {
    useless = useless2;
  }
}

public class Main {

  static Scanner scan = new Scanner(System.in);

  // method header
  public static void Menu(String menuSelection) {
    String menu = "Welcome to my integration project \n\n"
      + "1: Exercises \n2: Stuff from videos \n"
      + "3: Glossary \n4: Misc. \n\n" + menuSelection;
    System.out.println(menu);
  }

  // method with parameters here
  public static int MenuInput1(String menuGreet,
    String menuSelection) {
    System.out.println("\n" + menuGreet + "Exercises\n");
    String assignmentMenu = menuSelection + "\n1:Hacker Rank"
      + " Exercises \n2:Other Exercises \nEnter 0 to return "
      + "to main menu.";
    System.out.println(assignmentMenu);
    int subMenuInput = scan.nextInt();
    return subMenuInput;
  }

  public static int subMenuIn1(String menuGreet,
    String menuSelection, String hrExercise) {
    System.out.println("\n" + menuGreet + hrExercise);
    System.out.println(menuSelection + "\n1: Week 1 " + hrExercise
      + "2: Week 2 " + hrExercise + "3: Week 3 " + hrExercise
      + "4: Week 4 " + hrExercise);
    int exercise = scan.nextInt();
    return exercise;
  }

  public static void doExercisesWk1(String menuGreet,
    String hrExercise, String menuSelection, String exeOut,
    String invalidInput, int goBack) {
    System.out.println("\n" + menuGreet + "Week 1 " + hrExercise);
    System.out.println(menuSelection);
    System.out.println(
      "\n1: Welcome to Java! \n2: " + "Day 0: Hello, World\n");
    int wk1hr = scan.nextInt();
    // a switch could have worked, but this seemed better
    // with only 3
    if (wk1hr == 1) {
      System.out.println("\nWelcome to Java! \n\nThis "
        + "assignment introduces basic output "
        + "using System.out.println();");
      System.out.println(exeOut);
      // my exercise follows, with unneeded parts
      // commented out

      // public class Solution {

      // public static void main(String[] args) {
      System.out.println("Hello, World.");
      System.out.println("Hello, Java."); // }
      // }

    } else if (wk1hr == 2) {
      System.out.println("\nDay 0: Hello, World \n\n"
        + "This is Day 0 in 30 Days of Code; The Hello"
        + " World Program\n\nThis assignment "
        + "introduces the scanner, which can accept "
        + "input for the program to use.\n\nThe input"
        + " of this program was:\n\nWelcome to 30 "
        + "Days of Code! \n\nAnd the output was:\n");
      // my exercise follows, with unneeded parts
      // commented out

      // public class Solution {
      // public static void main(String[] args) {

      // Scanner scan = new Scanner(System.in);
      // String inputString = scan.nextLine();
      // scan.close();
      // I had to add this since Hacker Rank auto inputs
      String daysofcode = "Welcome to 30 Days " + "of Code!";

      System.out.println("Hello, World.");
      System.out.println(daysofcode);
      // }
      // }

    } else {
      System.out.println(invalidInput);
      goBack = 0;
    }
  }

  public static int Exerciseswk2(String menuGreet,
    String hrExercise, String menuSelection) {
    System.out.println("\n" + menuGreet + "Week 2 " + hrExercise);
    System.out.println(menuSelection);
    System.out.println("1: Day 1: Data Types \n2: Java "
      + "Stdin and Stdout I \n3: Java Stdin and "
      + "Stdout II \n4: Java Data Types\n");
    int wk2hr = scan.nextInt();
    return wk2hr;

  }

  // method header
  public static void hrDay1() {
    // I need to add better explanations of exercises
    System.out.println("\nDay 1: Data Types \n\nThis"
      + " assignment works with basic data types."
      + "\n\nThe input of this program was:\n\n12, "
      + "4.0, and 'is the best place to learn and "
      + "practice coding!' \n\nAnd the output " + "was:\n");
    // unused code from excercise follows in comments
    // import java.io.*;
    // import java.util.*;
    // import java.text.*;
    // import java.math.*;
    // import java.util.regex.*;
    // public class Solution {
    // public static void main(String[] args) {
    int i = 4;
    double d = 4.0;
    String s = "HackerRank ";
    // Scanner scan = new Scanner(System.in);
    int stuff = 12;
    double moreStuff = 4.0;
    String otherStuff = "is the best place to learn"
      + " and practice coding!";
    // stuff = scan.nextInt();
    // morestuff = scan.nextDouble();
    // scan.nextLine();
    // otherstuff = scan.nextLine();
    System.out.println(i + stuff);
    System.out.println(d + moreStuff);
    System.out.println(s + otherStuff);
  }

  public static int glossary(String menuGreet,
    String menuSelection) {
    System.out.println("\n" + menuGreet + "Glossary\n");
    // add this somewhere later
    // if (name.equals("text")); checks strings to see if equal
    System.out.println(menuSelection + "\n1: Primitive Data "
      + "Types \n2: Other Definitions\n3: " + "Java Operations\n");
    int glossinput = scan.nextInt();
    // glossary MSS
    return glossinput;

  }

  public static void hrStdInOut() {
    System.out.println("\nJava Stdin and Stdout I \n\nThis "
      + "exercise uses basic input and output.\n");
    // parts commented out had to be
    // removed/replaced for this to work

    // import java.util.*;
    // public class Solution {
    // public static void main(String[] args) {
    // Scanner scan = new Scanner(System.in);
    System.out.println("Please input 3 integers");
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    // }
    // }
  }

  public static void hrStdInOut2() {
    System.out.println("\nJava Stdin and Stdout II \n\nThis "
      + "exercise uses several types of basic input and "
      + "basic output.\n");
    // import java.util.Scanner;
    // public class Solution {
    // public static void main(String[] args) {
    // Scanner scan = new Scanner(System.in);
    System.out.println("Please enter an integer");
    int i = scan.nextInt();
    System.out.println("Please enter a double");
    double d = scan.nextDouble();
    scan.nextLine(); // needed this to eat enter
    System.out.println("Please enter a string");
    String s = scan.nextLine();
    System.out.println("Int: " + i);
    System.out.println("Double: " + d);
    System.out.println("String: " + s);
    // }
    // }
  }

  public static void hrJavaDataTypes() {
    System.out.println("Java Data Types \n\n"
      + "This exercise takes in numbers and "
      + "outputs which (if any) \nof the "
      + "following data types they fit in: \n"
      + "byte, short, int, long.");
    // import java.util.*;
    // import java.io.*;

    // class Solution{
    // public static void main(String []argh)
    // {
    // Scanner sc = new Scanner(System.in);
    System.out
      .println("\nInput how many numbers you want to try. \n");
    int t = scan.nextInt();
    System.out.println("\nInput " + t + " numbers.");
    // for loop
    for (int i = 0; i < t; i++) {
      try {
        long x = scan.nextLong();
        System.out.println(x + " can be fitted in:");
        // conditional operator &&
        // relational operator <=
        if (x >= -128 && x <= 127)
          System.out.println("* byte");
        if (x >= -32768 && x <= 32767)
          System.out.println("* short");
        if ((x >= (Integer.MIN_VALUE))
          && (x <= (Integer.MAX_VALUE)))
          System.out.println("* int");
        if ((x >= (Long.MIN_VALUE)) && (x <= (Long.MAX_VALUE)))
          System.out.println("* long");
      } catch (Exception e) {
        System.out
          .println(scan.next() + " can't be fitted anywhere.");
      }
    }
    // }
    // }
  }

  public static void interestCalc() {
    System.out.println(
      "This is a calculater for yearly" + " compounded interest.");
    Scanner scanner = new Scanner(System.in);
    double amount;
    System.out.println("Please enter your starting amount.");
    double principle = scanner.nextDouble();
    System.out.println(
      "Please enter your interest rate. \n" + "i.e. 0.05");
    double rate = scanner.nextDouble();
    System.out
      .println("Please enter how many years you will invest.");
    int year = scanner.nextInt();
    // for loop
    for (int lastyear = 0; lastyear <= year; lastyear++) {
      amount = principle * Math.pow(1 + rate, lastyear);
      System.out.println(lastyear + " $" + amount);
    }
    scanner.close();
  }

  public static void sumOfArray() {
    // an array and the sum using an accumulator
    int bucky[] = { 21, 16, 86, 21, 3 };
    int sum = 0;
    for (int i = 0; i < bucky.length; i++) {
      sum += bucky[i];
    }
    System.out.println("The sum of these numbers is " + sum);
  }

  public static void valueShort() {
    // had to use doubles for these, eclipse wouldn't
    // do anything else, so I just casted them to shorts
    double minValShort = Math.pow(-2, 15);
    double maxValShort = Math.pow(2, 15) - 1;
    System.out.println("\n\nshort: A signed 2's complement 16-bit"
      + " integer, with min value of" + (short) minValShort
      + " and max value of " + (short) maxValShort);
  }

  public static void valueInt() {
    double minValInt = Math.pow(-2, 31);
    double maxValInt = Math.pow(2, 31) - 1;
    System.out.println("\n\nint: A signed 2's complement"
      + " 32-bit integer, with min value of " + (int) minValInt
      + " and max value of " + (int) maxValInt);
  }

  public static void valueLong() {
    double minValLong = Math.pow(-2, 63);
    double maxValLong = Math.pow(2, 63) - 1;
    System.out.println("\n\nlong: A signed 2's complement 64-bit"
      + " integer, with min value of " + (long) minValLong
      + " and max value of " + (long) maxValLong);
  }

  public static void intDivision() {
    // replaced .equals with ints
    // demonstration and definition of integer division w/ real
    // answer using casting
    System.out.println("Interger divison: if you divide two "
      + "integers, the results is always an integer.\n");
    System.out.println("Please enter an integer\n");
    int intOne = scan.nextInt();
    System.out.println("\nPlease enter another integer\n");
    int intTwo = scan.nextInt();
    int result = intOne / intTwo;
    System.out.println("\n" + intOne + " divided by " + intTwo
      + " equals " + result + " ,even though the "
      + "real answer is" + ((double) intOne / (double) intTwo));
  }

  public static void valueChar() {
    // the max/min unicode values of char didn't show up
    System.out.println("\n\nchar: a single 16-bit Unicode "
      + "character. It has a minimum value of 0 and a maximum"
      + " value of 65,535 inclusive.");
  }

  public static void main(String[] args) {

    int goBack = 1;
    // do-while loop for returning after bad input
    do {
      String menuSelection = "Please enter the number of the "
        + "section you want to go to.\n";

      Menu(menuSelection);
      int menuInput = scan.nextInt();
      // while (menuInput > 0) {
      String menuGreet = "Welcome to ";
      String invalidInput = "\nInvalid input\n";
      String exeOut = "\nThe output of my exercise follows: \n";
      String hrExercise = "Hacker Rank Exercises\n";
      // I will be using essentially nested switch statements
      // main "menu switch statement" (part in "" abbreviated
      // as MSS in future)

      switch (menuInput) {
        case (1):
          // method call with return
          int subMenuIn = MenuInput1(menuGreet, menuSelection);
          // exercises MSS
          switch (subMenuIn) {
            // case 0 doesnt work quite right yet
            // case (0):
            // goBack = 0;
            case (1):
              int exercise = subMenuIn1(menuGreet, menuSelection,
                hrExercise);
              // hacker rank MSS
              switch (exercise) {
                case (1):
                  doExercisesWk1(menuGreet, hrExercise, exeOut,
                    menuSelection, invalidInput, goBack);
                  break;
                case (2):
                  // call arguments
                  int wk2hr = Exerciseswk2(menuGreet, hrExercise,
                    menuSelection);
                  switch (wk2hr) {
                    case (1):
                      // basic method call
                      hrDay1();
                      break;
                    case (2):
                      hrStdInOut();
                      break;
                    case (3):
                      hrStdInOut2();
                      break;
                    case (4):
                      hrJavaDataTypes();
                      break;
                    default:
                      System.out.println(invalidInput);
                      goBack = 0;
                      break;
                  }
                  break;
                case (3):
                  System.out.println(
                    "\n" + menuGreet + "Week 3 " + hrExercise);
                  System.out.println("\nThis area is under "
                    + "construction, please excuse our bits.");
                  break;
                case (4):
                  System.out.println(
                    "\n" + menuGreet + "Week 4 " + hrExercise);
                  System.out.println("\nThis area is under "
                    + "construction, please excuse our bits.");
                  break;
                default:
                  System.out.println(invalidInput);
                  goBack = 0;
                  break;
              }
              // end of hacker rank exercises
              break;
            case (2):
              System.out.println(menuGreet + "Other Exercises");
              System.out
                .println("\nThis area is under construction, "
                  + "please excuse our bits.");
              break;
            default:
              System.out.println(invalidInput);
              goBack = 0;
              break;
          }
          break;
        case (2):
          System.out
            .println("\n" + menuGreet + "stuff from videos\n");
          System.out.println(menuSelection + "\n1: Bucky's Room"
            + "\n2: Cave of Programming \n3: Etc.");
          int otherVideos = scan.nextInt();
          if (otherVideos == 1) {
            // need to expand this later
            System.out.println(menuSelection + "\n1: Compound "
              + "interest calculator \n2: Sum of an array");
            int buckysRoom = scan.nextInt();
            if (buckysRoom == 1) {
              interestCalc();
            } else if (buckysRoom == 2) {
              sumOfArray();
            } else {
              System.out.println(invalidInput);
              goBack = 0;
            }
          } else if (otherVideos == 2) {
            System.out
              .println("\nThis area is under construction, "
                + "please excuse our bits.");
          } else if (otherVideos == 3) {
            System.out
              .println("\nThis area is under construction, "
                + "please excuse our bits.");
          } else {
            System.out.println(invalidInput);
            goBack = 0;
          }
          break;
        case (3):
          int glossinput = glossary(menuGreet, menuSelection);
          switch (glossinput) {
            case (1):
              System.out.println("\nThere are eight primitive "
                + "data types:\n\n1: byte \n2: short \n3: "
                + "int \n4: long \n5: float \n6: double "
                + "\n7: boolean \n8: char \n\n" + menuSelection
                + "\n\nFollowing definitions from: https://"
                + "docs.oracle.com/javase/tutorial/java/"
                + "nutsandbolts/datatypes.html \n\n");
              int datatypes = scan.nextInt();
              // data types MSS
              switch (datatypes) {
                case (1):
                  System.out.println("\n\nbyte: A signed 2's "
                    + "complement 8-bit integer, with min value"
                    + " of -128 and max value of 127");
                  break;
                case (2):
                  valueShort();
                  break;
                case (3):
                  valueInt();
                  break;
                case (4):
                  valueLong();
                  break;
                case (5):
                  System.out
                    .println("\n\nfloat: A single-precision "
                      + "32-bit IEEE 754 floating point.");
                  break;
                case (6):
                  System.out
                    .println("\n\ndouble: A double-precision"
                      + " 64-bit IEEE 754 floating point.");
                  break;
                case (7):
                  System.out.println(
                    "\n\nboolean: Can only be true or" + " false");
                  break;
                case (8):
                  valueChar();
                  break;
                default:
                  System.out.println(invalidInput);
                  break;
                // end of data types switch
              }
              break;
            case (2):
              System.out
                .println("\nVariable: a location in memory.\n"
                  + "\nClass: code.\n\nRelational operators:"
                  + " determine if one operand is greater \n"
                  + "than, less than, equal to, or not equal"
                  + " to another operand. \n\nConditional "
                  + "operators: checks two boolean expressions"
                  + " to see \nif one or both are true.");
              // some definitions are from oracle
              break;
            case (3):
              System.out
                .println("\nThis area is under construction, "
                  + "please pardon our bits.");
              break;
            default:
              System.out.println(invalidInput);
              goBack = 0;
              break;
          }
          break;
        // end of glossary switch
        // start of Misc.
        case (4):
          System.out.println("\n" + menuGreet + "Misc.\n");
          // need to fill Misc. with more later
          System.out
            .println(menuSelection + "\n1: Integer division "
              + "\n2: Math operations \n3: This is broken..."
              + "\n4: Relational Operators \n5: Conditional"
              + " Operators \n6: While Loop \n7: Smallest "
              + "value in an array \n8: Search an array and "
              + "identify the index where a value was found");
          int miscSelect = scan.nextInt();
          if (miscSelect == 1) {
            intDivision();
          } else if (miscSelect == 2) {
            System.out
              .println(menuSelection + "\n1: addition \n2: "
                + "subtraction \n3: multiplication \n4: "
                + "division \n5: remainder \n6: power \n");
            int mathOp = scan.nextInt();
            // math operations switch
            switch (mathOp) {
              case (1):
                System.out
                  .println("\nAddition: \n\nPlease select a "
                    + "number, then a number to add. \n");
                double add1 = scan.nextDouble();
                double add2 = scan.nextDouble();
                System.out.println("\n" + add1 + " plus " + add2
                  + " equals: " + (add1 + add2));
                break;
              case (2):
                System.out
                  .println("\nSubtraction: \n\nPlease select a "
                    + "number, then a number to subtract. \n");
                double sub1 = scan.nextDouble();
                double sub2 = scan.nextDouble();
                System.out.println("\n" + sub1 + " minus " + sub2
                  + " equals: " + (sub1 - sub2));
                break;
              case (3):
                System.out.println("\nMultiplication: \n\nPlease "
                  + "select a number, then a number to "
                  + "multiply by. \n");
                double multi1 = scan.nextDouble();
                double multi2 = scan.nextDouble();
                System.out
                  .println("\n" + multi1 + " multiplied by "
                    + multi2 + " equals: " + multi1 * multi2);
                break;
              case (4):
                System.out.println("\nDivision: \n\nPlease select"
                  + " a number, then a number to divide by.\n");
                double numerator1 = scan.nextDouble();
                double denominator1 = scan.nextDouble();
                System.out.println(
                  "\n" + numerator1 + " divided by " + denominator1
                    + " equals: " + (numerator1 / denominator1));
                break;
              case (5):
                System.out.println("\nRemainder: \n\nPlease select"
                  + " a number, then a number to divide by.\n");
                double numerator2 = scan.nextDouble();
                double denominator2 = scan.nextDouble();
                System.out.println("\nThe remainder of "
                  + numerator2 + " divided by " + denominator2
                  + " is: " + (numerator2 % denominator2));
                break;
              case (6):
                System.out.println("\nPower: \nPlease select a "
                  + "base number, then a power to raise "
                  + "it to.\n");
                double base = scan.nextDouble();
                double power = scan.nextDouble();
                System.out.println(base + " raised to the " + power
                  + " equals: " + Math.pow(base, power));
                break;
              default:
                System.out.println(invalidInput);
                goBack = 0;
                break;
            }
            // math operations switch end
          } else if (miscSelect == 3) {
            // infinite while loop because I felt like it
            // infinite loop is infinite
            while (1 == 1) {
              System.out.println("This is broken...");
              System.out.println("Why did you do this?");
              System.out.println("Please stop this...");
            }
          } else if (miscSelect == 4) {
            System.out.println("\nRelational Operators: \n" + "\n"
              + menuSelection + "\n1: Equal to \n2: "
              + "Not equal \n3: Greater than \n4: "
              + "Greater than or equal to \n5: Less than \n6:"
              + " Less than or equal to \n");
            int relatOp = scan.nextInt();
            switch (relatOp) {
              case (1):
                System.out.println("Equal to: \n\nPlease enter "
                  + "two integers \n");
                int num1 = scan.nextInt();
                int num2 = scan.nextInt();
                if (num1 == num2) {
                  System.out.println(num1 + " equals " + num2);
                } else {
                  System.out
                    .println(num1 + " doesn't equal " + num2);
                }
                break;
              case (2):
                System.out.println("\nNot equal: \n\nPlease enter"
                  + " two integers \n");
                int numOne = scan.nextInt();
                int numTwo = scan.nextInt();
                if (numOne != numTwo) {
                  System.out
                    .println(numOne + " doesn't equal " + numTwo);
                } else {
                  System.out.println(numOne + " equals " + numTwo);
                }
                break;
              case (3):
                System.out.println("\nGreater than: \n\nPlease "
                  + "enter two integers \n");
                int num11 = scan.nextInt();
                int num22 = scan.nextInt();
                if (num11 > num22) {
                  System.out
                    .println(num11 + " is greater than " + num22);
                } else {
                  System.out.println(
                    num11 + " is not greater than " + num22);
                }
                break;
              case (4):
                System.out.println("\nGreater than or equal to: "
                  + "\n\nPlease enter two integers \n");
                int num10 = scan.nextInt();
                int num20 = scan.nextInt();
                if (num10 >= num20) {
                  System.out.println(num10
                    + " is greater than or equal to " + num20);
                } else {
                  System.out.println(num10 + " is not greater "
                    + "than or equal to " + num20);
                }
                break;
              case (5):
                System.out.println("\nLess than: \n\nPlease enter"
                  + " two integers \n");
                int num12 = scan.nextInt();
                int num23 = scan.nextInt();
                if (num12 < num23) {
                  System.out
                    .println(num12 + " is less than " + num23);
                } else {
                  System.out
                    .println(num12 + " is not less than " + num23);
                }
                break;
              case (6):
                System.out.println("\nLess than or equal to: "
                  + "\n\nPlease enter two integers \n");
                int num19 = scan.nextInt();
                int num21 = scan.nextInt();
                if (num19 <= num21) {
                  System.out.println(num19 + " is less than or "
                    + "equal to " + num21);
                } else {
                  System.out.println(num19 + " is not less than "
                    + "or equal to " + num21);
                }
                break;
              default:
                System.out.println(invalidInput);
                goBack = 0;
                break;
            }
          } else if (miscSelect == 5) {
            System.out
              .println("Condition operators: \n\n" + menuSelection
                + "\n1: Conditional AND \n2: Conditional OR");
            int condOp = scan.nextInt();
            if (condOp == 1) {
              System.out.println(
                "Conditional AND: \nEnter " + "two integers");
              int and1 = scan.nextInt();
              int and2 = scan.nextInt();
              if (and1 > 0 && and2 > 0) {
                System.out.println("Both are greater than zero");
              } else {
                System.out.println("One or both are less than or "
                  + "equal to zero");
              }
            } else if (condOp == 2) {
              System.out.println(
                "Conditional OR: \nEnter " + "two integers");
              int or1 = scan.nextInt();
              int or2 = scan.nextInt();
              if (or1 > 0 || or2 > 0) {
                System.out.println(
                  "One or both are greater " + "than zero");
              } else {
                System.out.println(
                  "Both are less than or equal " + "to zero");
              }

            } else {
              System.out.println(invalidInput);
              goBack = 0;
            }
          } else if (miscSelect == 6) {
            // made a factorial "calculater" with a while loop
            System.out
              .println("\nWhile loop: \n\nEnter " + "a number\n");
            int fact = scan.nextInt();
            // I figured long should be big enough for
            // reasonable numbers
            long factorial = fact;
            System.out.print("\n" + fact + " factorial" + " is ");
            // while loop
            while (fact > 1) {
              factorial = factorial * (fact - 1);
              fact--;
            }
            System.out.println(factorial);
          } else if (miscSelect == 7) {
            // smallest value in an array
            int[] array = { 25, 32, 79, 5, 90, 400, 6, 9 };
            int smallest = Integer.MAX_VALUE;
            for (int i = 0; i < array.length; i++) {
              if (array[i] < smallest) {
                smallest = array[i];
              }
            }
            System.out
              .println("Smallest number in array is: " + smallest);
          } else if (miscSelect == 8) {
            // search an array and identify the index where a
            // value was found
            int[] array2 = { 40, 30, 50, 88 };
            for (int i = 0; i < array2.length; i++) {
              if (array2[i] == 50) {
                System.out.println("50 was found in the array at"
                  + " position " + i);
              }
            }
          } else {
            System.out.println(invalidInput);
          }
          break;
        // end of Misc
        default:
          System.out.println(invalidInput);
          goBack = 0;
          break;
      }
      // }

    } while (goBack == 0);
    scan.close();
  }

}