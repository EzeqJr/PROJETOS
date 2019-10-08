package unama.com;

import java.util.Scanner;

public class EX2LeI {
    public  static  int sexo;
    public static double altura;
    public static double pesoIdeal;
    public  static  void  main ( String [] args ) {
        Scanner sc =  new Scanner ( System .in);
        System.out.println ( " Para informar seu sexo insira <1> para Masculino ou <2> para Feminino: " );
        sexo = sc . nextInt ();
        System.out.println ( " Insira sua altura: " );
        altura = sc . nextDouble ();

        if (sexo ==  1 ) {
            pesoIdeal = ( 72.7 * altura) - 58;
            System.out.println ( " seu peso ideal é: " + pesoIdeal * - 1 );
        }
        if (sexo ==  2 ) {
            pesoIdeal = ( 62.1 * altura) - 44.7 ;
            System.out.println ( " Seu peso ideal é: " + pesoIdeal * - 1 );

        }
    }
}
