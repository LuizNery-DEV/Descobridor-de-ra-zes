import java.util.Scanner;

public class DescobridorRaizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Descobridor de raízes reais de polinômios de 2º grau");
        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        EquacaoSegundoGrau equacao = new EquacaoSegundoGrau(a, b, c);
        equacao.mostrarEquacao();

        if (a == 0) {
            System.out.println("Não é uma equação de segundo grau (a = 0).");
        } else if (!equacao.temRaizesReais()) {
            System.out.println("A equação não possui raízes reais (delta < 0).");
        } else {
            double[] raizes = equacao.calcularRaizes();
            System.out.println("Raiz 1: " + raizes[0]);
            System.out.println("Raiz 2: " + raizes[1]);
        }

        scanner.close();
    }
}
