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
    System.out.println("\n\nEnter Reader's Name :");
    String name = scanner.nextLine();
    System.out.println("\n\nEnter Reader's Address :");
    String address = scanner.nextLine();
    System.out.println("\n\nEnter State Of Origin : ");
    String stateOfOrigin = scanner.nextLine();
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

    public void convertReaderToLibrarian(LibrarianReview library) {
        System.out.println("Enter the ID of the reader you want to convert to librarian:");
        int idToConvert = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Iterator<Readers> iterator = reader.iterator();
        while (iterator.hasNext()) {
            Readers reader = iterator.next();
            if (reader.getId() == idToConvert) {
                iterator.remove(); // Remove the reader from the list

                // Create a new librarian object using the reader's information
                Librarian newLibrarian = new Librarian();
                newLibrarian.setId(reader.getId());
                newLibrarian.setName(reader.getName());
                newLibrarian.setAddress(reader.getAddress());
                newLibrarian.setStateOfOrigin(reader.getStateOfOrigin());

                // Add the new librarian to the list of librarians
                library.getLibarians().add(newLibrarian);

                System.out.println("Reader converted to librarian successfully.");
                return;
            }
        }

        System.out.println("Reader with ID " + idToConvert + " not found.");
    }



}

