package unama.com;

import java.util.Scanner;

public class EX2LeF {
    public static  boolean aprovado =  false , reprovado =  false , recuperação =  false ;
    public  static  int faltas;
    public  static  Double nota1, nota2, notamedia;
    public  static  void  main ( String [] args ) {
        Scanner sc =  new Scanner ( System .in);
        System.out.println ( " Insira uma nota da primeira avaliação: " );
        nota1 = sc . nextDouble ();
        System.out.println ( " Insira uma nota da segunda avaliação: " );
        nota2 = sc . nextDouble ();
        notamedia = (nota1 + nota2) / 2 ;
        System.out.println ( " Insira o seu número de faltas: " );
        faltas = sc . nextInt ();

        if (notamedia >=  7  && faltas <=  15 ) {
            aprovado =  true ;
            recuperação =  false ;
            reprovado =  false ;
        } else if (notamedia <  7  && faltas <= 15 ) {
            aprovado =  false ;
            recuperação =  true ;
            reprovado =  false ;
        } else if (notamedia <  7  && faltas >  15 ) {
            aprovado =  false ;
            recuperação =  false ;
            reprovado =  true ;
        } else if (notamedia >=  7  && faltas > 15 ) {
            aprovado =  false ;
            recuperação =  false ;
            reprovado =  true ;
        }

        if (aprovado ==  true ) {
            System.out.println ( " Sua média é: " + notamedia);
            System.out.println ( " Sua quantidade de faltas é: " + faltas);
            System.out.println ( " Você foi APROVADO " );
        } else if (reprovado ==  true ) {
            System.out.println ( " Sua média é: " + notamedia);
            System.out.println ( " Sua quantidade de faltas é: " + faltas);
            System.out.println ( " Você foi REPROVADO " );
        } else if (recuperação ==  true ) {
            System.out.println ( " Sua média é: " + notamedia);
            System.out.println ( " Sua quantidade de faltas é: " + faltas);
            System.out.println ( " Você foi para RECUPERAÇÃO " );
        }
    }
}
