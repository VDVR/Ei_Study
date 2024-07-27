package singleton;

import java.util.Timer;
import java.util.TimerTask;

public class TaskScheduler {
    private static TaskScheduler instance;
    private Timer timer;

    private TaskScheduler() {
        timer = new Timer(true); // Daemon thread
    }

    public static synchronized TaskScheduler getInstance() {
        if (instance == null) {
            instance = new TaskScheduler();
        }
        return instance;
    }

    public void scheduleTask(Runnable task, long delay, long period) {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                task.run();
            }
        }, delay, period);
    }
}
