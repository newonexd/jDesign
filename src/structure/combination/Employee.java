package structure.combination;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private int salary;
    private String dept;
    private List<Employee> employees;

    public Employee(String name,String dept,int salary){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }
    public boolean removeEmployee(Employee employee){
        return this.employees.remove(employee);
    }

    public List<Employee> getChildren(){
        return this.employees;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Employee:  "+"    ");
        sb.append("  Name: "+name+"  ");
        sb.append("  dept: "+dept+"  ");
        sb.append("  salary: "+salary+"  ").append("\n");
        this.employees.forEach(e->{
            sb.append("    "+e.toString());
        });
        return sb.toString();
    }
}