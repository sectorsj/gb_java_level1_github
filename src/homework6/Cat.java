package homework6;

import draftNotebook.Animal;

public class Cat extends Animal {

    public Cat(String name, int runingLimit, int swimingLimit, double jumpingLimit) {
        super(name, runingLimit, swimingLimit, jumpingLimit);
    }

    @Override
    public void run(int runDistance) {
        if (runDistance > runingLimit) {
            System.out.println(false);
        }else {
            System.out.println(true);
        }
    }

    //
    @Override
    public void swim(int swimDistance) {
        if (swimDistance > swimingLimit){
            System.out.println(false);
        }else {
            System.out.println(true);
        }
    }

    @Override
    public void jump(double jumpDistance) {
        if (jumpDistance > jumpingLimit){
            System.out.println(false);
        }else {
            System.out.println(true);
        }
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
