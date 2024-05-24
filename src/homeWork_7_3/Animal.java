package homeWork_7_3;

public abstract class Animal implements ActionsAnimal {
    private String name;
    private int id;


    public Animal(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getFly() {
        return name;
    }

    @Override
    public String getSay() {
        return name;
    }

    @Override
    public String getEat() {
        return name;
    }

    @Override
    public String getSwim() {
        return name;
    }
}
