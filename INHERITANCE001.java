
package oop_tel_ptit;

class A {
    public int x = 0x01a;
    public void display(){
        System.out.println(x);
    }
}

class B extends A{
    public int x = 0x01b;
}

public class INHERITANCE001 {
    public static void main(String[] args){
        A b = new B();
        b.display();
    }
}
