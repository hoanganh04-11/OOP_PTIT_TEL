
package oop_tel_ptit;

import java.util.*;

class Employee {
    private String name;
    private double salary;
    
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getSalary(){
        return this.salary;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public String toString(){
        return "Họ tên: " + name + "\n" +
                "Lương cơ bản: " + String.format("%.1f", salary);
    }
    
    public double calculateSalary(){
        return this.getSalary();
    }
}

class FullTimeEmployee extends Employee{
    private double bonus;
    
    public FullTimeEmployee(String name, double salary, double bonus){
        super(name, salary);
        this.bonus = bonus;
    }
    
    @Override
    public double calculateSalary(){
        return super.calculateSalary() + bonus;
    }
    
    @Override
    public String toString(){
        return "Loại: FullTime\n" 
                + super.toString() + "\n" +
                "Thưởng: " + String.format("%.1f\n", bonus) +
                "=> Lương thực nhận: " + String.format("%.1f\n", calculateSalary());
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    
    public PartTimeEmployee(String name, double salary, int hoursWorked, double hourlyRate){
        super(name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    
    @Override
    public double calculateSalary(){
        return hoursWorked * hourlyRate;
    }
    
    @Override
    public String toString(){
        String s1 = "Loại: PartTime\n";
        String s2 = "Họ tên: " + getName();
        String s3 = String.format("\nSố giờ làm việc: %d giờ\n", hoursWorked);
        String s4 = String.format("Tiền công mỗi giờ: %.1f\n", hourlyRate);
        String s5 = String.format("=> Lương thực nhận: %.1f\n", calculateSalary());
        return s1 + s2 + s3 + s4 + s5;
    }
}

public class INHERITANCE012 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Thông tin nhân viên ---");
        while(sc.hasNextLine()){
            String type = sc.nextLine().trim();
            if(type.equals("FullTime")){
                String name = sc.nextLine();
                double salary = Double.parseDouble(sc.nextLine());
                double bonus = Double.parseDouble(sc.nextLine());
                Employee e1 = new FullTimeEmployee(name, salary, bonus);
                System.out.println(e1);
            }
            else{
                String name = sc.nextLine();
                int hoursWorked = Integer.parseInt(sc.nextLine());
                double hourlyRate = Double.parseDouble(sc.nextLine());
                Employee e2 = new PartTimeEmployee(name, 0, hoursWorked, hourlyRate);
                System.out.println(e2);
            }
        }
    }
}
