/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class PBOIF210119056Latihan46TandanyaKamu {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Age age=new Age(2000);
                age.setRed("\u001b[31m");
        System.out.print("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(input.nextInt());
        System.out.print("=====Hasil Perhitungan Umur=====");
        System.out.println();
        age.setYearNow(2020);
        System.out.println("Tahun lahir anda : "+age.getYearBirth());
        System.out.println("Hari ini tahun : "+age.getYearNow());
        
        System.out.println();
        System.out.println("Umur kamu sampai hari ini adalah "+age.hitungUmur()+" tahun");
        System.out.println("Tandanya kamu "+age.getRed()+age.tandanyaKamu(age.hitungUmur()));
    }
    
}
