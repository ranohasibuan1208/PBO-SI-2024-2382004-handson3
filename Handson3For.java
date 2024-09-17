package Handson3For;

public class Handson3For {
    public static void main(String[] args) {
        for (int i = 0; i <=20; i++){
            if (i == 15){
                break;
            }
            if ((i + 1) % 3 == 0 ) {
                continue;
            }
            System.out.println("Angka " + (i + 1));
        }
    }
}