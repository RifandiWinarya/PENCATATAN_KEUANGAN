package Investasi;

import java.util.Scanner;

public class Properti {
    String[] namapro = new String[100];
    int[] hargapro = new int[100];
    String[] lokasi = new String[100];
    Scanner input1 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    Scanner input3 = new Scanner(System.in);
    int ngulang=0;

    public void pro(int jumlah){
        for (int i=0;i<jumlah;i++){
            System.out.print("Nama Properti "+(i+1)+" : ");
            String a = input1.nextLine();
            namapro[ngulang] = a;
            System.out.print("Harga Properti "+(i+1)+" : ");
            int b = input2.nextInt();
            hargapro[ngulang] = b;
            System.out.print("Lokasi Properti "+(i+1)+" : ");
            lokasi[ngulang]  = input3.nextLine();
            ngulang++;
        }
    }
    public void tampilpro(){
        for(int i=0;i<ngulang;i++){
            System.out.println("Nama Properti "+(i+1)+" : "+namapro[i]);
            System.out.println("Harga Properti "+(i+1)+" : "+hargapro[i]);
            System.out.println("Lokasi Properti "+(i+1)+" : "+lokasi[i]);
        }

    }

}
