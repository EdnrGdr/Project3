import java.util.Scanner;

public class Main {


    public static  void main (String [] args ) {

        //Kullanıcıdan alınan iki sayının değerini değiştirme..

        Scanner scanner = new Scanner(System.in);  // Kullanıcıdan input alınacak scanner objesi olusturulmak zorunda.

        int number1;
        int number2;



        System.out.print("Number1: ");
        number1= scanner.nextInt();

        System.out.print("Number2: ");
        number2 = scanner.nextInt();

        System.out.println("Number1: " + number1 + " Number2: "+ number2);

        int number3 = number1;
        number1=number2;
        number2= number3;

        System.out.println("Number1: " + number1 + " Number2: "+ number2);


    }
}
