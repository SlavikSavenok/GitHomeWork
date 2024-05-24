package homeWork_7_3;

public class Lama extends Animal implements ActionsAnimal{
    public Lama(String name, int id) {
        super(name, id);
    }

    @Override
    public String getSay() {
        return "Lama saying";
    }

    @Override
    public String getEat() {
        return "Lame eating ";
    }

    @Override
    public String getFly() {
        return "";
    }

    @Override
    public String getSwim() {
        return "Lama swimming";
    }


}
