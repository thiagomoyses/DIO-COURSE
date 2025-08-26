import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scan = new Scanner(System.in).useLocale(Locale.US);

            System.err.println("Digite seu nome: ");
            String nome = scan.next();
            
            System.err.println("Digite sua idade: ");
            String idade = scan.next();

            System.err.println("Digite sua altura: ");
            double altura = scan.nextDouble();

            System.err.println("Voce se chama: " + nome + " e tem " + idade);
            System.err.println("Sua altura é: " + altura);

            scan.close();

        } catch (Exception e) {
            System.err.println("Deu bom nao batma: " + e);
        }
    }
}
