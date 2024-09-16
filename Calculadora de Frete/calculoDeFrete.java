import java.util.Locale;
import java.util.Scanner;

public class calculoDeFrete {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner inputFrete = new Scanner(System.in);

        System.out.print("Digite a distância em KM: ");
        double distancia = inputFrete.nextDouble();
        double km = 1.50;
        double total = distancia * km;

        System.out.printf("Cobrar R$: %.2f como taxa de entrega", total);
    }
}