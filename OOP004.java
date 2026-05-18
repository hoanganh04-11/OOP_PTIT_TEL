
package oop_tel_ptit;

import java.util.Scanner;

/**
 *
 * @author Hoang Anh
 */
class Point {
    private int x;
    private int y;
    
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public void move(int dx, int dy){
        this.x = x + dx;
        this.y = y + dy;
    }
    
    public double distanceTo(Point p){
        int x1 = this.x;
        int y1 = this.y;
        int x2 = p.x;
        int y2 = p.y;
        return Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
    }
}


public class OOP004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            Point a = new Point(x1, y1);
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            Point b = new Point(x2, y2);
            a.move(1, 1);
            System.out.printf("%.2f\n", a.distanceTo(b));
        }
    }
}
