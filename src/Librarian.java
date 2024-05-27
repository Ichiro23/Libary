public class Librarian {
   private int id;
   private String name;
   private String address;
   private String stateOfOrigin;

   public Librarian(){
       this.id = id;
       this.name = name;
       this.address = address;
       this.stateOfOrigin = stateOfOrigin;
   }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStateOfOrigin() {
        return stateOfOrigin;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStateOfOrigin(String stateOfOrigin) {
        this.stateOfOrigin = stateOfOrigin;
    }
}
