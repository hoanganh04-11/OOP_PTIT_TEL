/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_tel_ptit;

/**
 *
 * @author Hoang Anh
 */
import java.util.*;


import java.util.*;

class Note {
    private int id;
    private String content;
    private String date;
    
    public Note(int id, String content, String date){
        this.id = id;
        this.content = content;
        this.date = date;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getContent(){
        return this.content;
    }
    
    public String getDate(){
        return this.date;
    }
    
    // Jan0123
    public String getFormatDate(){
        String month = date.substring(0, 3);
        String day = date.substring(3, 5);
        String year = date.substring(5, 7);
        return day + " " + month + " " + year;
    }
    
    @Override
    public String toString(){
        return getFormatDate() + " | " + content;
    }
    
    
}

class Account {
    private String id;
    private String accountName;
    private ArrayList<Note> notes = new ArrayList<>();
    private int noteCount = 1;
    
    public Account(String id, String accountName){
        this.id = id;
        this.accountName = accountName;
    }
    
    public String getId(){
        return this.id;
    }
    
    public void addNote(String content, String date){
        notes.add(new Note(noteCount++, content, date));
    }
    
    public void shareNote(Account target, int noteId){
        for(Note note : this.notes){
            if(note.getId() == noteId){
                Note copy = new Note(target.noteCount++, note.getContent(), note.getDate());
                target.notes.add(copy);
                return;
            }
        }
    }
    
    public void print(){
        System.out.println("Account: " + this.accountName);
        for(Note note : notes){
            System.out.println(note);
        }
    }
}



public class OOP005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        
        ArrayList<Account> accounts = new ArrayList<>();
        
        for(int i=0; i<n; i++){
           String name = sc.nextLine().trim(); 
           String id = String.format("%03d", i+1);
           accounts.add(new Account(id, name));
        }
        
        while(sc.hasNextLine()){
            String line = sc.nextLine().trim();
            if(line.equals("")) continue;
            
            String[] part = line.split(" ", 3);
            
            if(part.length < 3){
                System.out.println("invalid input");
                continue;
            }
            
            String accountId = part[0];
            String action = part[1];
            String content = part[2];
            
            Account actor = null;
            for(Account a : accounts) {
                if(a.getId().equals(accountId)){
                    actor = a;
                    break;
                }
            }
            
            if(actor == null){
                System.out.println("invalid  input");
                continue;
            }
            
            if(action.equals("Add")){
                String[] addParts = content.split(" ", 2);
                if(addParts.length < 2){
                    System.out.println("invalid  input");
                    continue;
                }
                String date = addParts[0];
                String noteContent = addParts[1];
                actor.addNote(noteContent, date);
            }
            else if(action.equals("Share")){
                //content = "002 1"
                String[] shareParts = content.split(" ");
                if(shareParts.length < 2){
                    System.out.println("invalid input");
                    continue;
                }
                String targetId = shareParts[0];
                int noteId = Integer.parseInt(shareParts[1]);
                
                Account target = null;
                for(Account a : accounts){
                    if(a.getId().equals(targetId)){
                        target = a;
                        break;
                    }
                }
                if(target == null){
                    System.out.println("invalid input");
                    continue;
                }
                
                actor.shareNote(target, noteId);
            }
            else{
                System.out.println("invalid input");
            }
        }
        for(Account a : accounts){
            a.print();
        }          
        sc.close();
    }
}

