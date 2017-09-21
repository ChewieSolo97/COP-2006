import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

// decided to put general comments here,
// not sure where else would be better
// Mitchell Donaghy last updated 4/30/17

// a varible is a location in memory
// tatoo "class is code" on arm
// several lines will likely be used often, so I made them strings
// I decided to use less user input, the sheer amount of 
// try/catches is ridiculous, they added several hundred lines
// edit: I changed a majority of the try-catches to a method call
// instead of a loop I just added calls to main if invalid input is received 
// I put main in an if-else with a sentinel so the user can exit 

public class Main {

  // I figured it would be best to have a class level scanner
  // considering how much I use it
  static Scanner scan = new Scanner(System.in);

  /**
   * This is the main method of my integration project.
   * 
   * @param args
   *          I don't really know what I'm supposed to put here
   */
  public static void main(String[] args) {

    String menuSelection = "Please enter the number of the "
        + "section you want to go to.\n";
    boolean goodInput;
    doMenu(menuSelection);
    String menuInput = "";
    goodInput = false;
    while (goodInput == false) {
      try {
        menuInput = scan.nextLine();
        goodInput = true;
      } catch (InputMismatchException e) {
        System.out.println("Please enter a String");
        scan.nextLine();
      } catch (Exception e) {
        System.out.println("Please enter a String");
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

    if (menuInput.equals("STOP") || menuInput.equals("stop")) { 
      // added stop in addition to STOP 
      System.out.println("\nProgram terminated");
    } else {
      switch (menuInput) {
        case ("1"):
          // method call with return
          int subMenuIn = giveMenuInput1(menuGreet, menuSelection);
          // exercises MSS
          switch (subMenuIn) {
            case (1):
              int exercise = doSubMenuIn1(menuGreet, menuSelection, hrExercise);
              // hacker rank MSS
              switch (exercise) {
                case (1):
                  doExercisesWk1(menuGreet, hrExercise, exeOut, menuSelection,
                      invalidInput);
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
                      main(args);
                      break;
                  }
                  break;
                case (9):
                  System.out.println("\n" + menuGreet + "Week 9 " + hrExercise);
                  System.out.println(menuSelection);
                  System.out.println(
                      "1: Java Strings Introduction " + "\n2: Time Conversion "
                          + "\n3: Day 10: Binary Numbers \n");
                  int hrWk9 = getGoodInt();
                  if (hrWk9 == 1) {
                    doJavaStringsIntro();
                  } else if (hrWk9 == 2) {
                    doTimeConversion();
                  } else if (hrWk9 == 3) {
                    doDay10Hr();
                  } else {
                    System.out.println(invalidInput);
                    main(args);
                  }

                  break;
                case (13):
                  doQueuesAndStacks(menuGreet, menuSelection);
                  break;
                default:
                  System.out.println(invalidInput);
                  main(args);
                  break;
              }
              // end of hacker rank exercises
              break;
            default:
              System.out.println(invalidInput);
              main(args);
              break;
          }
          break;
        case ("2"):
          System.out.println("\n" + menuGreet + "stuff from videos\n");
          System.out.println(menuSelection + "\n1: Bucky's Room");
          int otherVideos = getGoodInt();
          if (otherVideos == 1) {
            // need to expand this later
            System.out.println(menuSelection + "\n1: Compound "
                + "interest calculator \n2: Sum of an array");
            int buckysRoom = getGoodInt();
            if (buckysRoom == 1) {
              doInterestCalc();
            } else if (buckysRoom == 2) {
              giveSumOfArray();
            } else {
              System.out.println(invalidInput);
              main(args);
            }
          } else {
            System.out.println(invalidInput);
            main(args);
          }
          break;
        case ("3"):
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
              int datatypes = getGoodInt();
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
                  System.out.println("\n\nfloat: A single-precision "
                      + "32-bit IEEE 754 floating point.");
                  break;
                case (6):
                  System.out.println("\n\ndouble: A double-precision"
                      + " 64-bit IEEE 754 floating point.");
                  break;
                case (7):
                  System.out
                      .println("\n\nboolean: Can only be true or" + " false");
                  break;
                case (8):
                  giveValueChar();
                  break;
                default:
                  System.out.println(invalidInput);
                  main(args);
                  break;
              } // end of data types switch

              break;
            case (2):
              System.out.println("\nVariable: a location in memory.\n"
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
            default:
              System.out.println(invalidInput);
              main(args);
              break;
          }
          break;
        // end of glossary switch
        // start of Misc.
        case ("4"):
          System.out.println("\n" + menuGreet + "Misc.\n");
          // need to fill Misc. with more later
          System.out.println(
              menuSelection + "\n1: Integer division " + "\n2: Math operations "
                  + "\n3: Relational Operators \n4: Conditional"
                  + " Operators \n5: While Loop \n6: Smallest "
                  + "value in an array \n7: Search an array and "
                  + "identify the index where a value was found"
                  + "\n8: Search a 2D array and "
                  + "identify the index where a value was found \n"
                  + "9: Inheritance \n10: Polymorphism");
          int miscSelect = getGoodInt();
          if (miscSelect == 1) {
            doIntDivision();
          } else if (miscSelect == 2) {
            System.out.println(menuSelection + "\n1: addition \n2: "
                + "subtraction \n3: multiplication \n4: "
                + "division \n5: remainder \n6: power \n");
            int mathOp = getGoodInt();
            // math operations switch
            switch (mathOp) {
              case (1):
                System.out.println("\nAddition: \n\nPlease select a "
                    + "number, then a number to add. \n");
                double add1 = -1;
                double add2 = -1;
                goodInput = false;
                while (goodInput == false) {
                  try {
                    add1 = scan.nextDouble();
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
                    add2 = scan.nextDouble();
                    goodInput = true;
                  } catch (InputMismatchException e) {
                    System.out.println("Please enter a number");
                    scan.nextLine();
                  } catch (Exception e) {
                    System.out.println("Please enter a number");
                    scan.nextLine();
                  }
                }
                System.out.println("\n" + add1 + " plus " + add2 + " equals: "
                    + (add1 + add2));
                break;
              case (2):
                System.out.println("\nSubtraction: \n\nPlease select a "
                    + "number, then a number to subtract. \n");
                double sub1 = -1;
                double sub2 = -1;
                goodInput = false;
                while (goodInput == false) {
                  try {
                    sub1 = scan.nextDouble();
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
                    sub2 = scan.nextDouble();
                    goodInput = true;
                  } catch (InputMismatchException e) {
                    System.out.println("Please enter a number");
                    scan.nextLine();
                  } catch (Exception e) {
                    System.out.println("Please enter a number");
                    scan.nextLine();
                  }
                }
                System.out.println("\n" + sub1 + " minus " + sub2 + " equals: "
                    + (sub1 - sub2));
                break;
              case (3):
                System.out.println("\nMultiplication: \n\nPlease "
                    + "select a number, then a number to " + "multiply by. \n");
                double multi1 = -1;
                double multi2 = -1;
                goodInput = false;
                while (goodInput == false) {
                  try {
                    multi1 = scan.nextDouble();
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
                    multi2 = scan.nextDouble();
                    goodInput = true;
                  } catch (InputMismatchException e) {
                    System.out.println("Please enter a number");
                    scan.nextLine();
                  } catch (Exception e) {
                    System.out.println("Please enter a number");
                    scan.nextLine();
                  }
                }
                System.out.println("\n" + multi1 + " multiplied by " + multi2
                    + " equals: " + multi1 * multi2);
                break;
              case (4):
                System.out.println("\nDivision: \n\nPlease select"
                    + " a number, then a number to divide by.\n");
                double numerator1 = -1;
                double denominator1 = -1;
                goodInput = false;
                while (goodInput == false) {
                  try {
                    numerator1 = scan.nextDouble();
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
                    denominator1 = scan.nextDouble();
                    goodInput = true;
                  } catch (InputMismatchException e) {
                    System.out.println("Please enter a number");
                    scan.nextLine();
                  } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero");
                    scan.nextLine();
                  } catch (Exception e) {
                    System.out.println("Please enter a number");
                    scan.nextLine();
                  }
                }
                System.out.println("\n" + numerator1 + " divided by "
                    + denominator1 + " equals: " + (numerator1 / denominator1));
                break;
              case (5):
                System.out.println("\nRemainder: \n\nPlease select"
                    + " a number, then a number to divide by.\n");
                double numerator2 = -1;
                double denominator2 = -1;
                goodInput = false;
                while (goodInput == false) {
                  try {
                    numerator2 = scan.nextDouble();
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
                    denominator2 = scan.nextDouble();
                    goodInput = true;
                  } catch (InputMismatchException e) {
                    System.out.println("Please enter a number");
                    scan.nextLine();
                  } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero");
                    scan.nextLine();
                  } catch (Exception e) {
                    System.out.println("Please enter a number");
                    scan.nextLine();
                  }
                }
                System.out
                    .println("\nThe remainder of " + numerator2 + " divided by "
                        + denominator2 + " is: " + (numerator2 % denominator2));
                break;
              case (6):
                System.out.println("\nPower: \nPlease select a "
                    + "base number, then a power to raise " + "it to.\n");
                double base = -1;
                double power = -1;
                goodInput = false;
                while (goodInput == false) {
                  try {
                    base = scan.nextDouble();
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
                    power = scan.nextDouble();
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
                main(args);
                break;
            }
            // math operations switch end
          } else if (miscSelect == 3) {
            System.out.println("\nRelational Operators: \n" + "\n"
                + menuSelection + "\n1: Equal to \n2: "
                + "Not equal \n3: Greater than \n4: "
                + "Greater than or equal to \n5: Less than \n6:"
                + " Less than or equal to \n");
            int relatOp = getGoodInt();
            switch (relatOp) {
              case (1):
                System.out
                    .println("Equal to: \n\nPlease enter " + "two integers \n");
                // I tried (no pun intended) to put two trys, and
                // then the catch blocks, since they both needed the
                // same ones, but eclipse wouldn't let me
                // without adding a finally, which I don't need
                // so I had to do them seperately
                int num1 = getGoodInt();
                int num2 = getGoodInt();
                if (num1 == num2) {
                  System.out.println(num1 + " equals " + num2);
                } else {
                  System.out.println(num1 + " doesn't equal " + num2);
                }
                break;
              case (2):
                System.out.println(
                    "\nNot equal: \n\nPlease enter" + " two integers \n");
                int numOne = getGoodInt();
                int numTwo = getGoodInt();
                if (numOne != numTwo) {
                  System.out.println(numOne + " doesn't equal " + numTwo);
                } else {
                  System.out.println(numOne + " equals " + numTwo);
                }
                break;
              case (3):
                System.out.println(
                    "\nGreater than: \n\nPlease " + "enter two integers \n");
                int num11 = getGoodInt();
                int num22 = getGoodInt();
                if (num11 > num22) {
                  System.out.println(num11 + " is greater than " + num22);
                } else {
                  System.out.println(num11 + " is not greater than " + num22);
                }
                break;
              case (4):
                System.out.println("\nGreater than or equal to: "
                    + "\n\nPlease enter two integers \n");
                int num10 = getGoodInt();
                int num20 = getGoodInt();
                if (num10 >= num20) {
                  System.out
                      .println(num10 + " is greater than or equal to " + num20);
                } else {
                  System.out.println(
                      num10 + " is not greater " + "than or equal to " + num20);
                }
                break;
              case (5):
                System.out.println(
                    "\nLess than: \n\nPlease enter" + " two integers \n");
                int num12 = getGoodInt();
                int num23 = getGoodInt();
                if (num12 < num23) {
                  System.out.println(num12 + " is less than " + num23);
                } else {
                  System.out.println(num12 + " is not less than " + num23);
                }
                break;
              case (6):
                System.out.println("\nLess than or equal to: "
                    + "\n\nPlease enter two integers \n");
                int num19 = getGoodInt();
                int num21 = getGoodInt();
                if (num19 <= num21) {
                  System.out.println(
                      num19 + " is less than or " + "equal to " + num21);
                } else {
                  System.out.println(
                      num19 + " is not less than " + "or equal to " + num21);
                }
                break;
              default:
                System.out.println(invalidInput);
                main(args);
                break;
            }
          } else if (miscSelect == 4) {
            System.out.println("Condition operators: \n\n" + menuSelection
                + "\n1: Conditional AND \n2: Conditional OR");
            int condOp = getGoodInt();
            if (condOp == 1) {
              System.out.println("Conditional AND: \nEnter " + "two integers");
              int and1 = getGoodInt();
              int and2 = getGoodInt();
              if (and1 > 0 && and2 > 0) {
                System.out.println("Both are greater than zero");
              } else {
                System.out
                    .println("One or both are less than or " + "equal to zero");
              }
            } else if (condOp == 2) {
              System.out.println("Conditional OR: \nEnter " + "two integers");
              int or1 = getGoodInt();
              int or2 = getGoodInt();
              if (or1 > 0 || or2 > 0) {
                System.out.println("One or both are greater " + "than zero");
              } else {
                System.out.println("Both are less than or equal " + "to zero");
              }

            } else {
              System.out.println(invalidInput);
              main(args);
            }
          } else if (miscSelect == 5) {
            // made a factorial "calculater" with a while loop
            System.out.println("\nWhile loop: \n\nEnter " + "a number\n");
            int fact = getGoodInt();
            // I figured long should be big enough for
            // reasonable numbers
            // long factorial = fact;
            double factorial = fact;
            System.out.print("\n" + fact + " factorial" + " is ");
            // while loop
            while (fact > 1) {
              factorial = factorial * (fact - 1);
              fact--;
            }
            System.out.println(factorial);
          } else if (miscSelect == 6) {
            // smallest value in an array
            int[] array = { 25, 32, 79, 5, 90, 400, 6, 9 };
            int smallest = Integer.MAX_VALUE;
            for (int i = 0; i < array.length; i++) {
              if (array[i] < smallest) {
                smallest = array[i];
              }
            }
            System.out.println("Smallest number in array is: " + smallest);
          } else if (miscSelect == 7) {
            // search an array and identify the index where a
            // value was found
            int[] array2 = { 40, 30, 50, 88 };
            for (int i = 0; i < array2.length; i++) {
              if (array2[i] == 50) {
                System.out
                    .println("50 was found in the array at" + " position " + i);
              }
            }
          } else if (miscSelect == 8) {
            System.out.println("\nSearching a 2D array and printing "
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
            while (count < (rowSize - 1) && arr[count][counter] != 0) {
              while (counter < (colSize - 1) && arr[count][counter] != 0) {
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
              System.out.println(
                  "\nZero is at Row: " + count + " column: " + counter);
            } else {
              System.out.println("\nZero is not in array");
            }
          } else if (miscSelect == 9) {
            // followed the cave of programming video
            System.out.println("\nInheritance \n");
            Machine1 mach1 = new Machine1();
            mach1.start();
            mach1.stop();
            Car car1 = new Car();
            car1.start();
            car1.wipeWindShield();
            car1.showInfo();
            car1.stop();

          } else if (miscSelect == 10) {
            // followed the cave of programming video
            System.out.println("\nPolymorphism\n");
            // Plant plant1 = new Plant();
            Tree tree = new Tree();
            Plant plant2 = tree;
            plant2.grow();
            tree.shedLeaves();
            doGrow(tree);
          } else {

            System.out.println(invalidInput);
            main(args);
          }
          break;
        // end of Misc
        default:
          System.out.println(invalidInput);
          main(args);
          break;
      }
      scan.close();
    }
  }
  // end of main

  // method header
  /**
   * This is the main menu of my integration project.
   * 
   * @param menuSelection
   *          Takes users input on the section they want to go to
   */
  public static void doMenu(String menuSelection) {
    String menu = "Welcome to my integration project \n\n"
        + "1: Exercises \n2: Stuff from videos \n"
        + "3: Glossary \n4: Misc. \n\nEnter STOP to terminate program \n\n"
        + menuSelection;
    System.out.println(menu);
  }

  // method with parameters here
  /**
   * The main menu for exercises.
   * 
   * @param menuGreet
   *          The general menu greeting String
   * @param menuSelection
   *          User input for menu
   * @return Returns user's menuSelection input
   */
  public static int giveMenuInput1(String menuGreet, String menuSelection) {
    System.out.println("\n" + menuGreet + "Exercises\n");
    String assignmentMenu = menuSelection + "\n1:Hacker Rank Exercises";
    System.out.println(assignmentMenu);
    int subMenuInput = getGoodInt();
    return subMenuInput;
  }

  /**
   * This method takes input for the hacker rank submenu.
   * 
   * @param menuGreet
   *          general menu greeting
   * @param menuSelection
   *          a String that prompts the user for input
   * @param hrExercise
   *          a String that says Hacker Rank Exercises
   * @return returns the user input for a switch statement
   */
  public static int doSubMenuIn1(String menuGreet, String menuSelection,
      String hrExercise) {
    System.out.println("\n" + menuGreet + hrExercise);
    System.out.println(
        menuSelection + "\n1: Week 1 " + hrExercise + "2: Week 2 " + hrExercise
            + "9: Week 9 " + hrExercise + "13: Week 13 " + hrExercise);
    int exercise = getGoodInt();
    return exercise;
  }

  /**
   * This method contains the week 1 hacker rank exercises.
   * 
   * @param menuGreet
   *          a general menu greeting
   * @param hrExercise
   *          a String that says Hacker Rank Exercises
   * @param menuSelection
   *          a String that prompts the user for input
   * @param exeOut
   *          a String that says ~ "the output follows"
   * @param invalidInput
   *          a String thats "invalid input"
   */
  public static void doExercisesWk1(String menuGreet, String hrExercise,
      String menuSelection, String exeOut, String invalidInput) {
    System.out.println("\n" + menuGreet + "Week 1 " + hrExercise);
    System.out.println(menuSelection);
    System.out.println("\n1: Welcome to Java! \n2: " + "Day 0: Hello, World\n");
    int wk1hr = getGoodInt();
    // a switch could have worked, but this seemed better
    // with only 2
    if (wk1hr == 1) {
      System.out.println(
          "\nWelcome to Java! \n\nThis " + "assignment introduces basic output "
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

  /**
   * Displays menu, asks, and receives input for hacker rank week 2 exercises.
   * 
   * @param menuGreet
   *          a general menu greeting
   * @param hrExercise
   *          a String that says Hacker Rank Exercises
   * @param menuSelection
   *          a String that prompts the user for input
   * @return returns user input for switch statement selection
   */
  public static int doExercisesWk2(String menuGreet, String hrExercise,
      String menuSelection) {
    System.out.println("\n" + menuGreet + "Week 2 " + hrExercise);
    System.out.println(menuSelection);
    System.out.println("1: Day 1: Data Types \n2: Java "
        + "Stdin and Stdout I \n3: Java Stdin and "
        + "Stdout II \n4: Java Data Types\n");
    int wk2hr = getGoodInt();
    return wk2hr;

  }

  // method header

  /**
   * This method is Day 1 from hacker rank's 30 days of code.
   */
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
    String otherStuff = "is the best place to learn" + " and practice coding!";
    System.out.println(i + stuff);
    System.out.println(d + moreStuff);
    System.out.println(s + otherStuff);
  }

  /**
   * This method is a glossary for some basic terms in Java.
   * 
   * @param menuGreet
   *          This is a general welcome message that I made a String
   * @param menuSelection
   *          A general message that I made a String asking for menu based input
   * @return Returns input for the glossary switch statement
   */
  public static int doGlossary(String menuGreet, String menuSelection) {
    System.out.println("\n" + menuGreet + "Glossary\n");
    System.out.println(menuSelection + "\n1: Primitive Data "
        + "Types \n2: Other Definitions");
    int glossinput = getGoodInt();
    // glossary MSS
    return glossinput;

  }

  /**
   * This method is Java Stdin and Stdout I from hacker rank.
   */
  public static void doHrStdInOut() {
    System.out.println("\nJava Stdin and Stdout I \n\nThis "
        + "exercise uses basic input and output.\n");
    System.out.println("Please input 3 integers");
    int a = getGoodInt();
    int b = getGoodInt();
    int c = getGoodInt();
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }

  /**
   * This method is Java Stdin and Stdout II from hacker rank.
   */
  public static void doHrStdInOut2() {
    System.out.println("\nJava Stdin and Stdout II \n\nThis "
        + "exercise uses several types of basic input and "
        + "basic output.\n");
    System.out.println("Please enter an integer");
    // added the following two lines because checkstyle was complaining about
    // distance between declaration and being used
    int i = 0;
    double d = 0;
    i = getGoodInt();
    System.out.println("Please enter a double");
    d = getGoodInt();
    scan.nextLine(); // needed this to eat enter
    System.out.println("Please enter a string");
    String s = "";
    boolean goodInput = false;
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
    System.out.println("Int: " + i + "\nDouble " + d + "\nString: " + s);
  }

  /**
   * This method is Java Data Types from hacker rank.
   */
  public static void doHrJavaDataTypes() {
    System.out.println("Java Data Types \n\n"
        + "This exercise takes in numbers and "
        + "outputs which (if any) \nof the "
        + "following data types they fit in: \n" + "byte, short, int, long.");
    System.out.println("\nInput how many numbers you want to try. \n");
    int t = getGoodInt();
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
        if ((x >= (Integer.MIN_VALUE)) && (x <= (Integer.MAX_VALUE))) {
          System.out.println("* int");
        }
        if ((x >= (Long.MIN_VALUE)) && (x <= (Long.MAX_VALUE))) {
          System.out.println("* long");
        }
      } catch (InputMismatchException e) {
        System.out.println("Please enter a long");
        scan.nextLine();
      } catch (Exception e) {
        System.out.println(scan.next() + " can't be fitted anywhere.");
      }
    }
  }

  /**
   * This method is an yearly compounded interest calculator.
   */
  public static void doInterestCalc() {
    System.out.println("This is a calculater for yearly compounded interest.");
    double amount;
    System.out.println("Please enter your starting amount.");
    double principle = getGoodInt();
    System.out.println("Please enter your interest rate. \n" + "i.e. 0.05");
    double rate = -1;
    boolean goodInput = false;
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
    System.out.println("Please enter how many years you will invest.");
    int year = getGoodInt();
    // for loop
    for (int lastyear = 0; lastyear <= year; lastyear++) {
      amount = principle * Math.pow(1 + rate, lastyear);
      System.out.println(lastyear + " $" + amount);
    }
  }

  /**
   * This method outputs the sum of a pre-entered array.
   */
  public static void giveSumOfArray() {
    // an array and the sum using an accumulator
    int[] bucky = { 21, 16, 86, 21, 3 };
    int sum = 0;
    for (int i = 0; i < bucky.length; i++) {
      sum += bucky[i];
    }
    System.out.println("The sum of these numbers is " + sum);
  }

  /**
   * This method outputs the min and max values of a short.
   */
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

  /**
   * This method outputs the min and max values of an int.
   */
  public static void giveValueInt() {
    double minValInt = Math.pow(-2, 31);
    double maxValInt = Math.pow(2, 31) - 1;
    System.out.println("\n\nint: A signed 2's complement"
        + " 32-bit integer, with min value of " + (int) minValInt
        + " and max value of " + (int) maxValInt);
  }

  /**
   * This method outputs the min and max values of a long.
   */
  public static void giveValueLong() {
    double minValLong = Math.pow(-2, 63);
    double maxValLong = Math.pow(2, 63) - 1;
    System.out.println("\n\nlong: A signed 2's complement 64-bit"
        + " integer, with min value of " + (long) minValLong
        + " and max value of " + (long) maxValLong);
  }

  /**
   * This method outputs the result of a division using ints.
   */
  public static void doIntDivision() {
    // replaced .equals with ints
    // demonstration and definition of integer division w/ real
    // answer using casting
    System.out.println("Interger divison: if you divide two "
        + "integers, the results is always an integer.\n");
    System.out.println("Please enter an integer\n");
    int intOne = getGoodInt();
    System.out.println("\nPlease enter another integer\n");
    int intTwo = getGoodInt();
    int result = -1;
    try {
      result = intOne / intTwo;
    } catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero");
    } catch (Exception e) {
      System.out.println("Something went wrong, please try again");
    }
    System.out.println("\n" + intOne + " divided by " + intTwo + " equals "
        + result + " ,even though the " + "real answer is"
        + ((double) intOne / (double) intTwo));
  }

  /**
   * This method outputs the min and max values of a char.
   */
  public static void giveValueChar() {
    // the max/min unicode values of char didn't show up
    System.out.println("\n\nchar: a single 16-bit Unicode "
        + "character. It has a minimum value of 0 and a maximum"
        + " value of 65,535 inclusive.");
  }

  /**
   * This method is Java String Intro from hacker rank.
   */
  public static void doJavaStringsIntro() {
    System.out.println("Java Strings Introduction \n"
        + "\nGiven two strings of lowercase English "
        + "letters, A and B, this exercise performs "
        + "the following operations: \nSum the "
        + "lengths of A and B.\nDetermine if A is "
        + "lexicographically larger than B (i.e.: "
        + "does A come before B in the dictionary?)."
        + "\nCapitalize the first letter in A and B "
        + "and print them on a single line, " + "separated by a space.");
    // following commented code is for user input (w/ a try/catch)
    // Scanner sc = new Scanner(System.in);
    // String A = sc.next();
    // String B = sc.next();
    System.out.println("\nInput: hello, and java");
    String stringOne = "hello";
    String stringTwo = "java";
    int length = stringOne.length();
    int length2 = stringTwo.length();
    System.out.println("\nOutput: \n");
    System.out.println(length + length2);
    if (stringOne.compareTo(stringTwo) > 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    System.out.println(
        stringOne.substring(0, 1).toUpperCase() + stringOne.substring(1) + " "
            + stringTwo.substring(0, 1).toUpperCase() + stringTwo.substring(1));
  }

  /**
   * This method takes in AM/PM time and outputs it as 24hr time.
   */
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
      int hours = (Integer.valueOf(time.substring(0, 2))).intValue();
      hours += 12;
      System.out.print(hours + time.substring(2, 8));
    } else if (time.equals("12:00:00AM")) {
      System.out.print("00:00:00");
    } else {
      System.out.print(time.substring(0, 8));
    }
  }

  /**
   * This method is Day 10 from hacker rank's 30 days of code.
   */
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

  /**
   * This method is Day 18 from hacker rank's 30 days of code, it uses a queue
   * and a stack to determine if a string is a palindrome.
   */
  public static void doQueuesAndStacks(String menuGreet, String hrExercise) {
    System.out.println("\n" + menuGreet + "Week 13 " + hrExercise);
    System.out.println("Day 18: Queues and Stacks \n"
        + "\nThis exercise determines if a string is a" + " palindrome");
    // emordnilap is a real word

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
    System.out.println("\nThe word, " + input + ", is "
        + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
  }

  public static void doGrow(Plant plant) {
    plant.grow();
  }

  /**
   * This method is a general try catch for user input for ints.
   * 
   * @return returns the user's input if it doesn't throw an exception
   */
  public static int getGoodInt() {
    int tryInput = -1;
    boolean goodInput = false;
    while (goodInput == false) {
      try {
        tryInput = scan.nextInt();
        goodInput = true;
      } catch (InputMismatchException e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      } catch (Exception e) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      }
    }
    return tryInput;
  }
}
