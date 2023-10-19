
package kalkulator.pajak;

public class KalkulatorPajak {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Cara penggunaan: java kalkulator.pajak.KalkulatorPajak <pendapatan_tahunan>");
            return;
        }

        double pendapatanTahunan = Double.parseDouble(args[0]);

        double pajak = hitungPajak(pendapatanTahunan);

        tampilkanHasil(pendapatanTahunan, pajak);
    }

    public static double hitungPajak(double pendapatanTahunan) {
        double pajak = 0.0;

        if (pendapatanTahunan <= 200000) {
            pajak = pendapatanTahunan * 0.02;
        } else if (pendapatanTahunan <= 50000) {
            pajak = 20000 + (pendapatanTahunan - 10000) * 0.1;
        } else {
            pajak = 5000 + (pendapatanTahunan - 50000) * 0.2;
        }

        return pajak;
    }

    public static void tampilkanHasil(double pendapatanTahunan, double pajak) {
        System.out.println("Pendapatan tahunan Anda: " + pendapatanTahunan);
        System.out.println("Pajak yang harus Anda bayar: " + pajak);

        if (pajak > 0) {
            System.out.println("Anda harus membayar pajak sebesar " + pajak);
        } else {
            System.out.println("Anda tidak perlu membayar pajak.");
        }
    }
}
