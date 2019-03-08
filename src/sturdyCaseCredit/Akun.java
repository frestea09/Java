package sturdyCaseCredit;

public class Akun {
    private double saldo;
    public Akun(double insertSaldo){
        if(insertSaldo>0.0){
            this.saldo = insertSaldo;
        }
    }
    public double getSaldo(){
        return saldo;
    }
    public  void setSaldo(double insertSaldo){
        this.saldo = insertSaldo;
    }
    public void tambahSaldo(double jumlah){
        saldo = saldo + jumlah;
    }
}
