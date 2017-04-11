import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class JavaNotes {

  public static void main(String[] args) {

    // do-while loop
    // int count = 1;
    // do {
    // System.out.println("Count is: " + count);
    // count++;
    // } while (count < 11);

    // infinite while loop because I felt like it
    // while (1 == 1) {
    // System.out.println("This is broken...");
    // System.out.println("Why did you do this?");
    // System.out.println("Please stop this...");
    // }

    // udemy while loop
    // int value = 0;
    // boolean loop = value < 20;
    // System.out.println(loop);
    // while (value < 10) {
    // System.out.println("Hello " + value);
    // value = value + 1;
    // }

    // edemy for loop

    // for (int i = 0; i < 5; i++) {
    // System.out.printf("The value of i is: %d\n", i);
    // }

    // udemy do-while loop

    // Scanner scanner = new Scanner(System.in);
    // int value = 0;
    // do {
    // System.out.println("Please enter a number: ");
    // value = scanner.nextInt();
    // }
    // while (value != 5);
    //
    // System.out.println("Got 5 ");
    //
    // scanner.close();

    // bucky's room while loop

    // int counter = 0;
    //
    // while (counter < 10) {
    // System.out.println(counter);
    // counter++;
    // }

    // bucky's room for loop

    // for (int counter = 6; counter <= 21; counter += 3) {
    // System.out.println(counter);
    // }

    // bucky's room compound interest program

    // System.out.println("This is a calculater for yearly"
    // + " compounded interest.");
    // Scanner scanner = new Scanner(System.in);
    // double amount;
    // System.out.println("Please enter your starting amount.");
    // double principle = scanner.nextDouble();
    // System.out.println("Please enter your interest rate.");
    // double rate = scanner.nextDouble();
    // System.out.println("Please enter how many years you will invest.");
    // int year = scanner.nextInt();
    // for (int lastyear = 0; lastyear <= year; lastyear++) {
    // amount = principle*Math.pow(1 + rate, lastyear);
    // System.out.println(lastyear + " $" + amount);
    // }
    //
    // scanner.close();

    // bucky's room do-while loop

    // int counter = 15;
    //
    // do {
    // System.out.println(counter);
    // counter++;
    // } while (counter <= 10);

    // a method is a name for lines of code

    // udemy arrays

    // int [] values;
    // values = new int [3];
    // System.out.println(values[0]);
    //
    // values [0] = 10;
    // values [1] = 20;
    // values [2] = 30;
    // System.out.println(values[0]);
    // System.out.println(values[1]);
    // System.out.println(values[2]);
    //
    // for (int i = 0; i < values.length; i++) {
    // System.out.println(values[i]);
    // }
    // int [] numbers = {5, 6, 7};
    // for (int i = 0; i < numbers.length; i++) {
    // System.out.println(numbers[i]);
    // }

    // Bucky's Room: Creating an Array Table

    // System.out.println("Index\tValue");
    // int bucky [] = {32, 12, 18, 54, 2};
    // for (int i = 0; i < bucky.length; i++) {
    // System.out.println(i + "\t" + bucky [i]);
    // }

    // Bucky's Room: Summing Elements of an Array

    // int bucky [] = {21, 16, 86, 21, 3};
    // int sum = 0;
    // for (int i = 0; i < bucky.length; i++) {
    // sum += bucky[i];
    // }
    // System.out.println("The sum of these numbers is " + sum);

    // Bucky's Room: Array Elements as Counters

    // Random rand = new Random ();
    // int freq [] = new int [7];
    //
    // for (int roll = 1; roll < 1000; roll++) {
    // ++freq[1 + rand.nextInt(6)];
    // }
    // System.out.println("Face\tFrequency");
    //
    // for (int face = 1; face < freq.length; face++) {
    // System.out.println(face + "\t" + freq[face]);
    // }

    // udemy interfaces
    // didnt follow, it made no sense

    // udemy recursion

    // System.out.println(factorial(6));
    //
    // }
    //
    // private static int factorial(int i) {
    //
    // if (i == 1) {
    // return 1;
    // }
    // return factorial(i - 1) * i;
    // }

    // udemy hashmap

    // HashMap<Integer, String> map = new HashMap<Integer, String> ();
    //
    // map.put(1, "one");
    // map.put(2, "two");
    // map.put(3, "three");
    // map.put(4, "four");
    // map.put(5, "five");
    //
    // String text = map.get(4);
    //
    // System.out.println(text);
    //
    // for(Map.Entry<Integer, String> entry:map.entrySet()) {
    // int key = entry.getKey();
    // String value = entry.getValue();
    //
    // System.out.println(key + ": " + value);
    //
    // }

    // String stuff = "12";
    // float a = (Float.valueOf(stuff)).floatValue();
    // float a = Float.parseFloat(stuff);
    // System.out.println(a);

    // String anotherPalindrome = "Niagara. O roar again!";
    // char aChar = anotherPalindrome.charAt(9);
    // System.out.println(aChar);
    // String A = "jfy";
    // int length = A.length();
    // int hours = (Int.valueOf(time.substring(0, 2))).intValue();

    // String newstring = new String();
    // System.out.println(newstring);

    // Udemy multi dimensional arrays

    // int[][] twoD = {
    // {34, 56, 2, 78},
    // {1, 4, 456, 89},
    // {2, 90},
    // {56, 45, 345}
    // };
    //
    // for (int row = 0; row < twoD.length; row++) {
    // for (int col = 0; col < twoD[row].length; col++) {
    // System.out.print(twoD[row][col] + "\t");
    // }
    // System.out.println();
    // }
    //
    // System.out.println("\n\n");
    //
    // String [][] stuff = new String [4][];
    // stuff [3] = new String [6];
    // stuff [3][4] = "hi";
    // System.out.println(stuff [3][4]);

    // udemy using generics

    // before java 5
    // ArrayList list = new ArrayList();
    //
    // list.add("apple");
    // list.add("pear");
    // list.add("orange");
    //
    // String fruit = (String) list.get(1);
    //
    // System.out.println(fruit);

    // modern style

    // ArrayList<String> strings = new ArrayList<String>();
    //
    // strings.add("cat");
    // strings.add("dog");
    // strings.add("fish");
    //
    // String animals = strings.get(1);
    //
    // System.out.println(animals);

    // there can be multiple type arguments

    // HashMap<Integer, String> map = new HashMap<Integer, String>();

    // java 7+ style, dont need type in second brackets

    // ArrayList<String> otherList = new ArrayList<>();

    // udemy ArrayList

    // ArrayList<Integer> someNumbers = new ArrayList<Integer>();
    //
    // someNumbers.add(67);
    // someNumbers.add(16);
    // someNumbers.add(899);
    //
    // System.out.println(someNumbers.get(1));
    //
    // System.out.println("Iteration #1: ");
    //
    // for (int i = 0; i < someNumbers.size(); i++) {
    // System.out.println(someNumbers.get(i));
    // }

    // removing elements
    // someNumbers.remove(someNumbers.size() - 1);

    // slow with items not at end, use linked list instead
    // someNumbers.remove(1);
    // for each loop
    // System.out.println("Iteration #2: ");
    // for (Integer value : someNumbers) {
    // System.out.println(value);
    // }

    // List interface ...
    // List<String> values = new ArrayList<String>();

    // List<Integer> arrayList = new ArrayList<>();
    // List<Integer> linkedList = new LinkedList<>();
    // doTimings("ArrayList", arrayList);
    // doTimings("LinkedList", linkedList);

    // private static void doTimings(String type, List<Integer> list) {
    // for (int i = 0; i < 1E5; i++) {
    // list.add(i);
    // }
    // long start = System.currentTimeMillis();
    //
    // for (int i = 0; i < 1E5; i++) {
    // list.add(i);
    // }
    //
    // long end = System.currentTimeMillis();
    //
    // System.out.println("Time taken: " + (end - start) + " ms for "
    // + type + " adding at end");
    //
    // long start1 = System.currentTimeMillis();
    //
    // for (int i = 0; i < 1E5; i++) {
    // list.add(0, i);
    // }
    //
    // long end1 = System.currentTimeMillis();
    //
    // System.out.println("Time taken: " + (end1 - start1)
    // + " ms for " + type + " adding at beginning");
    // }

    // OtherClass mach1 = new OtherClass();
    //
    // mach1.start();
    // mach1.stop();
    //
    // Car car1 = new Car();
    //
    // car1.start();
    // car1.wipeWindShield();
    // car1.showInfo();
    // car1.stop();

    // Plant plant1 = new Plant();
    //
    // // Tree is a kind of Plant (it extends Plant)
    // Tree tree = new Tree();
    //
    // // Polymorphism guarantees that we can use a child class
    // // wherever a parent class is expected.
    // Plant plant2 = tree;
    //
    // // plant2 references a Tree, so the Tree grow() method is called.
    // plant2.grow();
    //
    // // The type of the reference decided what methods you can actually call;
    // // we need a Tree-type reference to call tree-specific methods.
    // tree.shedLeaves();
    //
    // // ... so this won't work.
    // // plant2.shedLeaves();
    //
    // // Another example of polymorphism.
    // doGrow(tree);
    // char grade = 'a';
    // int[] testScores = { 80, 100 };
    // int total = 0;
    // int count = 0;
    // for (int i = 0; i < testScores.length; i++) {
    // total += testScores[i];
    // count++;
    // System.out.println(total);
    // System.out.println(count);
    // }
    // total /= count;
    // System.out.println(total);
    // if (total >= 90 || total <= 100) {
    // grade = 'O';
    //
    // } else if (total >= 80 || total < 90) {
    // grade = 'E';
    //
    // } else if (total >= 70 || total < 80) {
    // grade = 'A';
    //
    // } else if (total >= 55 || total < 70) {
    // grade = 'P';
    //
    // } else if (total >= 40 || total < 55) {
    // grade = 'D';
    //
    // } else if (total < 40) {
    // grade = 'T';

    // }
    // System.out.println(grade);

    // udemy queues

    Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);

    q1.add(10);
    q1.add(20);
    q1.add(30);
    System.out.println("Head of queue is: " + q1.element());
    try {
      q1.add(40);
    } catch (IllegalStateException e) {
      System.out.println("Too many items added");
    }
    for (int value : q1) {
      System.out.println(value);
    }
    int value = q1.remove();
    System.out.println("removed: " + value);
    System.out.println("removed: " + q1.remove());
    System.out.println("removed: " + q1.remove());

    try {
      System.out.println("removed: " + q1.remove());
    } catch (NoSuchElementException e) {
      System.out
        .println("Tried to remove too many items from queue");
    }
    Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);

    System.out.println("Queue 2 peek: " + q2.peek());
    q2.offer(10);
    q2.offer(20);
    System.out.println("Queue 2 peek: " + q2.peek());
    if (q2.offer(30) == false) {
      System.out.println("Offer failed to add third item.");
    }
    for (Integer value1 : q2) {
      System.out.println("Queue 2 value: " + value1);
    }
    System.out.println("Queue 2 poll: " + q2.poll());
    System.out.println("Queue 2 poll: " + q2.poll());
    System.out.println("Queue 2 poll: " + q2.poll());
  }
  // public static void doGrow(Plant plant) {
  // plant.grow();
  // }
}
