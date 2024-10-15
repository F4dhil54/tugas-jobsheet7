
import java.util.Scanner;

public class Parkir04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenis, durasi, total = 0;
        
        while (true) {
            System.out.println("Masukkan jenis kendaraan(1: Mobil, 2: Motor, 0: Keluar) : ");
            
            jenis = input.nextInt();

            if (jenis == 0) {
                System.out.println("Total pembayaran : " + total);
                break;
            }
            
            if (jenis == 1 || jenis == 2) {
                System.out.println("Masukkan durasi parkir : ");
                durasi = input.nextInt();
                total = 0;
                if(durasi > 5){
                    total+= 12500;
                }else{
                    if (jenis==1) {
                        total+= durasi * 3000;
                    }else if (jenis == 2){
                        total += durasi * 2000;
                    }
                }
                System.out.println("Total biaya parkir: Rp " + total);
                total = 0;
            }else{
                System.out.println("jenis kendaraan tidak falid silahkan coba lagi");
            }
        }
    }
}