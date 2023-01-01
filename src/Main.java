import java.util.Scanner;
import Investasi.Properti;
import Investasi.Saham;

public class Main {
    public static void main(String[] args) {
        Pencatat a = new Pencatat();
        Properti bpro = new Properti();
        Saham csah = new Saham();
        int pilih;
        int jumpro = 0;
        Scanner input = new Scanner(System.in);
        try {
            do {
                System.out.println("========================================");
                System.out.println("1. Tambah pemasukan");
                System.out.println("2. Tambah pengeluaran");
                System.out.println("3. Tambah properti");
                System.out.println("4. Lihat daftar properti");
                System.out.println("5. Tambah saham");
                System.out.println("6. Lihat daftar saham");
                System.out.println("7. Lihat laporan");
                System.out.println("8. Cetak Laporan");
                System.out.println("9. Keluar");
                System.out.print("Pilihan: ");
                pilih=input.nextInt();

                switch (pilih){
                    case 1:
                        System.out.println("----------------------------------------");
                        a.pemasukan();
                        System.out.println("Berhasil Input");
                        System.out.println("----------------------------------------");
                        System.out.println("========================================");
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("----------------------------------------");
                        a.pengeluaran();
                        System.out.println("Berhasil Input");
                        System.out.println("----------------------------------------");
                        System.out.println("========================================");
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("----------------------------------------");
                        System.out.print("Masukkan jumlah properti : ");
                        jumpro = input.nextInt();
                        bpro.pro(jumpro);
                        System.out.println("Berhasil Input");
                        System.out.println("----------------------------------------");
                        System.out.println("========================================");
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("----------------------------------------");
                        bpro.tampilpro();
                        System.out.println("----------------------------------------");
                        System.out.println("========================================");
                        System.out.println();
                        break;
                    case 5:
                        System.out.println("----------------------------------------");
                        System.out.print("Masukkan jumlah saham : ");
                        jumpro = input.nextInt();
                        csah.sah(jumpro);
                        System.out.println("Berhasil Input");
                        System.out.println("----------------------------------------");
                        System.out.println("========================================");
                        System.out.println();
                        break;
                    case 6:
                        System.out.println("----------------------------------------");
                        csah.tampilsah();
                        System.out.println("----------------------------------------");
                        System.out.println("========================================");
                        System.out.println();
                        break;
                    case 7:
                        System.out.println("----------------------------------------");
                        a.saldo();
                        System.out.println("----------------------------------------");
                        System.out.println("========================================");
                        System.out.println();
                        break;
                    case 8:
                        System.out.println("----------------------------------------");
                        a.cetaklaporan();
                        System.out.println("----------------------------------------");
                        System.out.println("========================================");
                        System.out.println();
                        break;
                    case 9:
                        System.out.println("Sampai Berjumpa Lagi...");
                        break;
                    default:
                        System.out.println("Tidak Ada Plihan");
                }
            }while (pilih!=9);
        }catch (Exception e){
            System.out.println("Inputan Salah ");
        }
        
    }
}