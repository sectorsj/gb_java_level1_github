package leve1.homework5;

public class TestEmploee {

    public static void main(String[] args) {
        Employee[] employeesArray = {
                new Employee("Ivanov Ivan", "engineer", "Ivanov2322@mail.ru", "8900-000-00-00", 30500, 30),
                new Employee("Petrov Petr", "manager", "Petrov54@mail.ru", "8900-000-00-11", 42000, 41),
                new Employee("Fedorov Fedor", "programmer", "Fedor22FF@mail.ru", "8900-000-00-22", 21500, 43),
                new Employee("Semenov Semen", "hr-manager", "SemenovSenia2@mail.ru", "8900-000-00-33", 28000, 34),
                new Employee("Kirillov Kiril", "engineer", "Kir666kiler@mail.ru", "8900-000-00-44", 25500, 28),
        };

        System.out.println("Задание № 1");
        System.out.println("");

        for (int i = 0; i < employeesArray.length; i++) {
            if(employeesArray[i].getAge() > 40) {
                System.out.println(employeesArray[i]);
            }
        }
    }
}

