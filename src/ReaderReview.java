import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;
import java.util.Random;


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

  public enum Position{
    Reader;
    Librarian;
  }

}

