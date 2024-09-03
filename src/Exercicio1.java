public class Exercicio1 {
    public static void resposta(){
        int INDICE = 13, SOMA = 0, K = 0;
        while (K < INDICE) {
           K = K + 1;
           SOMA = SOMA + K;
       }
       System.out.println(SOMA);

    }
    public static void main(String[] args) {
        resposta();
        //  R: 91
    }
}
