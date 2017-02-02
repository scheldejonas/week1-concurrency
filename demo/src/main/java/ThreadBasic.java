/**
 * Basic operations on how to create and start a thread.
 */
public class ThreadBasic {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++ ) {
            startThreeThreadsWithSleep(i);
        }
    }

    private static void startThreeThreadsWithSleep(int number) {

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    System.out.printf("Hi %s \n",number);
                    Thread.sleep(10000);
                    System.out.printf("Done sleeping %s \n", number);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();

    }


}
