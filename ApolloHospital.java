import java.util.*;

class Doctor {
    private int id;
    private String name;
    private String specialist;

    Doctor(int id, String name, String specialist) {
        this.id = id;
        this.name = name;
        this.specialist = specialist;
    }

    // Corrected method names to start with uppercase
    public String getSpecialist() {
        return specialist;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class Hospital {
    private String name;
    private String address;
    private Doctor[] doctors;

    Hospital(String name, String address, int maxDoctors) {
        this.name = name;
        this.address = address;
        this.doctors = new Doctor[maxDoctors];
    }

    // Getter method for doctors array
    public Doctor[] getDoctors() {
        return doctors;
    }

    public void DoctorsBySpeciality(String speciality) {
        System.out.println("Doctors Specialty in " + speciality);
        for (Doctor dc : doctors) {
            if ("Radiology".equalsIgnoreCase(dc.getSpecialist())) {
                System.out.printf("The Id:%d\tName:%s\n", dc.getId(), dc.getName());
            }
        }
    }
}

public class ApolloHospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number of Hospitals: ");
        int numHospitals = scanner.nextInt();

        Hospital[] hospitals = new Hospital[numHospitals];
        for (int i = 0; i < numHospitals; i++) {
            System.out.println("Enter the Hospital Name:");
            String hospitalName = scanner.next(); // Renamed variable to avoid conflict

            System.out.println("Enter the Hospital Address:");
            String address = scanner.next();

            System.out.println("Enter the maximum number of doctors for this hospital:");
            int maxDoctors = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            hospitals[i] = new Hospital(hospitalName, address, maxDoctors); // Pass the renamed variable

            for (int j = 0; j < maxDoctors; j++) {
                System.out.print("Enter the Doctor ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over

                System.out.print("Enter the Doctor's Name: ");
                String doctorName = scanner.nextLine(); // Renamed variable to avoid conflict

                System.out.print("Enter Doctor's Specialty: ");
                String specialty = scanner.nextLine();

                Doctor doctor = new Doctor(id, doctorName, specialty); // Use the renamed variable
                hospitals[i].getDoctors()[j] = doctor; // Access doctors array through getter
            }
        }

        for (Hospital hs : hospitals) {
            hs.DoctorsBySpeciality("Radiology");
        }

      
    }
}
