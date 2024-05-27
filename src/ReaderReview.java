import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;
import java.util.Random;
import java.util.Iterator;



public class ReaderReview {
  private LinkedList<Readers> reader = new LinkedList<>();
  Scanner scanner = new Scanner(System.in);
  Random rand = new Random();

  public void addReader() {
      //TO GIVE ERROR EXCEPTION AND RETURN TO MENU

      //    System.out.println("\n\nEnter Reader's Name :");
//      String name = scanner.nextLine().trim();
//      if (name.isEmpty()) {
//          System.out.println("Name cannot be empty. Please enter a valid name.");
//          return;
//      }
      String name;
      do {
          System.out.println("\nEnter Reader's Name:");
          name = scanner.nextLine().trim();
      } while (name.isEmpty());

      String address;
      do {
          System.out.println("\nEnter Reader's Address:");
          address = scanner.nextLine().trim();
      } while (address.isEmpty());

      String stateOfOrigin;
      do {
          System.out.println("\nEnter Reader's State Of Origin:");
          stateOfOrigin = scanner.nextLine().trim();
      } while (stateOfOrigin.isEmpty());
    //id again
    int rand2 = rand.nextInt(1000);
    System.out.println("\n\nYour ID is : " + "LIB-" +rand2);


    //Linked list function
    Readers newReader;
        newReader = new Readers();
        newReader.setName(name);
        newReader.setAddress(address);
        newReader.setStateOfOrigin(stateOfOrigin);
        newReader.setId(rand2);
        reader.add(newReader);

  }

  public void viewReaders(){
    System.out.println("\n\nList Of Readers : ");
    for (Readers readers : reader)
      System.out.println("\nID :" + "LIB-" + readers.getId() + "\n\nName : " + readers.getName()+ "\n\nAddress: " + readers.getAddress() + "\n\nState Of Origin : " + readers.getStateOfOrigin());
  }

//    public void convertReaderToLibrarian(LibrarianReview library) {
//        System.out.println("Enter the ID of the reader you want to convert to librarian:");
//        int idToConvert = scanner.nextInt();
//
//        for (Readers reader : reader) {
//            if (reader.getId() == idToConvert) {
//                // Remove the reader from the list of readers
//                Readers.remove(reader);
//
//                // Create a new librarian object using the reader's information
//                Librarian newLibrarian = new Librarian();
//                newLibrarian.setId(reader.getId());
//                newLibrarian.setName(reader.getName());
//                newLibrarian.setAddress(reader.getAddress());
//                newLibrarian.setStateOfOrigin(reader.getStateOfOrigin());
//
//                // Add the new librarian to the list of librarians
//                library.getLibarians().add(newLibrarian);
//
//                System.out.println("Reader converted to librarian successfully.");
//                return;
//            }
//        }
//
//        System.out.println("Reader with ID " + idToConvert + " not found.");
//    }

//    public void convertReaderToLibrarian(LibrarianReview library) {
//        System.out.println("Enter the ID of the reader you want to convert to librarian:");
//        int idToConvert = scanner.nextInt();
//        scanner.nextLine(); // Consume newline
//
//        Iterator<Readers> iterator = reader.iterator();
//        while (iterator.hasNext()) {
//            Readers reader = iterator.next();
//            if (reader.getId() == idToConvert) {
//                iterator.remove(); // Remove the reader from the list
//
//                // Create a new librarian object using the reader's information
//                Librarian newLibrarian = new Librarian();
//                newLibrarian.setId(reader.getId());
//                newLibrarian.setName(reader.getName());
//                newLibrarian.setAddress(reader.getAddress());
//                newLibrarian.setStateOfOrigin(reader.getStateOfOrigin());
//
//                // Add the new librarian to the list of librarians
//                library.getLibarians().add(newLibrarian);
//
//                System.out.println("Reader converted to librarian successfully.");
//                return;
//            }
//        }
//
//        System.out.println("Reader with ID " + idToConvert + " not found.");
//    }
public void convertReaderToLibrarian(LibrarianReview library) {
    System.out.println("Enter the ID of the reader you want to convert to librarian:");
    int idToConvert = scanner.nextInt();
    scanner.nextLine(); // Consume newline

    Iterator<Readers> iterator = reader.iterator();
    while (iterator.hasNext()) {
        Readers reader = iterator.next();
        if (reader.getId() == idToConvert) {
            // Remove the reader from the list of readers
            iterator.remove();

            // Check if the ID already exists for a librarian
            boolean idExists = false;
            for (Librarian librarian : library.getLibarians()) {
                if (librarian.getId() == idToConvert) {
                    idExists = true;
                    break;
                }
            }

            if (idExists) {
                System.out.println("A librarian with ID " + idToConvert + " already exists. Please choose a different ID.");
            } else {
                // Create a new librarian object using the reader's information
                Librarian newLibrarian = new Librarian();
                newLibrarian.setId(reader.getId());
                newLibrarian.setName(reader.getName());
                newLibrarian.setAddress(reader.getAddress());
                newLibrarian.setStateOfOrigin(reader.getStateOfOrigin());

                // Add the new librarian to the list of librarians
                library.getLibarians().add(newLibrarian);

                System.out.println("Reader converted to librarian successfully.");
            }
            return;
        }
    }
    System.out.println("Reader with ID " + idToConvert + " not found.");
}





}

