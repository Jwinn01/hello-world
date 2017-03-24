
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

    public static void output() {
        System.out.println("I'm a lot bigger than a world!");
    }

    /**
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

    }
}
