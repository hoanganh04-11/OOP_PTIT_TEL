
package oop_tel_ptit;


import java.util.*;

class TaiKhoan{
    private String id, name;
    private ArrayList<String> ghiChu;
    
    public TaiKhoan(int id, String name){
        this.id = String.format("%03d", id);
        this.name = name;
        this.ghiChu = new ArrayList<>();
    }
    
    public String getName(){
        return name;
    }
    
    public void themGhiChu(String s){
        this.ghiChu.add(s);
    }
    
    public void chiaSeGhiChu(TaiKhoan x, int id){
        x.ghiChu.add(this.ghiChu.get(id));
    }
    
    public int getSoLuongGhiChu(){
        return ghiChu.size();
    }
    
    public String toString(){
        String res = "Account: " + name + "\n";
        for(String gc : ghiChu){
            res += gc + "\n";
        }
        return res.trim();
    }
}


public class OOP005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<TaiKhoan> a = new ArrayList<>();
        
        for(int i=1; i<=n; i++){
            String name = sc.nextLine();
            a.add(new TaiKhoan(i, name));
        }
        
        int ok = 0;
        while(sc.hasNextLine()){
            String d = sc.nextLine().trim();
            if(d.isEmpty()) continue;
            String[] w = d.split("\\s+");
            
            if(w.length < 2){
                ok = 1;
                break;
            }
            String op = w[1];
            try{
                switch(op){
                    case "Add":
                        if(w.length < 3){
                            ok = 1;
                            break;
                        }
                        int userId = Integer.parseInt(w[0]);
                        if(userId < 1 || userId > a.size()){
                            ok = 1;
                            break;
                        }
                        String date = w[2];
                        if(date.length() != 7){
                            ok = 1;
                            break;
                        }
                        StringBuilder content = new StringBuilder();
                        content.append(date.substring(3, 5)).append(" ").append(date.substring(0, 3)).append(" ").append(date.substring(5, 7)).append(" | ");
                        for(int i=3; i<w.length; i++){
                            content.append(w[i]).append(" ");
                        }
                        a.get(userId - 1).themGhiChu(content.toString().trim());
                        break;
                        
                    case "Share":
                        if(w.length < 4){
                            ok = 1;
                            break;
                        }
                        int srcId = Integer.parseInt(w[0]);
                        int dstId = Integer.parseInt(w[2]);
                        int noteId = Integer.parseInt(w[3]);
                        if(srcId < 1 || srcId > a.size() || dstId < 1 || dstId > a.size()){
                            ok = 1;
                            break;
                        }
                        TaiKhoan src = a.get(srcId - 1);
                        TaiKhoan dst = a.get(dstId - 1);
                        if(noteId < 1 || noteId > src.getSoLuongGhiChu()){
                            ok = 1;
                            break;
                        }
                        src.chiaSeGhiChu(dst, noteId - 1);
                        break;
                    default:
                        ok = 1;
                        break;
                }   
            }
            catch(NumberFormatException | StringIndexOutOfBoundsException e){
                ok = 1;
                break;
            }
        }
        if(ok == 1) System.out.println("invalid input");
        else{
            for(TaiKhoan account : a){
                System.out.println(account);
            }
        }
        
        sc.close();
    }
}

