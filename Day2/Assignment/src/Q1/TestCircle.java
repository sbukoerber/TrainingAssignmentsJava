package Q1;

class Employee{
    private int id, salary;
    private String name,firstName, lastName;

    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public int getSalary(){
        return salary;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    //Method to join first and last name
    public String getName(){
        return firstName + " " + lastName;
    }
    //Method to get annual salary
    public int getAnnualSalary(){
        return salary * 12;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    //Method to raise salary by percentage
    public void raiseSalary(int percentage){
        salary += this.salary * (100+percentage) / 100;
    }
    @Override
    public String toString(){
        return  "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }
}

public class TestCircle {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Sumukha", "Udupa", 50000);
        System.out.println(employee);
        employee.raiseSalary(15);
        System.out.println(employee);
    }

}
