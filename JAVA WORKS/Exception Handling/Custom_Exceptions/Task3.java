// 3. Healthcare System: Patient Not Found Exception

// Problem Statement:
// In a healthcare system, handle cases where a patient is not found in the system during a search or update operation. Create a custom exception `PatientNotFoundException` to represent this condition.

class PatientNotFoundException extends Exception {
    public PatientNotFoundException(String message) {
        super(message);
    }
}
class Patient {
    private String id;
    private String name;

    public Patient(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class HealthcareSystem {
    private Patient[] patients;

    public HealthcareSystem() {
        patients = new Patient[] {
            new Patient("123", "bob"),
            new Patient("456", "jeck")
        };
    }

    public String findPatient(String patientId) throws PatientNotFoundException {
        for (Patient patient : patients) {
            if (patient.getId().equals(patientId)) {
                return patient.getName();
            }
        }
        throw new PatientNotFoundException("Patient with ID " + patientId + " not found.");
    }
}
public class Task3 {
    public static void main(String[] args) {
        HealthcareSystem system = new HealthcareSystem();
        String patientId = "456";

        try {
            String patient = system.findPatient(patientId);
            System.out.println("Patient found: " + patient);
        } catch (PatientNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
