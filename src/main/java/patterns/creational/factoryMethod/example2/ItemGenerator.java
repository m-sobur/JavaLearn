package patterns.creational.factoryMethod.example2;

public abstract class ItemGenerator {
    public void openReward() {
        // ... other code ...
        GameItem gameItem = createItem();
        gameItem.open();
    }

    /**
     * Subclasses will override this method in order to create
     * specific reward objects.
     */
    public abstract GameItem createItem();
}
