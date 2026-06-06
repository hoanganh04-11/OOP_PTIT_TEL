
package oop_tel_ptit;

import java.util.*;

class Employee {
    public String name, department, email;
    public double salary;
    public int age;
    
    
    public Employee(String name, double salary, String department, String email, int age){
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.email = email;
        this.age = age;
    }
    
    
}


public class OOP018 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        
        List<Employee> employees = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            String line = sc.nextLine().trim();
            String[] arr = line.split("\\s+");
            
            String name = arr[0];
            double salary = Double.parseDouble(arr[1]);
            String department = arr[2];
            String email = "n/a";
            int age = -1;
            
            for(int j=3; j<arr.length; j++){
                if(arr[j].contains("@")){
                    email = arr[j];
                }
                else{
                    age = Integer.parseInt(arr[j]);
                }
            }
            
            employees.add(new Employee(name, salary, department, email, age));
        }
        
        Map<String, List<Employee>> m = new LinkedHashMap<>();
        for(Employee e : employees){
            m.putIfAbsent(e.department, new ArrayList<>());
            m.get(e.department).add(e);
        }
        
        String bestDept = "";
        double bestAvg = -1;
        
        for(Map.Entry<String, List<Employee>> entry : m.entrySet()){
            double sum = 0;
            for(Employee e : entry.getValue()){
                sum += e.salary;
            }
            double avg = sum / entry.getValue().size();
            if(avg > bestAvg){
                bestAvg = avg;
                bestDept = entry.getKey();
            }
        }
        
        System.out.print("Highest Average Salary: ");
        System.out.println(bestDept);
        
        for(Employee e : m.get(bestDept)){
            System.out.printf("%s %.2f %s %d\n", e.name, e.salary, e.email, e.age);
        }
    }
}
