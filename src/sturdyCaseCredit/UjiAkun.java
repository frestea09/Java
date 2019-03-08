package sturdyCaseCredit;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class UjiAkun {
    public static void main(String[] args){
        //inisialisasi
        double insertSaldo;
        String insertName;
        double tambahSaldo;
        Scanner masukan = new Scanner(System.in);
        //input command windows
        System.out.print("Name : ");
        insertName = masukan.nextLine();
        System.out.print("\n");
        System.out.print("Saldo : ");
        insertSaldo = masukan.nextDouble();
        System.out.print("\n");
        Akun objAkun = new Akun(insertSaldo);
        System.out.printf("Name : %s \n",insertName);
        System.out.printf("Saldo : %f \n",objAkun.getSaldo());
        System.out.print("===============================\n");
        System.out.print("Nilai Saldo Tambah : ");
        tambahSaldo = masukan.nextDouble();
        objAkun.tambahSaldo(tambahSaldo);
        System.out.print("\n");
        System.out.print("==========================\n");
        System.out.print("=======Sekarang===========\n");
        System.out.print("==========================\n");
        System.out.printf("Name : %s \n",insertName);
        System.out.printf("Saldo : %f \n",objAkun.getSaldo());

    }
}
