/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_tel_ptit;
import java.util.*;
class Song {
    private String name, author;
    private int duration;
    
    public Song(String name, String author, int duration){
        this.name = name;
        this.author = author;
        this.duration = duration;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public int getDuration(){
        return duration;
    }
    

    public boolean equals(Song song){
       return name.equals(song.name) && author.equals(song.author) && duration==song.duration;
    }
    
    
}

public class OBJECT_REFERENCES002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            String[] arr1 = sc.nextLine().trim().split("\\s+");
            String[] arr2 = sc.nextLine().trim().split("\\s+");
            
            Song s1 = new Song(arr1[0], arr1[1], Integer.parseInt(arr1[2]));
            Song s2 = new Song(arr2[0], arr2[1], Integer.parseInt(arr2[2]));
            
            if(s1.equals(s2)){
                System.out.println("true");
            }else
                System.out.println("false");
        }
    }
}
