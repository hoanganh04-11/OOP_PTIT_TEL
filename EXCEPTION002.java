/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_tel_ptit;

import java.util.*;

class NotJavaException extends Exception {
    public NotJavaException(String message){
        super(message);
    }
}

public class EXCEPTION002 {
    
    public static int checkFileExtension(String filename) throws NotJavaException{
        if(filename == null || filename.isEmpty()) throw new NotJavaException("Not java file exception.Mark is -1");
        if(filename.endsWith(".java")) return 1;
        else return 0;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            try{
                String s = sc.nextLine();
                System.out.println(checkFileExtension(s));
                
            }
            catch(NotJavaException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

