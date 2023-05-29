import java.util.Scanner;

public class ifElse_parImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número: ");
        int numero = sc.nextInt();;

        if (numero % 2 == 0){
            System.out.println("Esse número: " + numero+ " é PAR!");
        }else {
            System.out.println("Esse número " + numero+ " é IMPAR");
        }
    }
}
