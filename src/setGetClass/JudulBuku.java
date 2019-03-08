package setGetClass;

import java.util.Scanner;

public class JudulBuku {
    public static void main(String[] args){
        String inputJudulBuku;
        Buku objBuku = new Buku();
        Scanner masukan = new Scanner(System.in);

        //input Judul Buku
        System.out.print("Judul Buku = ");
        inputJudulBuku = masukan.nextLine();
        objBuku.setJudulBuku(inputJudulBuku);
        objBuku.printJudulBuku();
    }
}
