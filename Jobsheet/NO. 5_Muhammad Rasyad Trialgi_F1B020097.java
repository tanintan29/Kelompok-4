package PBO;

class Samsung {
    String nama;
    String series;
    int ram;
    int memory;
    int battery;
    
    Samsung(String inputNama, String inputSeries, int inputRam, int inputMemory, int inputBattery){
        nama = inputNama;
        series = inputSeries;
        ram = inputRam;
        memory = inputMemory;
        battery = inputBattery;
        
    }
}

class Xiaomi {
    String nama;
    String series;
    int ram;
    int memory;
    int battery;
    
    Xiaomi(String inputNama, String inputSeries, int inputRam, int inputMemory, int inputBattery){
        nama = inputNama;
        series = inputSeries;
        ram = inputRam;
        memory = inputMemory;
        battery = inputBattery;
    }
    
}

public class Handphone {
    public static void main(String[]args)throws Exception {
        
        Samsung samsung1 = new Samsung("Samsung Galaxy", "A21S", 8, 128, 5000);
        Samsung samsung2 = new Samsung("Samsung Galaxy", "Z Fold5", 12, 1000, 4400);
        
        System.out.println("== Samsung ==");
        System.out.println("Nama : " + samsung1.nama);
        System.out.println("Series : " + samsung1.series);
        System.out.println("RAM : " + samsung1.ram);
        System.out.println("Memory : " + samsung1.memory);
        System.out.println("Battery : " + samsung1.battery);
        
        System.out.println("== Samsung ==");
        System.out.println("Nama : " + samsung2.nama);
        System.out.println("Series : " + samsung2.series);
        System.out.println("RAM : " + samsung2.ram);
        System.out.println("Memory : " + samsung2.memory);
        System.out.println("Battery : " + samsung2.battery);
        
        Xiaomi xiaomi1 = new Xiaomi("Xiaomi", "13T", 12, 256, 5000);
        Xiaomi xiaomi2 = new Xiaomi("Redmi", "Note 12 Pro", 8, 512, 5000);
        
        System.out.println("== Xiaomi ==");
        System.out.println("Nama : " + xiaomi1.nama);
        System.out.println("Series : " + xiaomi1.series);
        System.out.println("RAM : " + xiaomi1.ram);
        System.out.println("Memory : " + xiaomi1.memory);
        System.out.println("Battery : " + xiaomi1.battery);
        
        System.out.println("== Xiaomi ==");
        System.out.println("Nama : " + xiaomi2.nama);
        System.out.println("Series : " + xiaomi2.series);
        System.out.println("RAM : " + xiaomi2.ram);
        System.out.println("Memory : " + xiaomi2.memory);
        System.out.println("Battery : " + xiaomi2.battery);
    }
}
