package kontruktorJava;

import java.util.Scanner;

public class JudulBuku {
    public static void main(String[] args){
        String judulBuku;
        int jumlahBuku;
        Scanner masukan = new Scanner(System.in);
        System.out.print("Judul Buku : ");
        judulBuku = masukan.nextLine();
        System.out.print("Jumlah Buku : ");
        jumlahBuku = masukan.nextInt();
        Buku objBuku = new Buku(judulBuku);
        objBuku.printNamaBuku();
        System.out.printf("Jumlah Buku = %d ",jumlahBuku);
    }
}
