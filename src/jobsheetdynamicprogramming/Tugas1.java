/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheetdynamicprogramming;

import java.util.Scanner;

/**
 *
 * @author Tarishaulia
 */
public class Tugas1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan uang : ");
        int uang = scanner.nextInt();
        int pecahan[] = new int[]{5000,2000,1000,500,200,100};
        int jumlah;
        
        for (int i = 0;i < pecahan.length; i++){
            if(uang >= pecahan[i]){
                jumlah = uang / pecahan[i];
                uang = uang%pecahan[i];
                System.out.println("Pecahan " + pecahan[i]+" sebanyak "+jumlah+" keping");
            }
        
        }
    }
}
