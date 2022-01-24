import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        int dogumYili, kalan = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz :");
        dogumYili = inp.nextInt();
        kalan = dogumYili%12;


        if (kalan == 0){
            System.out.println("Maymun");
        }
        if (kalan == 1){
            System.out.println("Horoz");
        }
        if (kalan == 2){
            System.out.println("Köpek");
        }
        if (kalan == 3){
            System.out.println("Domuz");
        }
        if (kalan == 4){
            System.out.println("Fare");
        }
        if (kalan == 5){
            System.out.println("Öküz");
        }
        if (kalan == 6){
            System.out.println("Kaplan");
        }
        if (kalan == 7){
            System.out.println("Tavşan");
        }
        if (kalan == 8){
            System.out.println("Ejderha");
        }
        if (kalan == 9){
            System.out.println("Yılan");
        }
        if (kalan == 10){
            System.out.println("At");
        }
        if (kalan == 11){
            System.out.println("Koyun");
        }
    }
}
