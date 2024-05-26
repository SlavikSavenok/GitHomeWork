package homeWork_7_3;

public class Cat extends Animal implements ActionsAnimal{
    public Cat(String name, int id) {
        super(name, id);
    }


    @Override
    public String getSay() {
        return "Cat saying";
    }

    @Override
    public String getEat() {
        return "Cat eating";
    }

    @Override
    public String getFly() {
        return "";
    }
    @Override
    public String getSwim(){
        return "";
    }


}


