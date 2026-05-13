/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_tel_ptit;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Hoang Anh
 */
public class TimKiemComparator {
    
    public static int firstPos(int a[], int l, int r, int x){
        int res = -1;
        while(l <= r){
            int m = (l + r)/2;
            if(a[m] > x){
                res = m;
                r = m - 1;
            }
            else
                l = m + 1;
        }
        return res;
    }
    
    public static int lastPos(int a[], int l, int r, int x){
        int res = -1;
        while(l <= r){
            int m = (l + r)/2;
            if(a[m] < x){
                res = m;
                l = m + 1;
            }
            else
                r = m - 1;
        }
        return res;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        for(int x : a){
            int p = firstPos(b, 0, m-1, x);
            if(p == -1){
                System.out.println(0 + " ");
            }
            else
                System.out.println(m - m + " ");
        }
    }
}
