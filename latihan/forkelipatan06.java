package latihan;
import java.util.Scanner;

public class forkelipatan06 {
    //buat program main
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in); //buat library scanner 
        int jumlah = 0, kelipatan, counter = 0; //inisialisasi variabel
        

        System.out.println("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt(); // menambah code untuk menerima dari input dari keyboard
            //Buat struktur perulangan FOR dengan kondisi pemilihan IF 

        for (int i = 1; i <= 50; i++){
            if (i % kelipatan == 0){
                jumlah += i;
                counter++;
            }
        }
        //Buat struktur perulangan FOR dengan kondisi pemilihan IF 

        System.out.printf("banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
    }

}