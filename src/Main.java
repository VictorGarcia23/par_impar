import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("dame un número: ");
        int valor = s.nextInt();

        if (valor % 2 == 0) {
            System.out.println("tu número es par");


        }
        else {
            System.out.println("tu numero es impar");



        }

    }}