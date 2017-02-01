import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * <h2>Task 1</h2>
 * <p>
 * Write three methods:
 * <ol>
 * <li>Compute and print the sum of all numbers from 1 to 1 billion.</li>
 * <li>
 * Print the numbers from 1 to 5. Pause for 2 seconds between each print.
 * </li>
 * <li>
 * Print all numbers from 10 and up to {@link Integer#MAX_VALUE}. Pause for 3
 * seconds between each print.
 * </li>
 * </ol>
 * Create three threads that run each of the above methods. Start them all
 * simultaneously from your main method. Stop / kill the thread running the
 * third method after waiting 10 seconds.
 * </p>
 */
public class Threads {

    public void printNumberToScreen(Integer number) {
        System.out.println(number);
    }

    public Integer increaseNumberByOne(Integer number) {
        Integer newNumber = number++;
        return newNumber;
    }

    public void loopAndPrintallNumbersFromOneToOneBillion() {
        boolean isCounterBelowOneBillion = true;
        Integer counter = 0;
        Integer number = 0;

        while (isCounterBelowOneBillion) {

            increaseNumberByOne(number);
            printNumberToScreen(number);

            counter++;
            if (counter > 1000000) {
                isCounterBelowOneBillion = false;
            }
        }
    }

    /**
     * Starts three threads that execute three methods simultaneously.
     *
     * @param args Input arguments to the main method. Unused.
     */
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                new Threads().loopAndPrintallNumbersFromOneToOneBillion();
            }
        };


    }
}
