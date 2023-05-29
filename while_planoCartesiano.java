import java.util.Scanner;

public class while_planoCartesiano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeira coodernada: ");
        int cooderada1 = sc.nextInt();

        System.out.println("Segunda coodernada: ");
        int cooderada2 = sc.nextInt();

        while (cooderada1 != 0 && cooderada2 != 0){
            if (cooderada1 > 0 && cooderada2 > 0){
                System.out.println("Primeiro");
            } else if (cooderada1 < 0 && cooderada2 > 0) {
                System.out.println("Segundo");
            } else if (cooderada1 < 0 && cooderada2 < 0) {
                System.out.println("Terceiro");
            }else {
                System.out.println("Quarto");
            }
            System.out.println("Informe novamente outras coodernadas: ");
            cooderada1 = sc.nextInt();
            cooderada2 = sc.nextInt();
        }
        System.out.println("Umas de suas coodernadas é Nula!");
        sc.close();
    }
}
