package app;

import company.Employee;

public class App {
    public static void main(String[] args){
        Employee emp = new Employee(100,"id01", "james", 200000);
        //emp.salary = 2000000000;
        long sal = emp.getSalary();
        long annSal = emp.getAnnSalary();

        System.out.println(emp);
    }
}
