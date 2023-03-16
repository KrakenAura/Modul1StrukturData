package Kegiatan1;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukan Tinggi Segitiga :");
        double tinggi = scan.nextDouble();
        System.out.println("Masukan Alas Segitiga : ");
        double alas = scan.nextDouble();

        Segitiga<Double> luasDouble = new Segitiga<>(alas, tinggi);
        Segitiga<Integer> luasInt = new Segitiga<>((int) alas, (int) tinggi);

        System.out.println("=== HITUNG LUAS SEGITIGA ===");
        System.out.println("Mau menampilkan hasil luas dalam bentuk? :");
        System.out.println("1. Hasil to Integer");
        System.out.println("2. Hasil to Double");
        System.out.println("Masukkan pilihan 1 / 2");

        int pilih = scan.nextInt();
        switch (pilih) {
            case 1 -> luasInt.getResultAsInt();
            case 2 -> luasDouble.getResultAsDouble();
            default -> System.out.println("Mohon pilih sesuai pilihan");
        }
    }
}
