package homeWork_8_3;

public enum AnimalEnum implements Action {
    UNICORN,
    PHOENIX,
    KRAKEN,
    PEGASUS,
    CERBERUS,
    LEVIATHAN;

    AnimalEnum() {

    }

    @Override
    public String getEat() {
        return name() + " eat";
    }

    @Override
    public String getSwim() {
        return name() + " swim";
    }

    @Override
    public String getFly() {
        return name() + " fly";
    }

    @Override
    public String getSay() {
        return name() + " say";
    }
}






