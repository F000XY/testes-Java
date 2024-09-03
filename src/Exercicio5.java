public class Exercicio5 {

    public static String inverterString(String input) {
        char[] caracteres = input.toCharArray();
        int esquerda = 0;
        int direita = caracteres.length - 1;

        while (esquerda < direita) {
            char temp = caracteres[esquerda];
            caracteres[esquerda] = caracteres[direita];
            caracteres[direita] = temp;
            esquerda++;
            direita--;
        }
        return new String(caracteres);
    }

    public static void main(String[] args) {
        String str = "a vaca cava";

        String strInvertida = inverterString(str);

        System.out.println("String original: " + str);
        System.out.println("String invertida: " + strInvertida);
    }
}
