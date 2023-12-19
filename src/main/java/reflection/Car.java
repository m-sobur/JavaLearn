package reflection;

public class Car {
    public int id;
    public String name;
    public String model;

    private int cost;

    public Car(){}

    public Car(int id, String name, String model, int cost) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.cost = cost;
    }

    public Car(int id, String name, String model) {
        this.id = id;
        this.name = name;
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    private void ChangeModel(String newModel){
        this.model = newModel;
        System.out.println("New model is - " + this.model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", cost=" + cost +
                '}';
    }
}
