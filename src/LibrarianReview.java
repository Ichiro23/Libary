import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class LibrarianReview {
    private LinkedList<Librarian> libarians= new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    

    public void addLibarian() {
        System.out.println("Enter Libarian's Name :");
        String name = scanner.nextLine();
        //Addr
        System.out.println("Enter Libarians's Address :");
        String address = scanner.nextLine();
        //SOO
        System.out.println("Enter Libarian's State Of Origin :");
        String stateOfOrigin = scanner.nextLine();
        //id section
        int rand_int1 = rand.nextInt(1000);
        System.out.println("Your ID is : " + "LIB-" +rand_int1);

        //Saving info to Linked List
        Librarian newLibarian =new Librarian();

        newLibarian.setName(name);

        newLibarian.setAddress(address);

        newLibarian.setStateOfOrigin(stateOfOrigin);

        newLibarian.setId(rand_int1);

        libarians.add(newLibarian);
    }

    public void viewLibarians(){
        System.out.println("\nList Of Libarians : ");
        for (Librarian libarian : libarians)
            System.out.println("ID:" + "LIB-" + libarian.getId() + "\nName : " + libarian.getName() + "\nAddress : " + libarian.getAddress() +"\nState Of Origin : " + libarian.getStateOfOrigin());

    }

    



}
