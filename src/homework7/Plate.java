package homework7;

import java.util.Scanner;

public class Plate {
    private int food;

    Scanner scanner = new Scanner(System.in);

    public Plate(){
        this.food = food;
    }
    public int getFood() {
        return food;
    }

    public void setFood() {
        this.food = food;
        System.out.println("Insert quantity of food: ");
        int num = scanner.nextInt();
    }

    public void decreaseFood(int gram){
        if(gram < food) {
            food -= gram;
            System.out.println("Hungry cat is eating from plate");
        } else
            System.out.println("Not enough food");
    }

    public void info() {
        System.out.println("plate: " + food);
    }

}
