package homework6;

 public abstract class Animal {
    protected String name;
    protected int runingLimit;
    protected int swimingLimit;
    protected double jumpingLimit;

    protected abstract void run(int runDistance);
    protected abstract void swim (int swimDistance);
    protected abstract void jump(double jumpDistance);

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", runLimit=" + runingLimit +
                ", swimLimit=" + swimingLimit +
                ", jumpLimit=" + jumpingLimit +
                '}';
    }
}
