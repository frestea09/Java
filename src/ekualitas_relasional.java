import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class ekualitas_relasional {
    public static void main(String[] args){
        Scanner masukan = new Scanner(System.in);
        int inputBilanganPertama = 0;
        int inputBilanganKedua = 0;
        String status = "";

        System.out.print("Bilangan Pertama : ");
        inputBilanganPertama = masukan.nextInt();
        System.out.print("Bilangan Kedua : ");
        inputBilanganKedua = masukan.nextInt();
        if(inputBilanganPertama>inputBilanganKedua){
            status = "Bilangan Pertama Bilangan terbesar";
        }
        if(inputBilanganPertama<inputBilanganKedua){
            status = "Bilangan Kedua Bilangan Tersebut";
        }
        if(inputBilanganPertama==inputBilanganKedua){
            status = "Bilangan Pertama dan Kedua bernilai sama";
        }
        System.out.printf("Bilangan Pertama : %d\n",inputBilanganPertama);
        System.out.printf("Bilangan Pertama : %d\n",inputBilanganKedua);
        System.out.printf("Status : %s\n",status);
    }
}
