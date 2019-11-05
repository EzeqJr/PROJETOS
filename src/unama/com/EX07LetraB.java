package unama.com;

import java.util.Scanner;

public class EX07LetraB {
    public static String calcSemana (int codigoSemana) {
        switch (codigoSemana) {
            case 1:
                return "Segunda-Feira";
            case 2:
                return "Terça-Feira";
            case 3:
                return "Quarta-Feira";
            case 4:
                return "Quinta-Feira";
            case 5:
                return "Sexta-Feira";
            case 6:
                return "Sabado";
            case 7:
                return "Domingo";
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o código da Semana: ");
        int codigoSemana = sc.nextInt();
        String semana = calcSemana(codigoSemana);
        System.out.println("o Dia da Semana é: " + semana);
    }
}
