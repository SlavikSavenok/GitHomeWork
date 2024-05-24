package homeWork_7_3;

public class Fish extends Animal implements ActionsAnimal{
    public Fish(String name, int id) {
        super(name, id);
    }

    @Override
    public String getSay() {
        return "";
    }

    @Override
    public String getEat() {
        return "Fish eating";
    }

    @Override
    public String getFly() {
        return "";
    }

    @Override
    public String getSwim() {
        return "Fish swimming";
    }



}
