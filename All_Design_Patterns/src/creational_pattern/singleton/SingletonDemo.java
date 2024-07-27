package singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        TaskScheduler scheduler = TaskScheduler.getInstance();

        // Define a task
        Runnable task = () -> System.out.println("Task executed at: " + System.currentTimeMillis());

        // Schedule the task to run every 2 seconds with a 1-second delay
        scheduler.scheduleTask(task, 1000, 2000);

        // Let the application run for a while to observe scheduled tasks
        try {
            Thread.sleep(10000); // Sleep for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("TaskScheduler is running and tasks are scheduled.");
    }
}
