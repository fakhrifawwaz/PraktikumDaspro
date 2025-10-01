import java.util.Scanner;

public class aksesWiFiTugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== Sistem akses WIFI kampus ===");
        System.out.print("Masukkan tipe pengguna (dosen/mahasiswa/lain): ");
        String pengguna = sc.next().toLowerCase();

        if (pengguna.equals("dosen")) {
            System.out.println("Hasil: Akses WiFi diberikan (dosen).");
        }else if (pengguna.equals("mahasiswa")) {
            System.out.println("Masukkan jumlah SKS terdaftar: ");
            int sks = sc.nextInt();
            
            if (sks >= 12) {
                System.out.println("Hasil: Akses wifi diberikan (mahasiswa aktif).");
            } else {
                System.out.println("Hasil: Akses ditolak - SKS kurang dari 12.");
            }
        } else {
            System.out.println("Hasil: Akses ditolak (tipe pengguna tidak dikenal).");
        }
        sc.close();
    }    
}
