
package oop_tel;

import java.util.*;
import java.util.Scanner;

class Vector2D {
    private int dx, dy;
    
    public Vector2D(int dx, int dy){
        this.dx = dx;
        this.dy = dy;
    }
    
    public int getDx(){
        return this.dx;
    }
    
    public int getDy(){
        return this.dy;
    }
    
    public void translate(int tx, int ty){
        dx += tx;
        dy += ty;
    }
    
    public double magnitude(){
        double res = Math.sqrt(dx*dx + dy*dy);
        return res;
    }
    
    
}

public class OOP014 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            Vector2D a = new Vector2D(x, y);
            a.translate(-2, 3);
            System.out.printf("%.3f\n", a.magnitude());
        }
    }
}
