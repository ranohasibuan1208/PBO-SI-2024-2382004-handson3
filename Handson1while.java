package Handson1while;

public class Handson1while {
    public static void main(String[] args) {
        String[] KumpulanBuah = {"Apel", "Pisang", "Mangga", "Jeruk"};
        int counter = 0;
        while (counter < KumpulanBuah.length) {
            System.out.println("Elemen ke " + (counter + 1) + " adalah: " + KumpulanBuah[counter]);
            counter++;
        }
    }
}
