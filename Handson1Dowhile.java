package Handson1Dowhile;

public class Handson1Dowhile {
    public static void main(String[] args) {

        String[] KumpulanBuah = {"Apel", "Pisang", "Mangga", "Jeruk"};
        int counter = 0;
        do{
            System.out.println("Elemen Ke"+ (counter + 1) + "adalah : "+ KumpulanBuah[counter]);
            counter++;
        }while (counter < KumpulanBuah.length);
    }
}
