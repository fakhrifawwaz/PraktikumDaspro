import java.util.Scanner;

public class ifCetakKRS15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        System.out.println(uktLunas?
            "Pembayaran UKT terverifikasi\nSilahkan cetak KRS dan meminta tanda tangan DPA" 
            : "Registrasi ditolak, Silahkan lunasi UKT terlebih dahulu");

        sc.close(); 
        
    }
}