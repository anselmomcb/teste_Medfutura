import java.util.Scanner;

    public class FizzBazz {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Digite um número N: ");
            int N = scanner.nextInt();


            for (int i = 1; i <= N; i++) {
                String resultado = "";

                if (i % 3 == 0) {
                    resultado += "fizz";
                }
                if (i % 5 == 0) {
                    resultado += "buzz";
                }
                if (i % 7 == 0) {
                    resultado += "bazz";
                }

                if (resultado.isEmpty()) {
                    System.out.println(i);
                } else {
                    System.out.println(resultado);
                }
            }
            scanner.close();
        }
    }

