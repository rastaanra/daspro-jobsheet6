import java.util.Scanner;
public class Latihan1Absen19 {

    public static void main(String[] args) {
        Scanner absen19 = new Scanner (System.in);

        System.out.println("Masukkan Bilangan 1 = ");
        int bil1 = absen19.nextInt();
        System.out.println("Masukkan Bilangan 2 = ");
        int bil2 = absen19.nextInt();
        System.err.println("Masukkan Bilangan 3 = ");
        int bil3 = absen19.nextInt();

        if (bil1>bil2) {
            System.out.println("Bilangan terbesar = " + bil1);   
        } else if (bil2>bil3) {
            System.out.println("Bilangan Terebsar = " +bil2);
        } else {
            System.out.println("Bilangan Terbesar = " +bil3);
        } 
    }
}