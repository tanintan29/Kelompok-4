import java.util.Scanner;

public class Ponsel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahPonsel = 5;
        DataPonsel[] dataPonsel = new DataPonsel[jumlahPonsel];

        System.out.println("Masukkan informasi untuk 5 ponsel:");

        for (int i = 0; i < jumlahPonsel; i++) {
            System.out.println("Ponsel #" + (i + 1));
            System.out.print("Merek: ");
            String merek = scanner.next();
            System.out.print("Model: ");
            String model = scanner.next();
            System.out.print("Harga: ");
            double harga = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.print("Spesifikasi: ");
            String spesifikasi = scanner.nextLine();

            dataPonsel[i] = new DataPonsel(merek, model, harga, spesifikasi);
        }

        System.out.println("Informasi Ponsel:");

        for (int i = 0; i < jumlahPonsel; i++) {
            System.out.println("Ponsel #" + (i + 1));
            System.out.println(dataPonsel[i]);
        }
    }
}

class DataPonsel {
    private String merek;
    private String model;
    private double harga;
    private String spesifikasi;

    public DataPonsel(String merek, String model, double harga, String spesifikasi) {
        this.merek = merek;
        this.model = model;
        this.harga = harga;
        this.spesifikasi = spesifikasi;
    }

    public String toString() {
        return "Merek: " + merek + "\nModel: " + model + "\nHarga: " + harga + "\nSpesifikasi: " + spesifikasi + "\n";
    }
}
