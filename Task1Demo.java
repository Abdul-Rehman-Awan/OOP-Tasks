public class Task1Demo {
    public static void main(String[] args) {
        // 1. Instantiate three Student objects
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        // 2. Assign values using example data from the task
        s1.studentId = "BAI-001";
        s1.name = "Abeer Amina";
        s1.completedCredits = 30;

        s2.studentId = "BAI-002";
        s2.name = "Ali Ishtiaq";
        s2.completedCredits = 45;

        s3.studentId = "BAI-003";
        s3.name = "Abdul Rehman Azam";
        s3.completedCredits = 60;

        // 3. Print state of all three objects BEFORE modification
        System.out.println("--- BEFORE MODIFICATION ---");
        s1.Summary();
        s2.Summary();
        s3.Summary();

        // 4. Increase completedCredits of ONLY one object (s2)
        s2.completedCredits += 15; // or s2.completedCredits = s2.completedCredits + 15;

        // 5. Print state of all three objects AFTER modification
        System.out.println("\n--- AFTER MODIFICATION (Modified s2) ---");
        s1.Summary();
        s2.Summary();
        s3.Summary();

        /* 
         * Explanation Comment:
         * The other two objects (s1 and s3) did not change because instance variables reside in distinct memory locations for each object.
         * Modifying s2's completedCredits only updates the heap memory allocated specifically to s2, leaving s1 and s3 completely independent.
         */
    }
}
