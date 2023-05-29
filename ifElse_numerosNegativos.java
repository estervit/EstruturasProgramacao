import java.util.Scanner;

public class ifElse_numerosNegativos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número interio: ");
        int num = sc.nextInt();

        if (num < 0){
            System.out.println("Esse número é negativo!");
        }else {
            System.out.println("Esse número é positivo!");
        }
        sc.close();
    }

}


