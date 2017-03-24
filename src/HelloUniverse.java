
/**
 * A class that will output the string "Hello Universe" which is better than
 * "Hello World".
 * 
 * @author Jason Wong
 *
 */
public class HelloUniverse {

    public static void main(String[] args) {
        System.out.println("Hello Universe");
        output();
<<<<<<< HEAD
    }

    /**
     * This function will output a string comment and nothing else.
     */
=======
        doSomething();
        doNothing();
    }

>>>>>>> master
    public static void output() {
        System.out.println("I'm a lot bigger than a world!");
    }

    /**
<<<<<<< HEAD
     * This function does absolutely nothing.
     */
    public static void doNothing() {
        // literally do nothing in here
    }

    /**
     * This function outputs 100 lines of values.
     */
    public static void doSomething() {
        // Do something here

        for (int i = 0; i < 100; i++) {
            System.out.println("Printing value: " + i);
        }
=======
     * This function will do something.
     */
    public static void doSomething() {
        System.out.println("Doing Something.");
    }

    /**
     * This function will do nothing. It will also have merge issues with
     * different branches.
     */
    public static void doNothing() {

>>>>>>> master
    }
}
