package homework7;

import homework6.Cat;

public class HungryCat {
    private String name;
    private int appetite;
    private int satiety;
    //private int hunger;

    protected HungryCat (String name, int appetite, int satiety /*, int hunger */) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
        //this.hunger = hunger;
    }

    public void eat(Plate p){
        p.decreaseFood(appetite);
    }

    public void encreaseSatiety(){
        if (appetite > 0 && appetite > satiety) {
            satiety += appetite;
        }else
            System.out.println("is nothing to eat");
    }

    //public void increaseSatiety(int satiety){
    //    boolean isSatiety =
    //    System.out.println("Satiety Barsic is  " + increaseSatiety());
    //}

    @Override
    public String toString() {
        return "HungryCat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }
}
