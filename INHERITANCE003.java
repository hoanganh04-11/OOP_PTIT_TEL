
package oop_tel_ptit;

class Person {
    private String name, address;
    
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public String toString(){
        return name + " - " + address;
    }
}

class Student extends Person {
    private int credits;
    private int studentId;
    
    public Student(String name, String address){
        super(name, address);
    }
    
    public void study(){
        this.credits++;
    }
    
    public int credits(){
        return this.credits;
    }
}

public class INHERITANCE003 {
    public static void main(String[] args){
        Student s = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(s);
        System.out.println("Study credits " + s.credits());
        s.study();
        System.out.println("Study credits " + s.credits());
    }
}
