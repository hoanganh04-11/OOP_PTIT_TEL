/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_tel_ptit;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

/**
 *
 * @author Hoang Anh
 */

class Student {
    private String msv, hoTen, nSinh, lop;
    private double gpa;
    
    public Student(String msv, String hoTen, String nSinh, String lop, double gpa){
        this.msv = msv;
        this.hoTen = hoTen;
        this.nSinh = nSinh;
        this.lop = lop;
        this.gpa = gpa;
    }
    
    public void setMsv(String msv){
        this.msv = msv;
    }
    
    public String getMsv(){
        return this.msv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getnSinh() {
        return nSinh;
    }

    public String getLop() {
        return lop;
    }

    public double getGpa() {
        return gpa;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setnSinh(String nSinh) {
        this.nSinh = nSinh;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    public void chuanHoaTen(){
        String[] a = hoTen.toLowerCase().trim().split("\\s+");
        String res ="";
        for(String x : a){
            res += Character.toUpperCase(x.charAt(0));
            for(int i=1; i<x.length(); i++){
                res += x.charAt(i);
            }
            res += " ";
        }
        hoTen = res.trim();
    }
    
    public void chuanHoaNgaySinh(){
        String[] a = nSinh.split("/");
        nSinh = String.format("%02d/%02d/%04d", Integer.parseInt(a[0]), Integer.parseInt(a[1]), Integer.parseInt(a[2]));
    }

    public String toString() {
        return msv + " " + hoTen + " " + nSinh + " " + lop + " " + gpa;
    }
    
    
}

public class SapXepSinhVienTheoGpa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            Student s = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            s.chuanHoaTen();
            s.chuanHoaNgaySinh();
            list.add(s);
        }
        Collections.sort(list, new Comparator<Student>(){
           public int compare(Student x, Student y){
               if(x.getGpa() != y.getGpa()){
                   return Double.compare(y.getGpa(), x.getGpa());
               }
               return x.getMsv().compareTo(y.getMsv());
           } 
        });
        
        for(Student x : list){
            System.out.println(x);
        }
    }
}
