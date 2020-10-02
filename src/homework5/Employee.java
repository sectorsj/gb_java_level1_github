package homework5;

public class Employee {
    private final String fio;
    private final String position;
    private final String email;
    private final String phone;
    private final int salary;
    private final int age;

    public Employee(String fio, String position, String email, String phone, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Emploeyee{" +
                "fio:'" + fio + '\'' +
                ", position:'" + position + '\'' +
                ", email:'" + email + '\'' +
                ", phone:" + phone +
                ", salary:" + salary +
                ", age:" + age +
                '}';
    }

}


