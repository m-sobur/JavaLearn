package patterns.creational.factoryMethod.example2;

public class GemGenerator extends ItemGenerator{
    @Override
    public GameItem createItem() {
        return new GemReward();
    }
}