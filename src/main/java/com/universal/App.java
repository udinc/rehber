package com.universal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {

static List<Kisi> kisilist = new ArrayList<Kisi>();

/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   
   while(true) {
       System.out.println("----------------------------");
       System.out.println("1. Rehbere Ekle");
       System.out.println("2. Rehberden Sil");
       System.out.println("3. Rehber Listesi");
       System.out.println("4. Rehber Arama");
       System.out.println("5. Cýkýþ");
       System.out.println("----------------------------");
       
       System.out.println("Hangi iþlemi yapmak istiyorsunuz ?\t");
       int secim = scanner.nextInt();
       
       if (secim == 1) {
           scanner.nextLine();
          System.out.print("Adý :");
          String l_ad = scanner.nextLine();
          System.out.print("Soyadý :");
          String l_soy = scanner.nextLine();
          System.out.print("Telefonu :");
          String l_tel = scanner.nextLine();
          
          Kisi l_kisi = new Kisi(l_ad,l_soy,l_tel);
         
           kisilist.add(l_kisi);
          
       } else if(secim==3){
           listele();
       }
       else if(secim==2){
             listele();
           scanner.nextLine();
          System.out.print("Silinicek kayýt secini :");
          int l_silinecekkayitno = scanner.nextInt();
          kisilist.remove(l_silinecekkayitno-1);
       }
       else if(secim==5){ 
           break;
       }
       
       
   }
   
 
}

private static void listele() {
	System.out.println("ID"+"\t\t"+"ADI"+"\t\t"+"SOYADI"+"\t\t"+"TELEFONU");
         for (Kisi l_kisi: kisilist){
	   System.out.println(l_kisi.getid() +"\t\t"+ l_kisi.getAd()+"\t\t"+l_kisi.getSoy()+"\t\t"+l_kisi.getTel());
         }
}


}
