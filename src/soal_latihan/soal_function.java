package soal_latihan;

import static java.awt.SystemColor.menu;

public class soal_function {
    public static void main (String[] args) {

        soal_function belajar = new soal_function();

        belajar.tampilkanHeader();

        belajar.tampilkanPesanan();

        belajar.hitungTotalBayar();
    }
    public void tampilkanHeader(){
        System.out.print(" soal nomor 1.1 ");
        System.out.print("==========================================");
        System.out.println("             KOPI KITA                  ");
        System.out.print("          Buka jam 08:00 - 22.00          ");
        System.out.print("==========================================");
    }

    String menu ="Kopi Susu";
    int jumlah = 2;
    public void tampilkanPesanan(){
        System.out.println("soal nomor 1.2");
        System.out.println("Menu : " + menu);
        System.out.print("Jumlah : " + jumlah +  " gelas");
     }

    int hargaSatuan = 18000;
    int jumlah =2;
    int totalBayar = belajar.hitungTotalBayar(18000, 2);

    public void hitungTotalBayar(){
        System.out.println("soal nomor 1.3");
        System.out.println("Total Bayar : ")
    }



}
