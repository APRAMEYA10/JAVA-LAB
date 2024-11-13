
package SEE;

import CIE.Student;

public class External extends Student {
       private int[] externalMarks = new int[5];

        public External(String usn, String name, int sem, int[] externalMarks) {
        super(usn, name, sem);
        this.externalMarks = externalMarks;
    }
    public int[] getExternalMarks() {
        return externalMarks;
    }

      public int calculateExternalTotal() {
        int total = 0;
        for (int mark : externalMarks) {
            total += mark;
        }
        return total;
    }
}
