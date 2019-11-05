package unama.com;

public class EX05LetraC {
    public static int[] preencheVETOR(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * i;
        }
        return vetor;
    }

    public static void main(String[] args) {
        int[] vetor = new int[30];
        int[] resultado = preencheVETOR(vetor);
        for(int numero:resultado){
            System.out.println(numero);
        }
    }
}
