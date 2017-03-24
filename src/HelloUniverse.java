
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
        doSomething();
        doNothing();
    }

    /**
     * This function will output a string comment and nothing else.
     */
    public static void output() {
        System.out.println("I'm a lot bigger than a world!");
    }

    /**
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
    }
}
