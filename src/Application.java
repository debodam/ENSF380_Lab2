/**
 * Application.Java
 * Lab 2 Exercise D
 * @author Debojeet Dam
 * Date Submitted: July 10, 2024
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Application class implements a console-based management system for a pet resort.
 * Users can add pets, clients, care profiles, record boarding details, manage client relationships, and exit the system.
 */
public class Application {

    /**
     * Main method to run the application.
     * Displays a menu and processes user input accordingly.
     * @param args Command line arguments (not used in this application)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\nWelcome to YYC Pet Resort Management System!");
            System.out.println("Please select an option:");
            System.out.println("1. Add a new Pet");
            System.out.println("2. Add a new Client");
            System.out.println("3. Add a new Care Profile");
            System.out.println("4. Record a Boarding");
            System.out.println("5. Record a Client Relationship");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addNewPet(scanner);
                    break;
                case 2:
                    addNewClient(scanner);
                    break;
                case 3:
                    addNewCareProfile(scanner);
                    break;
                case 4:
                    recordBoarding(scanner);
                    break;
                case 5:
                	recordClientRelationship(scanner);
                    break;
                case 6:
                    running = false;
                    System.out.println("Thank you for using YYC Pet Resort Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }

    /**
     * Method to add a new pet to the system.
     * Prompts the user for pet details and prints the added pet's information.
     * @param scanner Scanner object for user input
     */
    private static void addNewPet(Scanner scanner) {
        Pet pet = new Pet();
        System.out.println("\nEnter pet details:");
        System.out.print("Name: ");
        pet.setName(scanner.nextLine());
        System.out.print("Species: ");
        pet.setSpecies(scanner.nextLine());
        System.out.print("Breed: ");
        pet.setBreed(scanner.nextLine());
        System.out.print("Date of Birth (YYYY-MM-DD): ");
        pet.setDateOfBirth(scanner.nextLine());

        System.out.println("New Pet added successfully:");
        System.out.println("Name: " + pet.getName() + ", Species: " + pet.getSpecies() + ", Breed: " + pet.getBreed() + ", Date of Birth: " + pet.getDateOfBirth());
    }

    /**
     * Method to add a new client to the system.
     * Prompts the user for client details and prints the added client's information.
     * @param scanner Scanner object for user input
     */
    private static void addNewClient(Scanner scanner) {
        Client client = new Client();
        System.out.println("\nEnter client details:");
        System.out.print("Name: ");
        client.setName(scanner.nextLine());
        System.out.print("Phone: ");
        client.setPhone(scanner.nextLine());
        System.out.print("Address: ");
        client.setAddress(scanner.nextLine());

        System.out.println("New Client added successfully:");
        System.out.println("Name: " + client.getName() + ", Phone: " + client.getPhone() + ", Address: " + client.getAddress());
    }

    /**
     * Method to add a new care profile to the system.
     * Prompts the user for care profile details and prints the added care profile's information.
     * @param scanner Scanner object for user input
     */
    private static void addNewCareProfile(Scanner scanner) {
        CareProfile careProfile = new CareProfile();
        System.out.println("\nEnter care profile details:");
        System.out.print("Feeding Instructions: ");
        careProfile.setFeedingInstructions(scanner.nextLine());
        List<String> medications = new ArrayList<>();
        System.out.println("Enter medications (one per line, end with 'done'):");
        while (true) {
            String medication = scanner.nextLine();
            if (medication.equalsIgnoreCase("done")) {
                break;
            }
            medications.add(medication);
        }
        careProfile.setMedicationList(medications);
        System.out.print("Medication Instructions: ");
        careProfile.setMedicationInstructions(scanner.nextLine());

        System.out.println("New Care Profile added successfully:");
        System.out.println("Feeding Instructions: " + careProfile.getFeedingInstructions());
        System.out.println("Medications:");
        for (String medication : careProfile.getMedicationList()) {
            System.out.println("- " + medication);
        }
        System.out.println("Medication Instructions: " + careProfile.getMedicationInstructions());
    }

    /**
     * Method to record a boarding for a pet.
     * Prompts the user to input details for a new boarding record and adds it to the appropriate lists.
     * @param scanner Scanner object for user input
     */
    private static void recordBoarding(Scanner scanner) {
        BoardingRecord boardingRecord = new BoardingRecord();

        System.out.println("\nEnter boarding details:");
        System.out.print("Check-in Date (YYYY-MM-DD): ");
        String checkInDate = scanner.nextLine();
        boardingRecord.setCheckInDate(checkInDate);

        System.out.print("Check-out Date (YYYY-MM-DD): ");
        String checkOutDate = scanner.nextLine();
        boardingRecord.setCheckOutDate(checkOutDate);

        // Assuming pets and care profiles are managed elsewhere, we'll just print basic info for now
        System.out.println("\nBoarding Record added successfully:");
        System.out.println("Check-in Date: " + boardingRecord.getCheckInDate());
        System.out.println("Check-out Date: " + boardingRecord.getCheckOutDate());
    }

    /**
     * Method to record a client relationship with a pet.
     * Prompts the user to select a client and a pet for the relationship and records it.
     * @param scanner Scanner object for user input
     */
    private static void recordClientRelationship(Scanner scanner) {
        ClientRelationship clientRelationship = new ClientRelationship();

        System.out.println("\nEnter client relationship details:");
        System.out.print("Relationship Status: ");
        String relationshipStatus = scanner.nextLine();
        clientRelationship.setRelationshipStatus(relationshipStatus);

        System.out.print("Client Name: ");
        String clientName = scanner.nextLine();
        clientRelationship.setClient(new Client(clientName));

        System.out.print("Pet Name: ");
        String petName = scanner.nextLine();
        clientRelationship.setPet(new Pet(petName));

        // Assuming clients and pets are managed elsewhere, we'll just print basic info for now
        System.out.println("\nClient Relationship added successfully:");
        System.out.println("Relationship Status: " + clientRelationship.getRelationshipStatus());
        System.out.println("Client: " + clientRelationship.getClient().getName());
        System.out.println("Pet: " + clientRelationship.getPet().getName());
    }



}
