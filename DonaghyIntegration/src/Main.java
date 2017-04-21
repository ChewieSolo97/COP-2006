import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

// decided to put general comments here, 
// not sure where else would be better
// Mitchell Donaghy last updated 4/20/17
// for some reason when printing to PDF I can only go up to
// line 68, so all my lines are (annoyingly) short
// project isn't complete yet, there's more I want to add later
// but all things necessary for Integration Project PSI 3
// Inspection are here (I think)

// a varible is a location in memory
// tatoo "class is code" on arm
// several lines will likely be used often, so I made them strings
// I got rid of what I did to make it loop back to previous menu
// I couldn't get it to work right, going to try to re-add 
// something for this in the future
// I decided to use less user input, the sheer amount of 
// try/catches is ridiculous, they added several hundred lines

public class Main {

  // I figured it would be best to have a class level scanner
  // considering how much I use it
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    String menuSelection = "Please enter the number of the "
        + "section you want to go to.\n";

    doMenu(menuSelection);
    int menuInput = -1;
    boolean goodInput = false;
    while (goodInput == false) {
      try {
        menuInput = scan.nextInt();
        goodInput = true;
      } catch (InputMismatchException e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      } catch (Exception e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      }
    }
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
        int subMenuIn = giveMenuInput1(menuGreet, menuSelection);
        // exercises MSS
        switch (subMenuIn) {
          case (1):
            int exercise = doSubMenuIn1(menuGreet, menuSelection,
                hrExercise);
            // hacker rank MSS
            switch (exercise) {
              case (1):
                doExercisesWk1(menuGreet, hrExercise, exeOut,
                    menuSelection, invalidInput);
                break;
              case (2):
                // call arguments
                int wk2hr = doExercisesWk2(menuGreet, hrExercise,
                    menuSelection);
                switch (wk2hr) {
                  case (1):
                    // basic method call
                    doHrDay1();
                    break;
                  case (2):
                    doHrStdInOut();
                    break;
                  case (3):
                    doHrStdInOut2();
                    break;
                  case (4):
                    doHrJavaDataTypes();
                    break;
                  default:
                    System.out.println(invalidInput);
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
              case (5):
                System.out.println(
                    "\n" + menuGreet + "Week 5 " + hrExercise);
                System.out.println("\nThis area is under "
                    + "construction, please excuse our bits.");
                break;
              case (6):
                System.out.println(
                    "\n" + menuGreet + "Week 6 " + hrExercise);
                System.out.println("\nThis area is under "
                    + "construction, please excuse our bits.");
                break;
              case (7):
                System.out.println(
                    "\n" + menuGreet + "Week 7 " + hrExercise);
                System.out.println("\nThis area is under "
                    + "construction, please excuse our bits.");
                break;
              case (8):
                System.out.println(
                    "\n" + menuGreet + "Week 8 " + hrExercise);
                System.out.println("\nThis area is under "
                    + "construction, please excuse our bits.");
                break;
              case (9):
                System.out.println(
                    "\n" + menuGreet + "Week 9 " + hrExercise);
                System.out.println(menuSelection);
                System.out.println("1: Java Strings Introduction "
                    + "\n2: Time Conversion "
                    + "\n3: Day 10: Binary Numbers \n");
                int HrWk9 = -1;
                goodInput = false;
                while (goodInput == false) {
                  try {
                    HrWk9 = scan.nextInt();
                    goodInput = true;
                  } catch (InputMismatchException e) {
                    System.out.println("Please enter an integer");
                    scan.nextLine();
                  } catch (Exception e) {
                    System.out.println("Unknown error");
                    scan.nextLine();
                  }
                }
                if (HrWk9 == 1) {
                  doJavaStringsIntro();
                } else if (HrWk9 == 2) {
                  doTimeConversion();
                } else if (HrWk9 == 3) {
                  doDay10Hr();
                } else {
                  System.out.println(invalidInput);
                }

                break;
              case (10):
                System.out.println(
                    "\n" + menuGreet + "Week 10 " + hrExercise);
                System.out.println("\nThis area is under "
                    + "construction, please excuse our bits.");
                break;
              case (11):
                System.out.println(
                    "\n" + menuGreet + "Week 11 " + hrExercise);
                System.out.println("\nThis area is under "
                    + "construction, please excuse our bits.");
                break;
              case (12):
                System.out.println(
                    "\n" + menuGreet + "Week 12 " + hrExercise);
                System.out.println("\nThis area is under "
                    + "construction, please excuse our bits.");
                break;
              case (13):
                doQueuesAndStacks(menuGreet, menuSelection);
                break;
              default:
                System.out.println(invalidInput);
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
            break;
        }
        break;
      case (2):
        System.out
            .println("\n" + menuGreet + "stuff from videos\n");
        System.out.println(menuSelection + "\n1: Bucky's Room"
            + "\n2: Cave of Programming \n3: Etc.");
        int otherVideos = -1;
        goodInput = false;
        while (goodInput == false) {
          try {
            otherVideos = scan.nextInt();
            goodInput = true;
          } catch (InputMismatchException e) {
            System.out.println("Please enter an integer");
            scan.nextLine();
          } catch (Exception e) {
            System.out.println("Please enter an integer");
            scan.nextLine();
          }
        }
        if (otherVideos == 1) {
          // need to expand this later
          System.out.println(menuSelection + "\n1: Compound "
              + "interest calculator \n2: Sum of an array");
          int buckysRoom = -1;
          goodInput = false;
          while (goodInput == false) {
            try {
              buckysRoom = scan.nextInt();
              goodInput = true;
            } catch (InputMismatchException e) {
              System.out.println("Please enter an integer");
              scan.nextLine();
            } catch (Exception e) {
              System.out.println("Please enter an integer");
              scan.nextLine();
            }
          }
          if (buckysRoom == 1) {
            doInterestCalc();
          } else if (buckysRoom == 2) {
            giveSumOfArray();
          } else {
            System.out.println(invalidInput);
          }
        } else if (otherVideos == 2) {
          System.out.println("\nThis area is under construction, "
              + "please excuse our bits.");
        } else if (otherVideos == 3) {
          System.out.println("\nThis area is under construction, "
              + "please excuse our bits.");
        } else {
          System.out.println(invalidInput);
        }
        break;
      case (3):
        int glossinput = doGlossary(menuGreet, menuSelection);
        switch (glossinput) {
          case (1):
            System.out.println("\nThere are eight primitive "
                + "data types:\n\n1: byte \n2: short \n3: "
                + "int \n4: long \n5: float \n6: double "
                + "\n7: boolean \n8: char \n\n" + menuSelection
                + "\n\nFollowing definitions from: https://"
                + "docs.oracle.com/javase/tutorial/java/"
                + "nutsandbolts/datatypes.html \n\n");
            int datatypes = -1;
            goodInput = false;
            while (goodInput == false) {
              try {
                datatypes = scan.nextInt();
                goodInput = true;
              } catch (InputMismatchException e) {
                System.out.println("Please enter an integer");
                scan.nextLine();
              } catch (Exception e) {
                System.out.println("Please enter an integer");
                scan.nextLine();
              }
            }
            // data types MSS
            switch (datatypes) {
              case (1):
                System.out.println("\n\nbyte: A signed 2's "
                    + "complement 8-bit integer, with min value"
                    + " of -128 and max value of 127");
                break;
              case (2):
                giveValueShort();
                break;
              case (3):
                giveValueInt();
                break;
              case (4):
                giveValueLong();
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
                System.out
                    .println("\n\nboolean: Can only be true or"
                        + " false");
                break;
              case (8):
                giveValueChar();
                break;
              default:
                System.out.println(invalidInput);
                break;
            } // end of data types switch

            break;
          case (2):
            System.out
                .println("\nVariable: a location in memory.\n"
                    + "\nClass: code.\n\nRelational operators:"
                    + " determine if one operand is greater \n"
                    + "than, less than, equal to, or not equal"
                    + " to another operand. \n\nConditional "
                    + "operators: checks two boolean expressions"
                    + " to see \nif one or both are true. \n\n"
                    + "Inheritance: A subclass can use any fields"
                    + ", methods, or nested classes from the "
                    + "class it is inheriting from (parent)."
                    + "\n\nPolymorphism: Subclasses of a class "
                    + "can define their own unique behaviors and "
                    + "yet share some of the same functionality "
                    + "of the parent class. (from Oracle)");
            // some definitions are from oracle
            break;
          case (3):
            System.out
                .println("\nThis area is under construction, "
                    + "please pardon our bits.");
            break;
          default:
            System.out.println(invalidInput);
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
                + "identify the index where a value was found"
                + "\n9: Search a 2D array and "
                + "identify the index where a value was found \n"
                + "10: Inheritance \n11: Polymorphism");
        int miscSelect = -1;
        goodInput = false;
        while (goodInput == false) {
          try {
            miscSelect = scan.nextInt();
            goodInput = true;
          } catch (InputMismatchException e) {
            System.out.println("Please enter an integer");
            scan.nextLine();
          } catch (Exception e) {
            System.out.println("Please enter an integer");
            scan.nextLine();
          }
        }
        if (miscSelect == 1) {
          doIntDivision();
        } else if (miscSelect == 2) {
          System.out.println(menuSelection + "\n1: addition \n2: "
              + "subtraction \n3: multiplication \n4: "
              + "division \n5: remainder \n6: power \n");
          int mathOp = -1;
          goodInput = false;
          while (goodInput == false) {
            try {
              mathOp = scan.nextInt();
              goodInput = true;
            } catch (InputMismatchException e) {
              System.out.println("Please enter an integer");
              scan.nextLine();
            } catch (Exception e) {
              System.out.println("Please enter an integer");
              scan.nextLine();
            }
          }
          // math operations switch
          switch (mathOp) {
            case (1):
              System.out
                  .println("\nAddition: \n\nPlease select a "
                      + "number, then a number to add. \n");
              double add1 = -1;
              double add2 = -1;
              goodInput = false;
              while (goodInput == false) {
                try {
                  add1 = scan.nextInt();
                  goodInput = true;
                } catch (InputMismatchException e) {
                  System.out.println("Please enter a number");
                  scan.nextLine();
                } catch (Exception e) {
                  System.out.println("Please enter a number");
                  scan.nextLine();
                }
              }
              goodInput = false;
              while (goodInput == false) {
                try {
                  add2 = scan.nextInt();
                  goodInput = true;
                } catch (InputMismatchException e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                } catch (Exception e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                }
              }
              System.out.println("\n" + add1 + " plus " + add2
                  + " equals: " + (add1 + add2));
              break;
            case (2):
              System.out
                  .println("\nSubtraction: \n\nPlease select a "
                      + "number, then a number to subtract. \n");
              double sub1 = -1;
              double sub2 = -1;
              goodInput = false;
              while (goodInput == false) {
                try {
                  sub1 = scan.nextInt();
                  goodInput = true;
                } catch (InputMismatchException e) {
                  System.out.println("Please enter a number");
                  scan.nextLine();
                } catch (Exception e) {
                  System.out.println("Please enter a number");
                  scan.nextLine();
                }
              }
              goodInput = false;
              while (goodInput == false) {
                try {
                  sub2 = scan.nextInt();
                  goodInput = true;
                } catch (InputMismatchException e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                } catch (Exception e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                }
              }
              System.out.println("\n" + sub1 + " minus " + sub2
                  + " equals: " + (sub1 - sub2));
              break;
            case (3):
              System.out.println("\nMultiplication: \n\nPlease "
                  + "select a number, then a number to "
                  + "multiply by. \n");
              double multi1 = -1;
              double multi2 = -1;
              goodInput = false;
              while (goodInput == false) {
                try {
                  multi1 = scan.nextInt();
                  goodInput = true;
                } catch (InputMismatchException e) {
                  System.out.println("Please enter a number");
                  scan.nextLine();
                } catch (Exception e) {
                  System.out.println("Please enter a number");
                  scan.nextLine();
                }
              }
              goodInput = false;
              while (goodInput == false) {
                try {
                  multi2 = scan.nextInt();
                  goodInput = true;
                } catch (InputMismatchException e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                } catch (Exception e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                }
              }
              System.out.println("\n" + multi1 + " multiplied by "
                  + multi2 + " equals: " + multi1 * multi2);
              break;
            case (4):
              System.out.println("\nDivision: \n\nPlease select"
                  + " a number, then a number to divide by.\n");
              double numerator1 = -1;
              double denominator1 = -1;
              goodInput = false;
              while (goodInput == false) {
                try {
                  numerator1 = scan.nextInt();
                  goodInput = true;
                } catch (InputMismatchException e) {
                  System.out.println("Please enter a number");
                  scan.nextLine();
                } catch (Exception e) {
                  System.out.println("Please enter a number");
                  scan.nextLine();
                }
              }
              goodInput = false;
              while (goodInput == false) {
                try {
                  denominator1 = scan.nextInt();
                  goodInput = true;
                } catch (InputMismatchException e) {
                  System.out.println("Please enter a number");
                  scan.nextLine();
                } catch (Exception e) {
                  System.out.println("Please enter a number");
                  scan.nextLine();
                }
              }
              System.out.println("\n" + numerator1
                  + " divided by " + denominator1 + " equals: "
                  + (numerator1 / denominator1));
              break;
            case (5):
              System.out.println("\nRemainder: \n\nPlease select"
                  + " a number, then a number to divide by.\n");
              double numerator2 = -1;
              double denominator2 = -1;
              goodInput = false;
              while (goodInput == false) {
                try {
                  numerator2 = scan.nextInt();
                  goodInput = true;
                } catch (InputMismatchException e) {
                  System.out.println("Please enter a number");
                  scan.nextLine();
                } catch (Exception e) {
                  System.out.println("Please enter a number");
                  scan.nextLine();
                }
              }
              goodInput = false;
              while (goodInput == false) {
                try {
                  denominator2 = scan.nextInt();
                  goodInput = true;
                } catch (InputMismatchException e) {
                  System.out.println("Please enter a number");
                  scan.nextLine();
                } catch (Exception e) {
                  System.out.println("Please enter a number");
                  scan.nextLine();
                }
              }
              System.out.println("\nThe remainder of "
                  + numerator2 + " divided by " + denominator2
                  + " is: " + (numerator2 % denominator2));
              break;
            case (6):
              System.out.println("\nPower: \nPlease select a "
                  + "base number, then a power to raise "
                  + "it to.\n");
              double base = -1;
              double power = -1;
              goodInput = false;
              while (goodInput == false) {
                try {
                  base = scan.nextInt();
                  goodInput = true;
                } catch (InputMismatchException e) {
                  System.out.println("Please enter a number");
                  scan.nextLine();
                } catch (Exception e) {
                  System.out.println("Please enter a number");
                  scan.nextLine();
                }
              }
              goodInput = false;
              while (goodInput == false) {
                try {
                  power = scan.nextInt();
                  goodInput = true;
                } catch (InputMismatchException e) {
                  System.out.println("Please enter a number");
                  scan.nextLine();
                } catch (Exception e) {
                  System.out.println("Please enter a number");
                  scan.nextLine();
                }
              }
              System.out.println(base + " raised to the " + power
                  + " equals: " + Math.pow(base, power));
              break;
            default:
              System.out.println(invalidInput);
              break;
          }
          // math operations switch end
        } else if (miscSelect == 3) {
          // infinite while loop because I felt like it
          // infinite loop is infinite
          // eclipse & checkstyle don't like this, but I wanted to
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
          int relatOp = -1;
          goodInput = false;
          while (goodInput == false) {
            try {
              relatOp = scan.nextInt();
              goodInput = true;
            } catch (InputMismatchException e) {
              System.out.println("Please enter an integer");
              scan.nextLine();
            } catch (Exception e) {
              System.out.println("Please enter an integer");
              scan.nextLine();
            }
          }
          switch (relatOp) {
            case (1):
              System.out.println("Equal to: \n\nPlease enter "
                  + "two integers \n");
              // I tried (no pun intended) to put two trys, and
              // then the catch blocks, since they both needed the
              // same ones, but eclipse wouldn't let me
              // without adding a finally, which I don't need
              // so I had to do them seperately, I'll fix this
              // if possible in the future
              int num1 = -1;
              int num2 = -1;
              goodInput = false;
              while (goodInput == false) {
                try {
                  num1 = scan.nextInt();
                  goodInput = true;
                } catch (InputMismatchException e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                } catch (Exception e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                }
              }
              goodInput = false;
              while (goodInput == false) {
                try {
                  num2 = scan.nextInt();
                  goodInput = true;
                } catch (InputMismatchException e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                } catch (Exception e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                }
              }
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
              int numOne = -1;
              int numTwo = -1;
              goodInput = false;
              while (goodInput == false) {
                try {
                  numOne = scan.nextInt();
                  goodInput = true;
                } catch (InputMismatchException e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                } catch (Exception e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                }
              }
              goodInput = false;
              while (goodInput == false) {
                try {
                  numTwo = scan.nextInt();
                  goodInput = true;
                } catch (InputMismatchException e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                } catch (Exception e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                }
              }
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
              int num11 = -1;
              int num22 = -1;
              goodInput = false;
              while (goodInput == false) {
                try {
                  num11 = scan.nextInt();
                  goodInput = true;
                } catch (InputMismatchException e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                } catch (Exception e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                }
              }
              goodInput = false;
              while (goodInput == false) {
                try {
                  num22 = scan.nextInt();
                  goodInput = true;
                } catch (InputMismatchException e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                } catch (Exception e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                }
              }
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
              int num10 = -1;
              int num20 = -1;
              goodInput = false;
              while (goodInput == false) {
                try {
                  num10 = scan.nextInt();
                  goodInput = true;
                } catch (InputMismatchException e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                } catch (Exception e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                }
              }
              goodInput = false;
              while (goodInput == false) {
                try {
                  num20 = scan.nextInt();
                  goodInput = true;
                } catch (InputMismatchException e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                } catch (Exception e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                }
              }
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
              int num12 = -1;
              int num23 = -1;
              goodInput = false;
              while (goodInput == false) {
                try {
                  num12 = scan.nextInt();
                  goodInput = true;
                } catch (InputMismatchException e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                } catch (Exception e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                }
              }
              goodInput = false;
              while (goodInput == false) {
                try {
                  num23 = scan.nextInt();
                  goodInput = true;
                } catch (InputMismatchException e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                } catch (Exception e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                }
              }
              if (num12 < num23) {
                System.out
                    .println(num12 + " is less than " + num23);
              } else {
                System.out.println(
                    num12 + " is not less than " + num23);
              }
              break;
            case (6):
              System.out.println("\nLess than or equal to: "
                  + "\n\nPlease enter two integers \n");
              int num19 = -1;
              int num21 = -1;
              goodInput = false;
              while (goodInput == false) {
                try {
                  num19 = scan.nextInt();
                  goodInput = true;
                } catch (InputMismatchException e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                } catch (Exception e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                }
              }
              goodInput = false;
              while (goodInput == false) {
                try {
                  num21 = scan.nextInt();
                  goodInput = true;
                } catch (InputMismatchException e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                } catch (Exception e) {
                  System.out.println("Please enter an integer");
                  scan.nextLine();
                }
              }
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
              break;
          }
        } else if (miscSelect == 5) {
          System.out
              .println("Condition operators: \n\n" + menuSelection
                  + "\n1: Conditional AND \n2: Conditional OR");
          int condOp = -1;
          goodInput = false;
          while (goodInput == false) {
            try {
              condOp = scan.nextInt();
              goodInput = true;
            } catch (InputMismatchException e) {
              System.out.println("Please enter an integer");
              scan.nextLine();
            } catch (Exception e) {
              System.out.println("Please enter an integer");
              scan.nextLine();
            }
          }
          if (condOp == 1) {
            System.out.println(
                "Conditional AND: \nEnter " + "two integers");
            int and1 = -1;
            int and2 = -1;
            goodInput = false;
            while (goodInput == false) {
              try {
                and1 = scan.nextInt();
                goodInput = true;
              } catch (InputMismatchException e) {
                System.out.println("Please enter an integer");
                scan.nextLine();
              } catch (Exception e) {
                System.out.println("Please enter an integer");
                scan.nextLine();
              }
            }
            goodInput = false;
            while (goodInput == false) {
              try {
                and2 = scan.nextInt();
                goodInput = true;
              } catch (InputMismatchException e) {
                System.out.println("Please enter an integer");
                scan.nextLine();
              } catch (Exception e) {
                System.out.println("Please enter an integer");
                scan.nextLine();
              }
            }
            if (and1 > 0 && and2 > 0) {
              System.out.println("Both are greater than zero");
            } else {
              System.out.println("One or both are less than or "
                  + "equal to zero");
            }
          } else if (condOp == 2) {
            System.out.println(
                "Conditional OR: \nEnter " + "two integers");
            int or1 = -1;
            int or2 = -1;
            goodInput = false;
            while (goodInput == false) {
              try {
                or1 = scan.nextInt();
                goodInput = true;
              } catch (InputMismatchException e) {
                System.out.println("Please enter an integer");
                scan.nextLine();
              } catch (Exception e) {
                System.out.println("Please enter an integer");
                scan.nextLine();
              }
            }
            goodInput = false;
            while (goodInput == false) {
              try {
                or2 = scan.nextInt();
                goodInput = true;
              } catch (InputMismatchException e) {
                System.out.println("Please enter an integer");
                scan.nextLine();
              } catch (Exception e) {
                System.out.println("Please enter an integer");
                scan.nextLine();
              }
            }
            if (or1 > 0 || or2 > 0) {
              System.out.println(
                  "One or both are greater " + "than zero");
            } else {
              System.out.println(
                  "Both are less than or equal " + "to zero");
            }

          } else {
            System.out.println(invalidInput);
          }
        } else if (miscSelect == 6) {
          // made a factorial "calculater" with a while loop
          System.out
              .println("\nWhile loop: \n\nEnter " + "a number\n");
          int fact = -1;
          goodInput = false;
          while (goodInput == false) {
            try {
              fact = scan.nextInt();
              goodInput = true;
            } catch (InputMismatchException e) {
              System.out.println("Please enter an integer");
              scan.nextLine();
            } catch (Exception e) {
              System.out.println("Please enter an integer");
              scan.nextLine();
            }
          }
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
          System.out.println(
              "Smallest number in array is: " + smallest);
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
        } else if (miscSelect == 9) {
          System.out
              .println("\nSearching a 2D array and printing "
                  + "index of first zero if found \n");
          Random someNumber = new Random();
          // restricted the size to a max of 6 X 6 for simplicity
          // not a fixed size, just smaller so it can be displayed
          int rowSize = someNumber.nextInt(6) + 1;
          int colSize = someNumber.nextInt(6) + 1;
          // 2D array
          int[][] arr = new int[rowSize][colSize];
          for (int row = 0; row < rowSize; row++) {
            for (int col = 0; col < colSize; col++) {
              // I also restricted the array entries to 0-9
              // similar reason as array size restriction
              arr[row][col] = someNumber.nextInt(10);
              System.out.print(arr[row][col] + "\t");
            }
            System.out.println();
          }
          // I couldn't remember how exactly to search a 2D array
          // efficiently, but I think this works the same;
          // albeit longer in terms of code I believe.
          int count = 0;
          int counter = 0;
          while (count < (rowSize - 1)
              && arr[count][counter] != 0) {
            while (counter < (colSize - 1)
                && arr[count][counter] != 0) {
              if (arr[count][counter] == 0) {
                break;
              } else {
                counter++;
              }
            }
            if (arr[count][counter] == 0) {
              break;
            } else {
              count++;
            }
          }
          if (arr[count][counter] == 0) {
            System.out.println("\nZero is at Row: " + count
                + " column: " + counter);
          } else {
            System.out.println("\nZero is not in array");
          }
        } else if (miscSelect == 10) {
          // followed the cave of programming video
          System.out.println("\nInheritance \n");
          OtherClass mach1 = new OtherClass();
          mach1.start();
          mach1.stop();
          Car car1 = new Car();
          car1.start();
          car1.wipeWindShield();
          car1.showInfo();
          car1.stop();

        } else if (miscSelect == 11) {
          // followed the cave of programming video
          System.out.println("\nPolymorphism\n");
          Plant plant1 = new Plant();
          Tree tree = new Tree();
          Plant plant2 = tree;
          plant2.grow();
          tree.shedLeaves();
          doGrow(tree);
        } else {

          System.out.println(invalidInput);
        }
        break;
      // end of Misc
      default:
        System.out.println(invalidInput);
        break;
    }
    scan.close();
  }
  // end of main

  // method header
  public static void doMenu(String menuSelection) {
    String menu = "Welcome to my integration project \n\n"
        + "1: Exercises \n2: Stuff from videos \n"
        + "3: Glossary \n4: Misc. \n\n" + menuSelection;
    System.out.println(menu);
  }

  // method with parameters here
  public static int giveMenuInput1(String menuGreet,
      String menuSelection) {
    System.out.println("\n" + menuGreet + "Exercises\n");
    String assignmentMenu = menuSelection + "\n1:Hacker Rank"
        + " Exercises \n2:Other Exercises";
    System.out.println(assignmentMenu);
    int subMenuInput = -1;
    boolean goodInput = false;
    while (goodInput == false) {
      try {
        subMenuInput = scan.nextInt();
        goodInput = true;
      } catch (InputMismatchException e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      } catch (Exception e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      }
    }
    return subMenuInput;
  }

  public static int doSubMenuIn1(String menuGreet,
      String menuSelection, String hrExercise) {
    System.out.println("\n" + menuGreet + hrExercise);
    System.out.println(menuSelection + "\n1: Week 1 " + hrExercise
        + "2: Week 2 " + hrExercise + "3: Week 3 " + hrExercise
        + "4: Week 4 " + hrExercise + "5: Week 5 " + hrExercise
        + "6: Week 6 " + hrExercise + "7: Week 7 " + hrExercise
        + "8: Week 8 " + hrExercise + "9: Week 9 " + hrExercise
        + "10: Week 10 " + hrExercise + "11: Week 11 "
        + hrExercise + "12: Week 12 " + hrExercise
        + "13: Week 13 " + hrExercise);
    int exercise = -1;
    boolean goodInput = false;
    while (goodInput == false) {
      try {
        exercise = scan.nextInt();
        goodInput = true;
      } catch (InputMismatchException e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      } catch (Exception e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      }
    }
    return exercise;
  }

  public static void doExercisesWk1(String menuGreet,
      String hrExercise, String menuSelection, String exeOut,
      String invalidInput) {
    System.out.println("\n" + menuGreet + "Week 1 " + hrExercise);
    System.out.println(menuSelection);
    System.out.println(
        "\n1: Welcome to Java! \n2: " + "Day 0: Hello, World\n");
    int wk1hr = -1;
    boolean goodInput = false;
    while (goodInput == false) {
      try {
        wk1hr = scan.nextInt();
        goodInput = true;
      } catch (InputMismatchException e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      } catch (Exception e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      }
    }
    // a switch could have worked, but this seemed better
    // with only 3
    if (wk1hr == 1) {
      System.out.println("\nWelcome to Java! \n\nThis "
          + "assignment introduces basic output "
          + "using System.out.println();");
      System.out.println(exeOut);
      System.out.println("Hello, World.");
      System.out.println("Hello, Java.");

    } else if (wk1hr == 2) {
      System.out.println("\nDay 0: Hello, World \n\n"
          + "This is Day 0 in 30 Days of Code; The Hello"
          + " World Program\n\nThis assignment "
          + "introduces the scanner, which can accept "
          + "input for the program to use.\n\nThe input"
          + " of this program was:\n\nWelcome to 30 "
          + "Days of Code! \n\nAnd the output was:\n");
      String daysofcode = "Welcome to 30 Days " + "of Code!";
      System.out.println("Hello, World.");
      System.out.println(daysofcode);
    } else {
      System.out.println(invalidInput);
    }
  }

  public static int doExercisesWk2(String menuGreet,
      String hrExercise, String menuSelection) {
    System.out.println("\n" + menuGreet + "Week 2 " + hrExercise);
    System.out.println(menuSelection);
    System.out.println("1: Day 1: Data Types \n2: Java "
        + "Stdin and Stdout I \n3: Java Stdin and "
        + "Stdout II \n4: Java Data Types\n");
    int wk2hr = -1;
    boolean goodInput = false;
    while (goodInput == false) {
      try {
        wk2hr = scan.nextInt();
        goodInput = true;
      } catch (InputMismatchException e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      } catch (Exception e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      }
    }
    return wk2hr;

  }

  // method header
  public static void doHrDay1() {
    // I need to add better explanations of exercises
    System.out.println("\nDay 1: Data Types \n\nThis"
        + " assignment works with basic data types."
        + "\n\nThe input of this program was:\n\n12, "
        + "4.0, and 'is the best place to learn and "
        + "practice coding!' \n\nAnd the output " + "was:\n");
    int i = 4;
    double d = 4.0;
    String s = "HackerRank ";
    int stuff = 12;
    double moreStuff = 4.0;
    String otherStuff = "is the best place to learn"
        + " and practice coding!";
    System.out.println(i + stuff);
    System.out.println(d + moreStuff);
    System.out.println(s + otherStuff);
  }

  public static int doGlossary(String menuGreet,
      String menuSelection) {
    System.out.println("\n" + menuGreet + "Glossary\n");
    // add this somewhere later
    // if (name.equals("text")); checks strings to see if equal
    System.out.println(menuSelection + "\n1: Primitive Data "
        + "Types \n2: Other Definitions\n3: "
        + "Java Operations\n");
    int glossinput = -1;
    boolean goodInput = false;
    while (goodInput == false) {
      try {
        glossinput = scan.nextInt();
        goodInput = true;
      } catch (InputMismatchException e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      } catch (Exception e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      }
    }
    // glossary MSS
    return glossinput;

  }

  public static void doHrStdInOut() {
    System.out.println("\nJava Stdin and Stdout I \n\nThis "
        + "exercise uses basic input and output.\n");
    System.out.println("Please input 3 integers");
    int a = -1;
    boolean goodInput = false;
    while (goodInput == false) {
      try {
        a = scan.nextInt();
        goodInput = true;
      } catch (InputMismatchException e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      } catch (Exception e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      }
    }
    int b = -1;
    goodInput = false;
    while (goodInput == false) {
      try {
        b = scan.nextInt();
        goodInput = true;
      } catch (InputMismatchException e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      } catch (Exception e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      }
    }
    int c = -1;
    goodInput = false;
    while (goodInput == false) {
      try {
        c = scan.nextInt();
        goodInput = true;
      } catch (InputMismatchException e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      } catch (Exception e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      }
    }
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }

  public static void doHrStdInOut2() {
    System.out.println("\nJava Stdin and Stdout II \n\nThis "
        + "exercise uses several types of basic input and "
        + "basic output.\n");
    System.out.println("Please enter an integer");
    int i = -1;
    boolean goodInput = false;
    while (goodInput == false) {
      try {
        i = scan.nextInt();
        goodInput = true;
      } catch (InputMismatchException e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      } catch (Exception e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      }
    }
    System.out.println("Please enter a double");
    double d = -1;
    goodInput = false;
    while (goodInput == false) {
      try {
        d = scan.nextDouble();
        goodInput = true;
      } catch (InputMismatchException e) {
        System.out.println("Please enter a double");
        scan.nextLine();
      } catch (Exception e) {
        System.out.println("Please enter a double");
        scan.nextLine();
      }
    }
    scan.nextLine(); // needed this to eat enter
    System.out.println("Please enter a string");
    String s = "";
    goodInput = false;
    while (goodInput == false) {
      try {
        s = scan.nextLine();
        goodInput = true;
      } catch (InputMismatchException e) {
        System.out.println("Please enter a string");
        scan.nextLine();
      } catch (Exception e) {
        System.out.println("Please enter a string");
        scan.nextLine();
      }
    }
    System.out.println(
        "Int: " + i + "\nDouble " + d + "\nString: " + s);
  }

  public static void doHrJavaDataTypes() {
    System.out.println("Java Data Types \n\n"
        + "This exercise takes in numbers and "
        + "outputs which (if any) \nof the "
        + "following data types they fit in: \n"
        + "byte, short, int, long.");
    System.out
        .println("\nInput how many numbers you want to try. \n");
    int t = -1;
    boolean goodInput = false;
    while (goodInput == false) {
      try {
        t = scan.nextInt();
        goodInput = true;
      } catch (InputMismatchException e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      } catch (Exception e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      }
    }
    System.out.println("\nInput " + t + " numbers.");
    // for loop
    for (int i = 0; i < t; i++) {
      try {
        long x = scan.nextLong();
        System.out.println(x + " can be fitted in:");
        // conditional operator &&
        // relational operator <=
        if (x >= -128 && x <= 127) {
          System.out.println("* byte");
        }
        if (x >= -32768 && x <= 32767) {
          System.out.println("* short");
        }
        if ((x >= (Integer.MIN_VALUE))
            && (x <= (Integer.MAX_VALUE))) {
          System.out.println("* int");
        }
        if ((x >= (Long.MIN_VALUE)) && (x <= (Long.MAX_VALUE))) {
          System.out.println("* long");
        }
      } catch (InputMismatchException e) {
        System.out.println("Please enter a long");
        scan.nextLine();
      } catch (Exception e) {
        System.out
            .println(scan.next() + " can't be fitted anywhere.");
      }
    }
  }

  public static void doInterestCalc() {
    System.out.println("This is a calculater for yearly"
        + " compounded interest.");
    double amount;
    System.out.println("Please enter your starting amount.");
    double principle = -1;
    boolean goodInput = false;
    while (goodInput == false) {
      try {
        principle = scan.nextDouble();
        goodInput = true;
      } catch (InputMismatchException e) {
        System.out.println("Please enter a double");
        scan.nextLine();
      } catch (Exception e) {
        System.out.println("Please enter a double");
        scan.nextLine();
      }
    }
    System.out.println(
        "Please enter your interest rate. \n" + "i.e. 0.05");
    double rate = -1;
    goodInput = false;
    while (goodInput == false) {
      try {
        rate = scan.nextDouble();
        goodInput = true;
      } catch (InputMismatchException e) {
        System.out.println("Please enter a double");
        scan.nextLine();
      } catch (Exception e) {
        System.out.println("Please enter a double");
        scan.nextLine();
      }
    }
    System.out
        .println("Please enter how many years you will invest.");
    int year = -1;
    goodInput = false;
    while (goodInput == false) {
      try {
        year = scan.nextInt();
        goodInput = true;
      } catch (InputMismatchException e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      } catch (Exception e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      }
    }
    // for loop
    for (int lastyear = 0; lastyear <= year; lastyear++) {
      amount = principle * Math.pow(1 + rate, lastyear);
      System.out.println(lastyear + " $" + amount);
    }
  }

  public static void giveSumOfArray() {
    // an array and the sum using an accumulator
    int[] bucky = { 21, 16, 86, 21, 3 };
    int sum = 0;
    for (int i = 0; i < bucky.length; i++) {
      sum += bucky[i];
    }
    System.out.println("The sum of these numbers is " + sum);
  }

  public static void giveValueShort() {
    // had to use doubles for these, eclipse wouldn't
    // do anything else, so I just casted them to their types
    // I realize I could have done this differently, but might as
    // well keep it since I think its my best example of casting
    double minValShort = Math.pow(-2, 15);
    double maxValShort = Math.pow(2, 15) - 1;
    System.out.println("\n\nshort: A signed 2's complement 16-bit"
        + " integer, with min value of" + (short) minValShort
        + " and max value of " + (short) maxValShort);
  }

  public static void giveValueInt() {
    double minValInt = Math.pow(-2, 31);
    double maxValInt = Math.pow(2, 31) - 1;
    System.out.println("\n\nint: A signed 2's complement"
        + " 32-bit integer, with min value of " + (int) minValInt
        + " and max value of " + (int) maxValInt);
  }

  public static void giveValueLong() {
    double minValLong = Math.pow(-2, 63);
    double maxValLong = Math.pow(2, 63) - 1;
    System.out.println("\n\nlong: A signed 2's complement 64-bit"
        + " integer, with min value of " + (long) minValLong
        + " and max value of " + (long) maxValLong);
  }

  public static void doIntDivision() {
    // replaced .equals with ints
    // demonstration and definition of integer division w/ real
    // answer using casting
    System.out.println("Interger divison: if you divide two "
        + "integers, the results is always an integer.\n");
    System.out.println("Please enter an integer\n");
    int intOne = -1;
    boolean goodInput = false;
    while (goodInput == false) {
      try {
        intOne = scan.nextInt();
        goodInput = true;
      } catch (InputMismatchException e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      } catch (Exception e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      }
    }
    System.out.println("\nPlease enter another integer\n");
    int intTwo = -1;
    goodInput = false;
    while (goodInput == false) {
      try {
        intTwo = scan.nextInt();
        goodInput = true;
      } catch (InputMismatchException e) {
        System.out.println("Please enter a string");
        scan.nextLine();
      } catch (Exception e) {
        System.out.println("Please enter a string");
        scan.nextLine();
      }
    }
    int result = -1;
    try {
      result = intOne / intTwo;
      goodInput = true;
    } catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero");
    } catch (Exception e) {
      System.out
          .println("Something went wrong, please try again");
    }
    System.out.println("\n" + intOne + " divided by " + intTwo
        + " equals " + result + " ,even though the "
        + "real answer is" + ((double) intOne / (double) intTwo));
  }

  public static void giveValueChar() {
    // the max/min unicode values of char didn't show up
    System.out.println("\n\nchar: a single 16-bit Unicode "
        + "character. It has a minimum value of 0 and a maximum"
        + " value of 65,535 inclusive.");
  }

  public static void doJavaStringsIntro() {
    System.out.println("Java Strings Introduction \n"
        + "\nGiven two strings of lowercase English "
        + "letters, A and B, this exercise performs "
        + "the following operations: \nSum the "
        + "lengths of A and B.\nDetermine if A is "
        + "lexicographically larger than B (i.e.: "
        + "does A come before B in the dictionary?)."
        + "\nCapitalize the first letter in A and B "
        + "and print them on a single line, "
        + "separated by a space.");
    // following commented code is for user input (w/ a try/catch)
    // Scanner sc = new Scanner(System.in);
    // String A = sc.next();
    // String B = sc.next();
    System.out.println("\nInput: hello, and java");
    String A = "hello";
    String B = "java";
    int length = A.length();
    int length2 = B.length();
    System.out.println("\nOutput: \n");
    System.out.println(length + length2);
    if (A.compareTo(B) > 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    System.out.println(
        A.substring(0, 1).toUpperCase() + A.substring(1) + " "
            + B.substring(0, 1).toUpperCase() + B.substring(1));
  }

  public static void doTimeConversion() {
    System.out.println("\nTime Conversion: \n\nThis exercise "
        + "converts 12hr AM/PM to 24hr military time \n");
    // following commented code is for user input (w/ a try/catch)
    // Scanner in = new Scanner(System.in);
    // String time = in.next();
    String time = "07:05:45PM"; // this is just for simplicity
    System.out.print("Input: " + time + "\nOutput: ");
    if (time.equals("12:00:00PM")) {
      System.out.print("12:00:00");
    } else if (time.substring(0, 2).equals("12")
        && time.substring(8).equals("AM")) {
      System.out.print("00" + time.substring(2, 8));
    } else if (time.substring(0, 2).equals("12")
        && time.substring(8).equals("PM")) {
      System.out.print(time.substring(0, 8));
    } else if (time.substring(8).equals("PM")) {
      int hours = (Integer.valueOf(time.substring(0, 2)))
          .intValue();
      hours += 12;
      System.out.print(hours + time.substring(2, 8));
    } else if (time.equals("12:00:00AM")) {
      System.out.print("00:00:00");
    } else {
      System.out.print(time.substring(0, 8));
    }
  }

  public static void doDay10Hr() {
    System.out.println("\nDay 10: Binary Numbers \n\n"
        + "Given a base-10 integer, n, convert it to binary "
        + "(base-2). \nThen find and print the base-10 integer "
        + "denoting the maximum number of consecutive 1's in n's "
        + "binary representation. \n");
    // following commented code is for user input (w/ a try/catch)
    // Scanner in = new Scanner(System.in);
    // int n = in.nextInt();
    int n = 78;
    System.out.println("Input: " + n);
    int counter = 0;
    int maxCounter = 0;
    String binary = "";
    System.out.print(n);
    while (n > 0) {
      int mod = n % 2;
      n /= 2;
      binary += mod;
    }
    System.out.println(" in binary is: " + binary);
    for (int i = 0; i < binary.length(); i++) {
      if (binary.charAt(i) == '1') {
        counter += 1;
        if (counter > maxCounter) {
          maxCounter = counter;
        }
      } else {
        counter = 0;
      }
    }
    System.out.println("Max " + maxCounter + " consecutive 1's.");
  }

  public static void doQueuesAndStacks(String menuGreet,
      String hrExercise) {
    System.out
        .println("\n" + menuGreet + "Week 13 " + hrExercise);
    System.out.println("Day 18: Queues and Stacks \n"
        + "\nThis exercise determines if a string is a"
        + " palindrome"); // emordnilap is a real word
    // following commented code is for user input (w/ a try/catch)
    // Scanner scan = new Scanner(System.in);
    // String input = scan.nextLine();
    // scan.close();
    String input = "tacocat";
    char[] s = input.toCharArray();
    Solution p = new Solution();
    for (char c : s) {
      p.pushCharacter(c);
      p.enqueueCharacter(c);
    }
    boolean isPalindrome = true;
    for (int i = 0; i < s.length / 2; i++) {
      if (p.popCharacter() != p.dequeueCharacter()) {
        isPalindrome = false;
        break;
      }
    }
    System.out.println(
        "\nThe word, " + input + ", is " + ((!isPalindrome)
            ? "not a palindrome." : "a palindrome."));
  }

  public static void doGrow(Plant plant) {
    plant.grow();
  }
}