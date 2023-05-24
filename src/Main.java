
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
       
        Scanner scan = new Scanner(System.in);

        Laporan laporan = new Laporan();
        Barang barang = new Barang();
        Petugas petugas = new Petugas();
        Masyarakat masyarakat = new Masyarakat();

        laporan.laporan(petugas);
        laporan.laporan(masyarakat);
        laporan.laporan(barang);

        System.out.println();
        System.out.print("Masukkan ID Petugas : ");
        int idPetugas = scan.nextInt();
        System.out.println("Selamat Datang " + petugas.getNama(idPetugas));
        System.out.println(" ");

        Barang barang1 = new Barang();
        Lelang lelang = new Lelang();

        lelang.prosesLelang(masyarakat, lelang, barang);
        laporan.laporan(barang);
        laporan.laporan(masyarakat);
        laporan.laporan(masyarakat, lelang, barang);
    }
}
  

 

