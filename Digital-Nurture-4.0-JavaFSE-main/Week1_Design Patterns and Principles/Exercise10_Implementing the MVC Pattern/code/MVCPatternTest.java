public class MVCPatternTest {
    public static void main(String[] args) {
        // Create Model
        Student student = new Student("Muthuraja", "S123", "A");

        // Create View
        StudentView view = new StudentView();

        // Create Controller
        StudentController controller = new StudentController(student, view);

        // Display initial details
        controller.updateView();

        // Update student data
        controller.setStudentName("Raj Kumar");
        controller.setStudentGrade("A+");

        // Display updated details
        controller.updateView();
    }
}
