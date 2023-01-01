package Investasi;

import java.util.Scanner;

public class Saham {
    String[] namasah = new String[100];
    int[] hargasah = new int[100];
    int[] jumlahsah = new int[100];
    Scanner input1 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    Scanner input3 = new Scanner(System.in);
    int ngulang=0;

    public void sah(int jumlah){
        for (int i=0;i<jumlah;i++){
            System.out.print("Nama Saham "+(i+1)+" : ");
            String a = input1.nextLine();
            namasah[ngulang] = a;
            System.out.print("Harga Saham "+(i+1)+" : ");
            int b = input2.nextInt();
            hargasah[ngulang] = b;
            System.out.print("Jumlah Saham(Lot) "+(i+1)+" : ");
            jumlahsah[ngulang]  = input3.nextInt();
            ngulang++;
        }
    }
    public void tampilsah(){
        for(int i=0;i<ngulang;i++){
            System.out.println("Nama Properti "+(i+1)+" : "+namasah[i]);
            System.out.println("Harga Properti "+(i+1)+" : "+hargasah[i]);
            System.out.println("Lokasi Properti "+(i+1)+" : "+jumlahsah[i]);
        }

    }
}
