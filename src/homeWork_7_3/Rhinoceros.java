package homeWork_7_3;

public class Rhinoceros extends Animal implements ActionsAnimal{
    public Rhinoceros(String name, int id) {
        super(name, id);
    }


    @Override
    public String getSay() {
        return "Rhinoceros saying";
    }

    @Override
    public String getEat() {
        return "Rhinoceros eating";
    }

    @Override
    public String getFly() {
        return "";
    }

    @Override
    public String getSwim() {
        return "Swimming";
    }


}
