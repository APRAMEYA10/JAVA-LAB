
package CIE;

public class Student {
       protected String usn;
    protected String name;
    protected int sem;

        public Student(String usn, String name, int sem) {
        this.usn = usn;
        this.name = name;
        this.sem = sem;
    }

       public String getUsn() {
        return usn;
    }

    public String getName() {
        return name;
    }

    public int getSem() {
        return sem;
    }
}

package CIE;

public class Internals extends Student {
       private int[] internalMarks = new int[5];

       public Internals(String usn, String name, int sem, int[] internalMarks) {
        super(usn, name, sem);
        this.internalMarks = internalMarks;
    }

       public int[] getInternalMarks() {
        return internalMarks;
    }

       public int calculateInternalTotal() {
        int total = 0;
        for (int mark : internalMarks) {
            total += mark;
        }
        return total;
    }
}
