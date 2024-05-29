package homeWork_8_3;

public enum AnimalEnum implements Action {
    UNICORN(),
    PHOENIX(),
    KRAKEN(),
    PEGASUS(),
    CERBERUS(),
    LEVIATHAN();
    boolean canSwim;

    AnimalEnum() {

    }

    @Override
    public String getEat() {
        return name() + " eating";
    }

    @Override
    public String getSwim() {
        return name() + " swimming";
    }

    @Override
    public String getFly() {
        return name() + " flying";
    }

    @Override
    public String getSay() {
        return name() + " saying";
    }
}






