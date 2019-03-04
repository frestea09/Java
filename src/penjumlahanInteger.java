import java.util.Scanner;

public class penjumlahanInteger {
    public static void main(String[] args){
        int bilanganPertama;
        int bilanganKedua;
        int hasil;
        Scanner masukan = new Scanner(System.in);
        System.out.print("Bilangan Pertama :");
        bilanganPertama = masukan.nextInt();
        System.out.print("Bilangan Kedua : ");
        bilanganKedua = masukan.nextInt();
        hasil = bilanganPertama + bilanganKedua;
        System.out.printf("Bilangan Pertama : %d \n",bilanganPertama);
        System.out.printf("Bilangan Kedua : %d \n",bilanganKedua);
        System.out.printf("Hasil : %d + %d = %d \n",bilanganPertama,bilanganKedua,hasil);
    }
}
