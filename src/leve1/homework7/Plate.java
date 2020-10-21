package leve1.homework7;

import java.util.Scanner;

public class Plate {
    private int food;
    public static final Scanner scanner = new Scanner(System.in);

    public void setFood() {
        this.food = food;
        System.out.print("enter the amount of food: ");
        if (food >= 0){
            food = Plate.scanner.nextInt();
        }
    }

    public int getFood() {
        return food;
    }

    public boolean decreaseFood(int gram){
        if(gram <= food) {
            food -= gram;
            System.out.println("Hungry cat is eating from plate");
        }
        return false;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

}
