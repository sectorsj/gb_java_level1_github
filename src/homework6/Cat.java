package homework6;

public class Cat extends Animal {

    protected Cat (String name, int runingLimit, int swimingLimit, double jumpingLimit) {
        this.name = name;
        this.runingLimit = runingLimit;
        this.swimingLimit = swimingLimit;
        this.jumpingLimit = jumpingLimit;
    }

    @Override
    protected void run(int runDistance) {
        boolean isRun = runDistance <= runingLimit;
            System.out.print("Run result: " + isRun + ", ");
    }

    @Override
    protected void swim(int swimDistance) {
        boolean isSwim = swimDistance <= swimingLimit;
            System.out.print("Swim result: " + isSwim + ", ");
    }

    @Override
    protected void jump(double jumpDistance) {
        boolean isJump = jumpDistance <= jumpingLimit;
            System.out.print("Jump result: " + isJump + ";\n");
    }

    @Override
    public String toString() {
        return "Cat {" +
                "name='" + name +
                ", runLimit=" + runingLimit +
                ", swimLimit=" + swimingLimit +
                ", jumpLimit=" + jumpingLimit +
                '}';
    }
}
