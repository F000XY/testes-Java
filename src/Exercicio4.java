public class Exercicio4 {

    double sp = 67836.43;
    double rj = 36678.66;
    double mg = 29229.88;
    double es = 27165.48;
    double outros = 19849.53;

    public double calculoDoTotal() {
        return sp + rj + mg + es + outros;
    }

    public static void calculoDoPercentual(double totalFaturamento, double sp, double rj, double mg, double es, double outros) {
        System.out.printf("Percentual de representação de SP: %.2f%%\n", (sp / totalFaturamento) * 100);
        System.out.printf("Percentual de representação de RJ: %.2f%%\n", (rj / totalFaturamento) * 100);
        System.out.printf("Percentual de representação de MG: %.2f%%\n", (mg / totalFaturamento) * 100);
        System.out.printf("Percentual de representação de ES: %.2f%%\n", (es / totalFaturamento) * 100);
        System.out.printf("Percentual de representação de Outros: %.2f%%\n", (outros / totalFaturamento) * 100);
    }

    public static void main(String[] args) {
        // Criar uma instância da classe para acessar métodos de instância
        Exercicio4 exercicio = new Exercicio4();

        // Calcular o total de faturamento
        double totalFaturamento = exercicio.calculoDoTotal();

        // Calcular e exibir os percentuais
        calculoDoPercentual(totalFaturamento, exercicio.sp, exercicio.rj, exercicio.mg, exercicio.es, exercicio.outros);
    }
}
