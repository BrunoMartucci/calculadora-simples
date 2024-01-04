import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA SIMPLES EM JAVA");
        System.out.println("---------------------------");

        while (true) {
            System.out.println("Digite o primeiro número");
            double num1 = scanner.nextDouble();
            System.out.println("Digite o operador +, -, *, /");
            char operador = scanner.next().charAt(0);
            System.out.println("Digite o segundo numero");
            double num2 = scanner.nextDouble();

            double resultado = 0;

            switch (operador) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Erro: Divisão por zero");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Operador invalido. Tente novamente");
                    continue;
            }
            System.out.println("Resultado: " + resultado);

            System.out.println("Deseja realizar outra ação ? (S/N) ");
            char resposta = scanner.next().charAt(0);

            if (resposta != 'S' && resposta !='s'){
                System.out.println("Encerrando a calculadora");
                break;
            }
        }
        scanner.close();
    }
}