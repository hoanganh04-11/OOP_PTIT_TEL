package oop_tel_ptit;

import java.util.*;

import java.util.*;

class Teacher {
    private String name;
    private double baseSalary;
    
    public Teacher(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getBaseSalary(){
   		return this.baseSalary;
    }
    
    public double calculateSalary(){
        return baseSalary;
    }
    
   
}

class PermanentLecturer extends Teacher {
    private double researchAllowance;
    
    public PermanentLecturer(String name, double baseSalary, double researchAllowance){
        super(name, baseSalary);
        this.researchAllowance = researchAllowance;     
    }
    
    @Override
    public double calculateSalary(){
        return super.getBaseSalary() + researchAllowance;
    }
    
    @Override
    public String toString(){
        return String.format("Loại giảng viên: Permanent\nHọ tên: %s\nLương thực nhận: %.1f\n", super.getName(), calculateSalary());
    }
}


class VisitingLecturer extends Teacher {
    private double paymentPerHour;
    private int teachingHours;
    
    public VisitingLecturer(String name, double baseSalary, int teachingHours, double paymentPerHour){
        super(name, 0);
        this.teachingHours = teachingHours;
        this.paymentPerHour = paymentPerHour;
    }
    
    @Override
    public double calculateSalary(){
        return paymentPerHour * teachingHours;
    }
    
    @Override
    public String toString(){
        return String.format("Loại giảng viên: Visiting\nHọ tên: %s\nLương thực nhận: %.1f\n", super.getName(), calculateSalary());
    }
}

public class INHERITANCE013 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Thông tin giảng viên ---");
        for(int i=0; i<2; i++){
            String type = sc.nextLine();
            switch (type){
                   case "PermanentLecturer":
                    Teacher a = new PermanentLecturer(sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
                    System.out.print(a);
                	break;
                	case "VisitingLecturer":
                    Teacher b = new VisitingLecturer(sc.nextLine(), 0, Integer.parseInt(sc.nextLine()), Double.parseDouble(sc.nextLine()));
                    System.out.print(b);
                	break;
            }
            
        }
    }
}



