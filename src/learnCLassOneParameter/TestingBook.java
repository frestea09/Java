package learnCLassOneParameter;

import java.util.Scanner;

public class TestingBook {
    public static void main(String[] args){
        String insertName = "";
        Book objBuku = new Book();
        Scanner masukan = new Scanner(System.in);

        System.out.print("Nama Anda : ");
        insertName = masukan.nextLine();
        objBuku.sayHello(insertName);
    }
}
