package homework6;

public class MainClass {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Мурка", 200, 0, 2.1),
                new Cat("Васька", 350, 11, 2.5),
                new Dog("Бобик", 200, 20, 0.2),
                new Dog("Шарик", 330, 10, 0.5),
                new Dog("Тузик", 460, 17, 1.0),
        };

        for (Animal animal : animals) {
            System.out.println("\n" + animal);
            animal.run(300);
            animal.swim(10);
            animal.jump(0.6);

        }
    }
}
