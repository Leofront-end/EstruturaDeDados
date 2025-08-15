import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num, horas;
        float valor, salario;

        num = scan.nextInt();
        horas = scan.nextInt();
        valor = scan.nextFloat();

        salario = horas * valor;

        System.out.println("NUMBER = "+num);
        System.out.printf("SALARY = U$ %.2f\n",salario);

    }
}
