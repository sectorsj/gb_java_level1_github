package homeworks.level1.homework7;

public class HungryCat {
    private String name;
    private int appetite;
    private int satiety;


    protected HungryCat (String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate p){
        boolean isSatiety = p.decreaseFood(appetite);
        System.out.println(isSatiety);
    }

    public void encreaseSatiety(){
        // boolean isSatiety;
        if(appetite > satiety){
            satiety += appetite;
        }else
            System.out.println("is nothing to eat");
    }

    @Override
    public String toString() {
        return "HungryCat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }
}

