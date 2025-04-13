package ex_Abstraction.AbstractClass;

public class PartTimeSalary extends Employee{
    int hourWorked;
    int ratePerHour;
    PartTimeSalary(int id,String Name,int hoursWorked, int ratePerHour){
        super(id,Name);
        this.hourWorked=hoursWorked;
        this.ratePerHour=ratePerHour;

    }

    @Override
     double calculateSalary() {
        return hourWorked*ratePerHour;
    }
}
