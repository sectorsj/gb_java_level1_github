package homework7;


import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        HungryCat[]cats = {
                new HungryCat("Мурка", 2,0),
                new HungryCat("Васька", 5, 0),
                new HungryCat("Барсик", 4, 0),
                new HungryCat("Рыжий", 8, 0),
                new HungryCat("Серый", 10, 0),
        };

        Plate plate = new Plate();

        while (true){
            plate.setFood();
            for (int i = 0; i < cats.length; i++) {
                System.out.println("" + cats[i]);
                plate.info();
                cats[i].eat(plate);
                plate.info();
                cats[i].encreaseSatiety();
                System.out.println("" + cats[i]+ "\n");
            }
        }


    }
}
