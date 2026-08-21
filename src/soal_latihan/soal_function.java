package soal_latihan;

import static java.awt.SystemColor.menu;

public class soal_function {
    public static void main (String[] args) {

        soal_function belajar = new soal_function();

        belajar.tampilkanHeader();

        belajar.tampilkanPesanan();

      int hitungTotalBayar= belajar.hitungTotalBayar(18000, 2);

        System.out.println("Total bayar : " + hitungTotalBayar);
;}
    public void tampilkanHeader(){
        System.out.println(" soal nomor 1.1 ");
        System.out.println("==========================================");
        System.out.println("             KOPI KITA                  ");
        System.out.println("          Buka jam 08:00 - 22.00          ");
        System.out.println("==========================================");
    }

    String menu ="Kopi Susu";
    int jumlah = 2;
    public void tampilkanPesanan(){
        System.out.println("soal nomor 1.2");
        System.out.println("Menu : " + menu);
        System.out.println("Jumlah : " + jumlah +  " gelas");
     }

    int hargaSatuan = 18000;

    public int hitungTotalBayar(int hargaSatuan, int jumlah){
        System.out.println("soal nomor 1.3");
        return hargaSatuan * jumlah;
    }



}
