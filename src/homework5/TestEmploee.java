package homework5;

import java.util.Arrays;

public class TestEmploee {

    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Ivanov Ivan", "engineer", "Ivanov2322@mail.ru", "8900-000-00-00", 30500, 30);
        employeesArray[1] = new Employee("Petrov Petr", "manager", "Petrov54@mail.ru", "8900-000-00-11", 42000, 40);
        employeesArray[2] = new Employee("Fedorov Fedor", "programmer", "Fedor22FF@mail.ru", "8900-000-00-22", 21500, 43);
        employeesArray[3] = new Employee("Semenov Semen", "hr-manager", "SemenovSenia2@mail.ru", "8900-000-00-33", 28000, 34);
        employeesArray[4] = new Employee("Kirillov Kiril", "engineer", "Kir666kiler@mail.ru", "8900-000-00-44", 25500, 28);

        for (int i = 0; i < employeesArray.length; i++) {
                System.out.println(employeesArray[i]);
        }
    }
}

