import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int valor01,valor02,res;

        valor01 = scan.nextInt();
        valor02 = scan.nextInt();
        res = valor01+valor02;

        System.out.println("SOMA = "+ res);
    }
}
