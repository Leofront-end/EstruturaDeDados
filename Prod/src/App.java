import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int valor1,valor2,res;
        
        valor1 = scan.nextInt();
        valor2 = scan.nextInt();
        res = valor1 * valor2;

        System.out.println("PROD = "+res);
    }
}
