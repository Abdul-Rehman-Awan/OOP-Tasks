public class Task2Demo {
    public static void main(String[] args) {
        // Instantiate two Student objects
        Student s1 = new Student();
        s1.studentId = "BAI-001";
        s1.name = "Abeer Amina";
        s1.completedCredits = 30;

        Student s2 = new Student();
        s2.studentId = "BAI-002";
        s2.name = "Ali Ishtiaq";
        s2.completedCredits = 45;

        int totalDegreeCredits = 130;

        // Calling summary() on both objects
        System.out.println("--- Initial Summaries ---");
        System.out.println(s1.Summary());
        System.out.println(s2.Summary());

        // Calling remainingCredits() on both objects
        System.out.println("\n--- Remaining Credits (Degree total: 130) ---");
        System.out.println(s1.name + " remaining: " + s1.remainingCredits(totalDegreeCredits));
        System.out.println(s2.name + " remaining: " + s2.remainingCredits(totalDegreeCredits));

        // Calling addCredits() to modify state on both objects
        s1.addCredits(15);
        s2.addCredits(12);

        // Printing updated summaries and remaining credits
        System.out.println("\n--- Updated Summaries After Adding Credits ---");
        System.out.println(s1.Summary());
        System.out.println(s2.Summary());

        System.out.println("\n--- Updated Remaining Credits ---");
        System.out.println(s1.name + " new remaining: " + s1.remainingCredits(totalDegreeCredits));
        System.out.println(s2.name + " new remaining: " + s2.remainingCredits(totalDegreeCredits));
    }
}