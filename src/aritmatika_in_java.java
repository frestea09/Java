import java.util.Scanner;

public class aritmatika_in_java {
    public static void main(String[] args){
        int inputBilanganPertama;
        int inputBilanganKedua;
        int hasilJumlah;
        int hasilKurang;
        int hasilKali;
        int hasilBagi;
        int hasilModulus;
        Scanner masukan = new Scanner(System.in);

        System.out.print("Bilangan Pertama : ");
        inputBilanganPertama = masukan.nextInt();
        System.out.print("Bilangan Kedua : ");
        inputBilanganKedua = masukan.nextInt();

//        menghitung jumlah
        hasilJumlah = inputBilanganKedua + inputBilanganKedua;
//        menghitung kurang
        hasilKurang = inputBilanganPertama - inputBilanganKedua;
//        menghitung kali
        hasilKali = inputBilanganPertama * inputBilanganKedua;
//        menghitung bagi
        hasilBagi = inputBilanganPertama / inputBilanganKedua;
//        menghitung modulus
        hasilModulus = inputBilanganPertama % inputBilanganKedua;

//        menampilkan output
        System.out.printf("%d + %d = %d \n",inputBilanganPertama,inputBilanganKedua,hasilJumlah);
        System.out.printf("%d - %d = %d \n",inputBilanganPertama,inputBilanganKedua,hasilKurang);
        System.out.printf("%d * %d = %d \n",inputBilanganPertama,inputBilanganKedua,hasilKali);
        System.out.printf("%d / %d = %d \n",inputBilanganPertama,inputBilanganKedua,hasilBagi);
        System.out.printf("%d mod %d = %d \n",inputBilanganPertama,inputBilanganKedua,hasilModulus);
    }
}
