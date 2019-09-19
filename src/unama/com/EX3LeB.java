package unama.com;

import java.util.Scanner;

public class EX3LeB {
    public static void main(String[] args) {
        Scanner W = new Scanner(System.in);
        System.out.println("Informe o numero de Pacientes: ");
        int NumP = W.nextInt();
        int idade;
        int idadeOld = 0;
        for (int i=1; i<=NumP; i++){
            System.out.println("Informe a Idade: " + i);
            idade = W.nextInt();
            if (idade > idadeOld){
                idadeOld = idade;
            }
        }
        System.out.println("Idade do mais Idoso é: " + idadeOld + " Anos");
    }
}
