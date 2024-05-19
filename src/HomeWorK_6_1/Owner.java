package HomeWorK_6_1;

public class Owner {
    private int id;
    private String name;
    private String contactNumber;

    public Owner(int id, String name, String contactNumber) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void ownerInformation() {
        System.out.println("Данные владельца: id: " + id + ". Имя владельца: " + name + ". Контактный номер: " + contactNumber);

    }
}
