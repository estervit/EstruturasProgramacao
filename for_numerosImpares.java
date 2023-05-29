import java.util.Scanner;

public class for_numerosImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número: ");
        int num = sc.nextInt();

        for (int i = 1;i < num;i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }

    }
}
