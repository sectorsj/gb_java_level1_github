package homework1level2;

public abstract class Obstacle {
    private String name;

    public Obstacle(String name){
        this.name = name;
    }

    protected abstract boolean moving (Human var1);

    protected abstract boolean moving (Cat1 var1);

    protected abstract boolean moving (Robot var1);

    public String getName() {
        return this.name;
    }
}