import java.util.Scanner;

public class while_Combustivel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int alcool = 0,gasolina = 0,disel = 0;

        System.out.println("Qual o tipo de combustível: ");
        int tipoCombustivel = input.nextInt();

        while (tipoCombustivel != 4){
            if (tipoCombustivel == 1){
             alcool++;
            } else if (tipoCombustivel == 2) {
                gasolina++;
            }else if (tipoCombustivel == 3){
                disel++;
            }
       tipoCombustivel = input.nextInt();
        }
        System.out.println("Muito Obrigado!");
        System.out.println("Ácool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Disel: " + disel);
        input.close();
    }
}
