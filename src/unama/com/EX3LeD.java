package unama.com;

import java.util.Scanner;

public class EX3LeD {
    public static void main(String[] args) {
        Scanner J = new Scanner(System.in);
        char voto;
        int a,b,c,nulo, eleitores;
        a = 0; b = 0; c = 0; nulo = 0;
        System.out.println("Informe a Quantidade de Eleitores: ");
        eleitores = J.nextInt();

        for(int n = 1; n<=eleitores; n++) {
          System.out.println(n+"° Voto: ");
          voto = J.next().charAt(0);

          if (voto == 'a') {
              a++;
          }
          if (voto == 'b') {
              b++;
          }
          if (voto == 'c') {
              c++;
          }
          if (voto == 'n') {
              nulo++;
          }
        }
        System.out.println("RESULTADO");
        System.out.println("VOTOS NO CANDIDATO A: "+a +" Votos");
        System.out.println("VOTOS NO CANDIDATO B: "+b +" Votos");
        System.out.println("VOTOS NO CANDIDATO C: "+c +" Votos");
        System.out.println("VOTORAM EM NULO: "+nulo +" Votos");
    }
}
