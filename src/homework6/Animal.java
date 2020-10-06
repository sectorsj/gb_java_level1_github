package homework6;

public class Animal {
    public String name;
    public int runingLimit;
    public int swimingLimit;
    public double jumpingLimit;

    public Animal (String name, int runingLimit, int swimingLimit, double jumpingLimit) {
        this.name = name;
        this.runingLimit = runingLimit;
        this.swimingLimit = swimingLimit;
        this.jumpingLimit = jumpingLimit;
    }

    public void run(int runDistance){
        if (runDistance > runingLimit){
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }

    public void swim (int swimDistance){
        if(swimDistance > swimingLimit){
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }

    public void jump(double jumpDistance){
        if(jumpDistance > jumpingLimit){
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }

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
