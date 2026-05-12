
package oop_tel_ptit;

import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HocLapTrinh {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 3);
        map.put(3, 2);
        map.put(4, 1);
        map.put(4, 2);
        System.out.println(map.size());
        System.out.println(map.get(4));
        System.out.println(map.containsKey(3));
        //Entry<Integer, Integer>
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
