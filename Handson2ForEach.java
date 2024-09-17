package Handson2ForEach;

public class Handson2ForEach {
    public static void main(String[] args) {
        int[] numbers = new int[20];  // Langkah 1: Buat array dengan ukuran 20
        for (int i = 0; i < 20; i++) {  // Langkah 2: Isi array dengan angka 1-20
            numbers[i] = i + 1;
        }

        System.out.println("Bilangan genap dari 1 sampai 20 : ");
        for (int num : numbers) {  // Langkah 3: Iterasi setiap elemen array
            if (num % 2 == 0) {  // Langkah 4: Cek apakah num genap
                System.out.print(num + " ");  // Langkah 5: Cetak angka genap
            }
        }
        System.out.println();  // Tambah baris baru setelah loop selesai
    }
}
