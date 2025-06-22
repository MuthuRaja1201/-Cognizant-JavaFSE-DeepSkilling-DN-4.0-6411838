public class TaskTest {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        // Add tasks
        manager.addTask(new Task(1, "Design UI", "Pending"));
        manager.addTask(new Task(2, "Implement Backend", "In Progress"));
        manager.addTask(new Task(3, "Test Application", "Pending"));

        // Traverse all tasks
        manager.traverseTasks();

        // Search for a task
        Task foundTask = manager.searchTask(2);
        System.out.println("\nSearch Result:");
        if (foundTask != null)
            System.out.println(foundTask);
        else
            System.out.println("Task not found.");

        // Delete a task
        manager.deleteTask(2);

        // Display after deletion
        System.out.println("\nAfter Deletion:");
        manager.traverseTasks();
    }
}
