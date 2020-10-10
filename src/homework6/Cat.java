package homework6;


public class Cat extends Animal {
    protected String name;
    protected int runingLimit;
    protected int swimingLimit;
    protected double jumpingLimit;

    protected Cat (String name, int runingLimit, int swimingLimit, double jumpingLimit) {
        this.name = name;
        this.runingLimit = runingLimit;
        this.swimingLimit = swimingLimit;
        this.jumpingLimit = jumpingLimit;
    }

    @Override
    protected void run(int runDistance) {
        boolean isRun = runDistance <= runingLimit;
            System.out.println("Run result: " + isRun);
    }

    //
    @Override
    protected void swim(int swimDistance) {
        boolean isSwim = swimDistance <= swimingLimit;
            System.out.println("Swim result: " + isSwim);
    }

    @Override
    protected void jump(double jumpDistance) {
        boolean isJump = jumpDistance <= jumpingLimit;
            System.out.println("Jump result: " + isJump);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", runLimit=" + runingLimit +
                ", swimLimit=" + swimingLimit +
                ", jumpLimit=" + jumpingLimit +
                '}';
    }
}
