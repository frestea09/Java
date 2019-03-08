package setGetClass;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Buku {
    private String judulBuku;
    public void setJudulBuku(String insertJudulBuku){
        this.judulBuku = insertJudulBuku;
    }
    public String getJudulBuku(){
        return judulBuku;
    }

    public void printJudulBuku(){
        System.out.printf("Judul Buku : %s",getJudulBuku());
    }
}
