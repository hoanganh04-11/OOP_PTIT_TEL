
package oop_tel;

import java.util.Scanner;


class Musician {
        private String name, nationality, style;
        
        public Musician(String name, String nationality, String style){
            this.name = name;
            this.nationality = nationality;
            this.style = style;
        }
        
        public String toString(){
            return "Musician[name=" + name + ", nationality=" +
                    nationality + ", style=" + style + "]";
        }
    }
    
class Song {
    private String title, genre;
    private int year;
    private Musician musician;
        
    public Song(String title, String genre, int year, Musician musician){
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.musician = musician;
    }
        
    public String toString(){
        return "Song[title=" + title + ", genre=" +
                genre + ", year=" + year + ", " + musician.toString() +
                "]";
        }
    }

public class OOP003 {
     
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String name = sc.nextLine();
            String nationality = sc.nextLine();
            String style = sc.nextLine();
            String title = sc.nextLine();
            String genre = sc.nextLine();
            int year = Integer.parseInt(sc.nextLine());
            if(nationality.equals("VN") || nationality.equals("INT")){
                Musician m = new Musician(name, nationality, style);
                Song s = new Song(title, genre, year, m);
                System.out.println(s);
            }
            else{
                System.out.println("Invalid nationality. Only 'VN' or 'INT' allowed.");
                return ;
            }
        }
    }
}
