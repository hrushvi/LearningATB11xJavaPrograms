package ex_Abstraction.AbstractClass;

public abstract class Employee
{
    private int id;
    private String Name;
    Employee(int id, String Name){
        this.id=id;
        this.Name=Name;
    }

    void displayDetails(){
        System.out.println("Employee ID is:  "+id);
        System.out.println("Employee Name is  "+Name);
    }

    abstract double calculateSalary();
}
