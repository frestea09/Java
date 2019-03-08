package kondisi_if_java;

public class Siswa {
    private String nameSiswa;
    private int umurSiswa;
    private int nilaiUTS;
    private int nilaiUAS;
    private String alamatSiswa;
    private String nilaiAkhir;

    public Siswa(String insertNameSiswa, String insertAlamatSiswa, int insertUmurSiswa, int insertNilaiUts,int insertUas){
        this.nameSiswa = insertNameSiswa;
        this.alamatSiswa = insertAlamatSiswa;
        this.umurSiswa = insertUmurSiswa;
        this.nilaiUTS = insertNilaiUts;
        this.nilaiUAS = insertUas;
    }
    public void setNameSiswa(String insertSiswa){
        this.nameSiswa = insertSiswa;
    }

    public void setUmurSiswa(int umurSiswa) {
        this.umurSiswa = umurSiswa;
    }

    public int getNilaiUTS() {
        return nilaiUTS;
    }

    public void setNilaiUTS(int nilaiUTS) {
        this.nilaiUTS = nilaiUTS;
    }

    public void setNilaiUAS(int nilaiUAS) {
        this.nilaiUAS = nilaiUAS;
    }

    public void setAlamatSiswa(String alamatSiswa) {
        this.alamatSiswa = alamatSiswa;
    }

    public String getNameSiswa(){
        return nameSiswa;
    }
    public String getAlamatSiswa(){
        return alamatSiswa;
    }
    public int getNilaiUAS() {
        return nilaiUAS;
    }

    public int getUmurSiswa() {
        return umurSiswa;
    }

    public void setNilaiAkhir(String nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }

    public String getNilaiAkhir(){
        int tempNilaiUts = this.nilaiUTS;
        int tempNilaiUas = this.nilaiUAS;
        int tempHitungIndeksAkhir = 0;
        tempHitungIndeksAkhir = ( tempNilaiUas + tempNilaiUts )/2;
        String tempIndekAkhir = "";
        if(tempHitungIndeksAkhir>80){
            tempIndekAkhir = "A";
        }
        if(tempHitungIndeksAkhir<=80 && tempHitungIndeksAkhir>=60){
            tempIndekAkhir = "B";
        }
        if(tempHitungIndeksAkhir>=50 && tempHitungIndeksAkhir<60){
            tempIndekAkhir = "C";
        }
        if(tempHitungIndeksAkhir<50){
            tempIndekAkhir = "E";
        }
        nilaiAkhir =  tempIndekAkhir;
        return nilaiAkhir;
    }
}
