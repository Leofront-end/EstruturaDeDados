import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        float res,horas, km;

        horas = scan.nextInt();
        km = scan.nextInt();
        res = (km/12)*horas;

        System.out.printf("%.3f",res);
    }
}
