package main;

class Hp {
    String nama;
    String series;
    String color;
}


/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[]args) throws Exception {
        
        Hp Redmi = new Hp();
        Redmi.nama = "Redmi";
        Redmi.series = "10s";
        Redmi.color = "Black";
        
        System.out.println(Redmi.nama);
        System.out.println(Redmi.series);
        System.out.println(Redmi.color);
        
    }
}
