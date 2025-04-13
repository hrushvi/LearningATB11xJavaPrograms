package ex_Abstraction.AbstractClass;

public class FullTimeSalary extends Employee{
     private double fixedSalary;

    FullTimeSalary(int id, String Name, double fixedSalary) {
        super(id, Name);
        this.fixedSalary=fixedSalary;
    }

    @Override
    double calculateSalary() {
        return fixedSalary;
    }
}
