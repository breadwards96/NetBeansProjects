package project.pkg2;

/**
 * Project: Project2 Author: Brandon Edwards
 * Creation date: 10/15/18 
 * Completion time: 3 hours
 *
 * Honor Code: I pledge that this program represents my own program code. I
 * received help from no one in designing and debugging my program.
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new Driver().run();

    }

    /**
     * Demo Method
     */
    public void run() {

        System.out.println("Initializing a sequence of intergers with an initial capacity of 10");
        Sequence<Integer> intSequence = new Sequence<>();

        System.out.println("Initializing a sequence of Strings with an initial capacity of 10");
        Sequence<String> strSequence = new Sequence<>();

        System.out.println("Filling the integer sequence with 10 numbers");
        for (int i = 0; i < 10; i++) {
            intSequence.append(i);
        }

        System.out.println("Demonstrating the methods for the integer sequence.");
        System.out.println("size: " + intSequence.getSize());
        System.out.println("Int at index 0: " + intSequence.getData(0));
        System.out.println("Setting integer at index 0 to 10");
        intSequence.setData(0, 10);
        System.out.println("Int at index 0: " + intSequence.getData(0));

        System.out.println("Demonstrating the methods for the string sequence");
        System.out.println("Appending 'Hello' to the end of the sequence");
        strSequence.append("Hello");
        System.out.println("Size: " + strSequence.getSize());
        System.out.println("String at index 0: " + strSequence.getData(0));
        System.out.println("Setting String at index 0 to 'Goodbye'");
        strSequence.setData(0, "Goodbye");
        System.out.println("String at index 0: " + strSequence.getData(0));
    }
}
