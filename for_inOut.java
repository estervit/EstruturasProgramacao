import java.util.Scanner;

public class for_inOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de N: ");
        int valorN = sc.nextInt();

        int in = 0,out = 0,x;

        for (int i =0;i <valorN;i++){
            x = sc.nextInt();
            if (x >= 10 && x <= 20){
                in++;
            }else {
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        sc.close();
    }
}
