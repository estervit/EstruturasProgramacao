import java.util.Scanner;

public class ifElse_planCartesiano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe as coodernadas X: ");
        double coodernadasX = sc.nextDouble();

        System.out.println("Informe as coodernadas Y: ");
        double coodernadasY = sc.nextDouble();

        if (coodernadasX == 0 && coodernadasY == 0){
            System.out.println("Origem!");
        } else if (coodernadasX == 0) {
            System.out.println("Eixo X");
        } else if (coodernadasY == 0 ) {
            System.out.println("Eixo Y");
        } else if (coodernadasX > 0 && coodernadasY < 0) {
            System.out.println("Q4");
        } else if (coodernadasX < 0 && coodernadasY < 0) {
            System.out.println("Q3");
        } else if (coodernadasX < 0 && coodernadasY > 0) {
            System.out.println("Q2");
        } else {
            System.out.println("Q1");
        }
    sc.close();
    }
}
