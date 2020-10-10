package homework6;

public class MainClass {
    public static void main(String[] args) {
        //Animal animal = new Animal("Alpha", 400, 10, 0.3);
        //System.out.println(animal + " "
        //        + animal.run(450) + ", "
        //        + animal.swim(10) + ", "
        //        + animal.jump(0.2));

        //Cat testCat = new Cat("Тестовый Котик", 200, 0, 2.0);
        //System.out.println(testCat + " "
        //        + testCat.run(230) + ", "
        //        + animal.swim(1) + ", "
        //        + animal.jump(2.2));

        Animal[] animals = {
                new Cat("Мурка", 200, 0, 2.1),
                new Cat("Васька", 350, 11, 2.5),
                new Dog("Бобик", 200, 20, 0.2),
                new Dog("Шарик", 330, 10, 0.5),
                new Dog("Тузик", 460, 17, 1.0),
        };

        for (int i = 0; i < animals.length; i++) {
            System.out.println("" + animals[i]);
            animals[i].run(300);
            animals[i].swim(10);
            animals[i].jump(0.6);
        }
    }
}
