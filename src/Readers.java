public class Readers {
    private int id;
    private String name;
    private String address;
    private String stateOfOrigin;

    Readers(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
        this.stateOfOrigin = stateOfOrigin;
    }

    public Readers() {

    }

    public static void remove(Readers reader) {

    }

    public String getStateOfOrigin() {
        return stateOfOrigin;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
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
