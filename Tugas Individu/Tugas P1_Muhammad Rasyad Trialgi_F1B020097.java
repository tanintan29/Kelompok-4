package PBO;

import java.util.Scanner;

class Kalimat {
    private String teks;

    Kalimat(String teks) {
        this.teks = teks;
    }

    int hitungPanjang() {
        return teks.length();
    }
}

public class PanjangKalimat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalimat[] kalimatArray = new Kalimat[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan kalimat " + (i + 1) + ": ");
            String teks = scanner.nextLine();
            Kalimat kalimat = new Kalimat(teks);
            kalimatArray[i] = kalimat;
        }

        for (int i = 0; i < 5; i++) {
            Kalimat kalimat = kalimatArray[i];
            int panjang = kalimat.hitungPanjang();
            System.out.println("Panjang kalimat " + (i + 1) + ": " + panjang + " karakter");
        }
    }
}
