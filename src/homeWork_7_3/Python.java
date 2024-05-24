package homeWork_7_3;

public class Python extends Animal implements ActionsAnimal{
    public Python(String name, int id) {
        super(name, id);
    }

    @Override
    public String getSay() {
        return "";
    }

    @Override
    public String getEat() {
        return "Python eating";
    }

    @Override
    public String getFly() {
        return "";
    }

    @Override
    public String getSwim() {
        return "Python swimming";
    }


}
