import java.util.Scanner;

public class PerpustakaanTugas3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== Sistem perpustakaan ===");
        System.out.print("Bawa kartu mahasiswa? (ya/tidak): ");
        String bawaKartu = sc.next().toLowerCase();
            
        System.out.print("Sudah registrasi perpustakaan? (ya/tidak): ");
        String sudahReg = sc.next().toLowerCase();

        boolean kartu = bawaKartu.equals("ya");
        boolean registrasi = sudahReg.equals("ya");

        if (kartu || registrasi) {
            System.out.println("Hasil: Boleh masuk perpustakaan. ");
        } else {
            System.out.println("Hasil: Ditolak perpustakaan. ");
        }
        sc.close();
    }
}