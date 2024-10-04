import java.util.Scanner;

public class Pemilihan2Percobaan2Absen19 {
    public static void main(String[] args) {
        Scanner absen19 = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("---------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        int pilihanMenu = absen19.nextInt();
        absen19.nextLine();
        System.out.println("Masukkan jumlah beli = ");
        int jumlahBeli = absen19.nextInt();
        
        System.out.print("Apakah punya member (y/n) = ");
        String member = absen19.next();
        System.out.println("---------------------------------------");

        double harga = 0;
        
        if (member.equalsIgnoreCase("y")) {
            double diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            
            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga Paket Bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            double totalBayar = harga - (harga * diskon);
            double bayar = totalBayar * jumlahBeli;
            System.out.println("Total bayar setelah diskon = " + bayar);

        } else if (member.equalsIgnoreCase("n")) {
            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga Rice Bowl = " + harga);
            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihanMenu == 3) {
                harga = 20000;
                System.out.println("Harga Bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            double totalBayar = harga * jumlahBeli;
            System.out.println("Total bayar = " + totalBayar);

        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("----------------------------------------------");
        
    }
}