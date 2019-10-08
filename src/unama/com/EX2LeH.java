package unama.com;

import java.util.Scanner;

public class EX2LeH {
    public  static  void  main ( String [] args ) {
        Double numero;
        Scanner sc =  new Scanner ( System .in);
        System.out.println ( " INSIRA UM NUMERO: " );
        numero = sc . nextDouble ();

        if (numero % 2  ==  0) {
            System.out.println ( " O número " + numero + " é par " );
        } else {
            System.out.println ( " O número " + numero + " é impar " );
        }
    }
}
