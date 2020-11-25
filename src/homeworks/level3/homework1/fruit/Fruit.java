package homeworks.level3.homework1.fruit;

public abstract class Fruit {
    protected float weight = 0;


    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}
