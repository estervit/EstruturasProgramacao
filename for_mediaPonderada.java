import java.util.Locale;
import java.util.Scanner;

public class for_mediaPonderada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de N: ");
        int numN = sc.nextInt();

        double media1, media2, media3, mediaPonderada;

        for (int i = 0;i < numN;i++){
           media1 = sc.nextDouble();
           media2 = sc.nextDouble();
           media3 = sc.nextDouble();

           mediaPonderada = (media1 * 2.0 + media2 * 3.0 + media3 * 5.0 )/ 10.0;
            System.out.printf("Média ponderada: %.1f%n" , mediaPonderada);
        }
        sc.close();
    }
}
