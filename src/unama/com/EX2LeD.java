package unama.com;

import java.util.Scanner;

public class EX2LeD {
    public static  Double lado1, lado2, lado3;
    public  static  boolean isósceles =  false , equilatero =  false , escaleno =  false , notri =  false ;
    public  static  void  main ( String [] args ) {
        Scanner sc =  new  Scanner ( System .in);
        System.out.println ( " Insira o primeiro lado " );
        lado1 = sc . nextDouble ();
        System.out.println ( " Insira o segundo lado " );
        lado2 = sc . nextDouble ();
        System.out.println ( " Insira o terceiro lado " );
        lado3 = sc . nextDouble ();



        if (lado1 == lado2 && lado2 == lado3) {
            equilatero =  true ;
        } else  if (lado1 ! = lado2 && lado2 ! = lado3 && lado1 ! = lado3) {
            escaleno =  true ;
        } else  if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3 && lado1 ! = lado2 || lado2 ! = lado3 || lado1 ! = lado3) {
            isósceles =  true ;
        }

        if (lado1 + lado2 < lado3 || lado1 + lado3 < lado2 || lado2 + lado3 < lado1) {
            notri =  true ;
            isósceles =  false ;
            escaleno =  false ;
            equilatero =  false ;
        }

        if (equilatero ==  true ) {
            System.out.println ( " Este é um triângulo triangular " );
        } else if (isósceles ==  true ) {
            System.out.println ( " Este é um triângulo ISOSCELES " );
        } else if (escaleno) {
            System.out.println ( " Este é um triângulo ESCALENO " );
        } else (notri ==  true ) {
            System.out.println ( " Não se pode formar um triângulo! " );
        }

    }
}
