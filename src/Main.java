import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        LibrarianReview library = new LibrarianReview();
        ReaderReview lib = new ReaderReview();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            try {
                System.out.println("\n1. Add New Reader");
                System.out.println("2. Add New Librarian");
                System.out.println("3. Display Reader(s)");
                System.out.println("4. Display Librarian(s)");
                System.out.println("5. Convert Reader to Librarian");
                System.out.println("6. Exit");
                System.out.println("Enter your choice:");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        lib.addReader();
                        break;
                    case 2:
                        library.addLibarian();
                        break;
                    case 3:
                        lib.viewReaders();
                        break;
                    case 4:
                        library.viewLibarians();
                        break;
                    case 5:
                        lib.convertReaderToLibrarian(library);
                        break;
                    case 6:
                        System.out.println("Goodbye...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice, please choose from the available  options");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer choice.");
                scanner.nextLine();
            }
        }
    }
}