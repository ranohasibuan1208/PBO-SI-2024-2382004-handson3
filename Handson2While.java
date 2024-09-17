package Handson2While;

public class Handson2While {
    public static void main(String[] args) {
        int i = 1;  // Langkah 1: Deklarasi variabel i
        System.out.println("Bilangan genap dari 1 sampai 20 : ");
        while (i <= 20) {  // Langkah 2: Selama i <= 20, loop akan berjalan
            if (i % 2 == 0) {  // Langkah 3: Cek apakah i genap
                System.out.print(i + " ");  // Langkah 4: Cetak angka genap
            }
            i++;  // Langkah 5: Increment i
        }
        System.out.println();  // Tambah baris baru setelah loop selesai
    }
}