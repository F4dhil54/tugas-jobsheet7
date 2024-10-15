import java.util.Scanner;

public class Tiket04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalTiket = 0;
        double totalTiketTerjual = 0;
        int hargaTiket = 50000;
        int jumlahTiket;
        System.out.println("Program Penjualan Tiket Bioskop");
        System.out.println("===============================");
            while (true) {
                System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk selesai): ");
                jumlahTiket = input.nextInt();
                
                if (jumlahTiket == 0) {
                    break;
                } 
                if (jumlahTiket < 0) {
                    System.out.println("Jumlah tiket tidak valid. Silakan coba lagi.");
                    continue;
                }
                double totalHarga = jumlahTiket * hargaTiket;   
                if (jumlahTiket > 10) {
                    System.out.println("Anda Mendapatkan Diskon 15%");
                    totalHarga *= 0.85; 
                } else if (jumlahTiket > 4) {
                    System.out.println("Anda Mendapatkan Diskon 10%");
                    totalHarga *= 0.90; 
                }
                totalTiket += jumlahTiket;
                totalTiketTerjual += totalHarga;
                System.out.println("Total Harga Tiket untuk " + jumlahTiket + " tiket: Rp " + totalHarga);
            }
        System.out.println("Laporan Penjualan Hari Ini");
        System.out.println("==========================");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan: Rp " + totalTiketTerjual);
    }
} 
// import java.util.Scanner;

// public class Tiket04 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int HARGA_TIKET = 50000, totalTiketTerjual = 0;
//         double totalPendapatan = 0;
//         boolean lanjutTransaksi = true;
        
//         System.out.println("Program Penjualan Tiket Bioskop");
//         System.out.println("==============================");
        
//         while (lanjutTransaksi) {
//             int jumlahTiket;
            
//             while (true) {
//                 System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk selesai): ");
//                 jumlahTiket = input.nextInt();
                
//                 if (jumlahTiket == 0) {
//                     lanjutTransaksi = false;
//                     break;
//                 } else if (jumlahTiket < 0) {
//                     System.out.println("Jumlah tiket tidak valid. Silakan coba lagi.");
//                     continue;
//                 }
                
//                 double hargaTotal = jumlahTiket * HARGA_TIKET;
//                 double diskon = 0;
                
//                 if (jumlahTiket > 10) {
//                     diskon = 0.15; 
//                 } else if (jumlahTiket > 4) {
//                     diskon = 0.10; 
//                 }
                
//                 double hargaSetelahDiskon = hargaTotal * (1 - diskon);
                
//                 System.out.println("Harga total: Rp " + hargaTotal);
//                 if (diskon > 0) {
//                     System.out.println("Diskon: " + (diskon * 100) + "%");
//                     System.out.println("Harga setelah diskon: Rp " + hargaSetelahDiskon);
//                 }
                
//                 totalTiketTerjual += jumlahTiket;
//                 totalPendapatan += hargaSetelahDiskon;
//                 break;
//             }
//         }
        
//         System.out.println("\nLaporan Penjualan Hari Ini");
//         System.out.println("==========================");
//         System.out.println("Total tiket terjual: " + totalTiketTerjual);
//         System.out.println("Total pendapatan: Rp " + totalPendapatan);
//     }
// }