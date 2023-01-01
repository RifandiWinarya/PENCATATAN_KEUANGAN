import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pencatat extends Rencana{
    float pemasukan = 0;
    float pengeluaran = 0;
    float saldo = 0;
    Scanner input = new Scanner(System.in);

    @Override
    void pemasukan() {
        System.out.print("Masukkan jumlah pemasukan: ");
        float x = input.nextFloat();
        pemasukan += x;
        saldo += x;
    }

    @Override
    void pengeluaran() {
        System.out.print("Masukkan jumlah pengeluaran: ");
        float y = input.nextFloat();
        pengeluaran += y;
        saldo -= y;
    }

    @Override
    void saldo() {
        System.out.println("Total pemasukan: " + pemasukan);
        System.out.println("Total pengeluaran: " + pengeluaran);
        System.out.println("Saldo: " + saldo);
    }

    @Override
    void cetaklaporan() {
        java.io.File file = new java.io.File("laporan.txt");
        java.io.PrintWriter output = null;
        try {
            output = new java.io.PrintWriter(file);
            output.println("Total pemasukan: " + pemasukan);
            output.println("Total pengeluaran: " + pengeluaran);
            output.println("Saldo: " + saldo);
            output.close();
            System.out.println("Berhasil Cetak Laporan");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
