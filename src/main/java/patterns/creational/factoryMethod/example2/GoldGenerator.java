package patterns.creational.factoryMethod.example2;

public class GoldGenerator extends ItemGenerator{
    @Override
    public GameItem createItem() {
        return new GoldReward();
    }
}
