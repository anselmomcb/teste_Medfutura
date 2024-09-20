import java.util.Scanner;

public class Bits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um número inteiro: ");
        int x = scanner.nextInt();


        int resultado = inverter(x);


        System.out.println("Resultado: " + resultado);


        scanner.close();
    }

    public static int inverter(int x) {
        long invertido = 0;


        while (x != 0) {
            int digito = x % 10;
            invertido = invertido * 10 + digito;
            x /= 10;
        }


        if (invertido < Integer.MIN_VALUE || invertido > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) invertido;
    }
}
