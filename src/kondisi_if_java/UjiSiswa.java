package kondisi_if_java;

import java.util.Scanner;

public class UjiSiswa {
    public static void main(String[] args){
       String insertnameSiswa;
       int insertumurSiswa;
       int insertnilaiUTS;
       int insertnilaiUAS;
       String insertAlamat;
       Scanner masukan = new Scanner(System.in);
       System.out.print("Name : ");
       insertnameSiswa = masukan.nextLine();
       System.out.print("Umur : ");
       insertumurSiswa = masukan.nextInt();
       System.out.print("UTS : ");
       insertnilaiUTS = masukan.nextInt();
       System.out.print("UAS : ");
       insertnilaiUAS = masukan.nextInt();
       System.out.print("Alamat : ");
       insertAlamat = masukan.nextLine();
       Siswa objSiswa = new Siswa(insertnameSiswa,insertAlamat,insertumurSiswa,insertnilaiUTS,insertnilaiUAS);
       System.out.printf("Nilai Akhir anda : %s",objSiswa.getNilaiAkhir());
    }
}
