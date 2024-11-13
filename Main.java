import CIE.Internals;
import SEE.External;

public class Main {
    public static void main(String[] args) {
        System.out.println("Final Marks for Student 1:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Internal Marks: " + student1.calculateInternalTotal());
        System.out.println("External Marks: " + student2.calculateExternalTotal());
        System.out.println("Final Marks (Internal + External): " +
                (student1.calculateInternalTotal() + student2.calculateExternalTotal()) + "\n");

        System.out.println("Final Marks for Student 2:");
        System.out.println("Name: " + student3.getName());
        System.out.println("Internal Marks: " + student3.calculateInternalTotal());
        System.out.println("External Marks: " + student4.calculateExternalTotal());
        System.out.println("Final Marks (Internal + External): " + (student3.calculateInternalTotal() + student4.calculateExternalTotal()) + "\n");
    }
}
