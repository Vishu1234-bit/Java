// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Employee{
    private int id;
    private String name;
    private double salary;
    public Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return name+" "+salary;
    }
}
class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1,"Vishali",89000),
            new Employee(2,"Sudhan",500000),
            new Employee(3,"Aishu",8000));
        List<Employee> employeelist = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
        System.out.println(employeelist);
    }
}
