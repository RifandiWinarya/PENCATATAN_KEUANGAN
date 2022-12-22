import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pencatat a = new Pencatat();
        int pilih;
        Scanner input = new Scanner(System.in);
        try {
            do {
                System.out.println("========================================");
                System.out.println("1. Tambah pemasukan");
                System.out.println("2. Tambah pengeluaran");
                System.out.println("3. Lihat saldo");
                System.out.println("4. Cetak Laporan");
                System.out.println("5. Keluar");
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
                        a.saldo();
                        System.out.println("----------------------------------------");
                        System.out.println("========================================");
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("----------------------------------------");
                        a.cetaklaporan();
                        System.out.println("----------------------------------------");
                        System.out.println("========================================");
                        System.out.println();
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Tidak Ada Plihan");
                }
            }while (pilih!=5);
        }catch (Exception e){
            System.out.println("Inputan Salah ");
        }

    }
}