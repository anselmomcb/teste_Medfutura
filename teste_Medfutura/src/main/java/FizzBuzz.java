import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um número N: ");
        int N = scanner.nextInt();


        for (int i = 1; i <= N; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }


            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("fizz");
            }


            if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("buzz");
            }


            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            }
        }


        scanner.close();
    }
}
