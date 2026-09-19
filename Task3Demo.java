public class Task3Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Abeer Amina";

        System.out.println("--- Testing 3 Valid Overload Calls ---");
        s1.enroll("CSC241");        // Calls enroll(String)
        s1.enroll("CSC241", 2);     // Calls enroll(String, int)
        s1.enroll(241);             // Calls enroll(int)

        System.out.println("\n--- Testing 2 Invalid Calls (Commented Out in Code) ---");
        // s1.enroll();            // ERROR: No matching method takes zero arguments
        // s1.enroll("241", "2");  // ERROR: No matching method takes two String arguments
        System.out.println("Invalid calls were verified and commented out to preserve compilation.");
    }

    // --- Optional Stretch Question Verification ---
    public static void show(long x) {
        System.out.println("show(long) was called with value: " + x);
    }

    public static void show(double x) {
        System.out.println("show(double) was called with value: " + x);
    }
}