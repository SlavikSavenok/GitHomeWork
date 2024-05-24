package homeWorK_6_1;

public class Client {
    private int id;
    private String name;
    private int age;
    private boolean registration;

    public Client(int id, String name, int age, boolean registration) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.registration = registration;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isRegistration() {
        return registration;
    }

    public void setRegistration(boolean registration) {
        this.registration = registration;
    }

    public void clientInformation() {
        System.out.println("Данные клиента: id: " + id + ". Имя: " + name + ". Возраст: " + age + ". Регистрация: " + registration);

    }
}







