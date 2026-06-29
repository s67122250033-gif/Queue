import java.util.LinkedList;
import java.util.Queue;

public class QueueCaseStudy {
    public static void main(String[] args) {
        Queue<String> patientQueue = new LinkedList<>();
        

        patientQueue.add("P001");
        patientQueue.add("P002");
        patientQueue.add("P003");
        patientQueue.add("P004");
        patientQueue.add("P005");
        System.out.println("Initial patient registration: " + patientQueue);

        System.out.println("\n--- Calling 2 Patients for Service ---");
        for (int i = 1; i <= 2; i++) {

            if (!patientQueue.isEmpty()) {
                String servedPatient = patientQueue.poll();
                System.out.println("Patient served: " + servedPatient);
            }
        }

        patientQueue.add("P006");
        patientQueue.add("P007");
   
        String nextPatient = patientQueue.peek();
        System.out.println("\nNext patient to be served (peek): " + nextPatient);

        System.out.println("Number of remaining patients in queue (size): " + patientQueue.size());

        System.out.println("Current Queue status: " + patientQueue);
    }
}