package threads;

/**
 * Created by scheldejonas on 02/02/17.
 */
public class ExtendedThreat extends Thread {

    // This was my test, to try out an thread being extended
    // After this, i found out the run method, is set, in the Runnable private field inside the Thread
    @Override
    public void run() {
        super.run();
    }
}
