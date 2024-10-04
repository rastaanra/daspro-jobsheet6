import java.util.Scanner;
public class Latihan2Absen19 {

    public static void main(String[] args) {
        Scanner absen19 = new Scanner (System.in);

        System.out.println("--------------------------------------------");
        System.out.println("===Daftar Buku===");
        System.out.println("1.Novel");
        System.out.println("2.Kamus");
        System.out.println("3.Selain Kamus dan Novel");
        System.out.println("--------------------------------------------");
        System.out.println("Masukkan angka dari daftar buku yang dipilih");
        int pilihanBuku = absen19.nextInt();
        absen19.nextLine();
        System.out.println("Masukkan jumlah buku yang dibeli ");
        int jumlahBuku = absen19.nextInt();
        System.out.println("Apakah Hari Rabu (y/n)");
        String Rabu = absen19.next();

        System.out.println("--------------------------------------------");

        double diskon = 0;

        if (Rabu.equalsIgnoreCase("y")) {
            if (pilihanBuku==1) {
                diskon = 0.7;
                if (jumlahBuku>3){
                    diskon = 0.7 + 0.2;
                } else {
                    diskon = 0.7 + 0.1;
                }
                
            } else if (pilihanBuku==2) {
                diskon = 0.10;
                if (jumlahBuku>2) {
                    diskon = 0.10 + 0.2;
                } else {
                    diskon = 0.10;
                }
            } else if (pilihanBuku==3) {
                diskon = 0.1;
            } else {
                System.out.println("Tidak Dapat Diskon");
            }
            System.out.println("Jumlah Diskon = " + diskon);

        } else if (Rabu.equalsIgnoreCase("n"))  {
            System.out.println("Tidak Dapat Diskon");
        }
            
    }
}