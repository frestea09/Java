package kontruktorJava;

public class Buku {
    private String namaBuku;
    public Buku(String insertNamaBuku){
        this.namaBuku = insertNamaBuku;
    }
    public void setNamaBuku(String insertNamaBuku){
        this.namaBuku = insertNamaBuku;
    }
    public String getNamaBuku(){
        return namaBuku;
    }
    public void printNamaBuku(){
        System.out.printf("Judul Buku : %s \n",getNamaBuku());
    }
}
