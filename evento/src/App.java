import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int X,M,res;
        while (true) {
            X = scan.nextInt();
            M = scan.nextInt();
            if (X == 0 && M == 0){
                break;
            };
            res = X * M;
            System.out.println(res);
        }
    }
}
