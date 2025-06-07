public class EquacaoSegundoGrau {
    private double a;
    private double b;
    private double c;


    public EquacaoSegundoGrau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double calcularDelta() {
        return b * b - 4 * a * c;
    }


    public boolean temRaizesReais() {
        return calcularDelta() >= 0;
    }

    public double[] calcularRaizes() {
        double delta = calcularDelta();

        if (delta < 0 || a == 0) {
            return null; 
        }

        double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

        return new double[]{raiz1, raiz2};
    }

    
    public void mostrarEquacao() {
        System.out.println("Equação: " + a + "x² + " + b + "x + " + c + " = 0");
    }
}
