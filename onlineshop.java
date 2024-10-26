import java.util.Scanner;
public class onlineshop {

    public static void main (String[] args) {

        Scanner input = new Scanner (System.in);
        int tanggal, Jumlahitem, Jumlahbarang;
        double totalbelanja = 0, Hargaitem, Diskon , Totaldiskon;
         
        //input pengguna
        System.out.print("berapa jumkah item yang anda beli = ");
        Jumlahbarang = input.nextInt();

        for (int i=1; i<=Jumlahbarang; i++) {
            System.out.print("Harga barang ke " + i + "?");
            Hargaitem = input.nextDouble();
            System.out.print("Jumlah barang ke " + i + "?");
            Jumlahitem = input.nextInt();
            totalbelanja += Jumlahitem * Hargaitem;
        }

        System.out.print("masukkan tanggal pembelian : ");
        tanggal = input.nextInt();
        
        if (tanggal <= 10) {
            Diskon = 0.3;
        }  else if (tanggal <= 20) {
            Diskon = 0.2;
        }  else {
            Diskon = 0.1;
        }

        if (totalbelanja >= 1000000) {
            Diskon += 0.05;
        }    
            Totaldiskon = totalbelanja * Diskon;
        //output sistem
            System.out.printf("Total Belanja : %12.2f \n", totalbelanja);
            System.out.printf("Diskon : %12.2f \n", Totaldiskon);
            System.out.printf("Total Bayar : %12.2f \n", totalbelanja - Totaldiskon);
        }
    } 
    

