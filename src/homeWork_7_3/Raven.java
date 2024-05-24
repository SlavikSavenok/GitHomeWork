package homeWork_7_3;

public class Raven extends Animal implements ActionsAnimal{
    public Raven(String name, int id) {
        super(name, id);
    }


    @Override
    public String getSay() {
        return "Raven saying";
    }

    @Override
    public String getEat() {
        return "Raven eating";
    }


    @Override
    public String getFly() {
        return "Raven flying";
    }
}
