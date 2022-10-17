/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adrian
 */
import java.util.Scanner;
public class twodfigure 
{
    
    public static void main(String [] args) {
        int bangundatar,sisi,alas,panjang,lebar,tinggi;
        double luas = 0;
        Scanner input = new Scanner(System.in);
        //option
        System.out.println("Program Menghitung Luas Bangun Datar (dalam cm) ");
        System.out.println("");
        System.out.println("1.Persegi");
        System.out.println("2.Persegi Panjang");
        System.out.println("3.Segitiga");
        System.out.println("");
        System.out.print("Silahkan pilih bangun datar yang ingin dicari luasnya : ");
        bangundatar = input.nextInt();
        //if - else
        if (bangundatar == 1) {
            System.out.print("Masukkan sisinya : ");
            
            sisi = input.nextInt();
            
            luas = sisi * sisi;
           
        } else {
            if (bangundatar == 2) {
                System.out.print("Masukkan panjangnya : ");

                panjang = input.nextInt();
                System.out.print("Masukkan lebarnya : ");
                lebar = input.nextInt();
                
                luas = panjang * lebar;
                
            } else {
                
                if (bangundatar == 3) {
                    System.out.print("Masukkan panjang alasnya : "); 
                    alas = input.nextInt();
                    System.out.print("Masukkan tingginya : ");
                    tinggi = input.nextInt();
                    luas = 0.5 * alas * tinggi;
                }  else {
                            System.out.print("Error");
                            System.out.println(" ");
                        }
                    }
                } 
                            System.out.println("Luas bangunan tersebut adalah " + luas + " cm²");
            }
        }                   
