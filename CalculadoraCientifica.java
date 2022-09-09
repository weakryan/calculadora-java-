import java.util.Scanner;
public class CalculadoraCientifica extends CalculadoraBasica {

    public static void main(String[] args) { 
        Scanner batata = new Scanner (System.in);

        System.out.println("~~~~ Digite 1 para executar a operação da raiz quadrada ~~~~ "); 
        System.out.println("~~~~ Digite 2 para executar a operação de potenciação ~~~~" );
        System.out.println("~~~~ Digite 3 para executar a operação de mod ~~~~ ");
        int opercao = batata.nextInt();

        switch (opercao) {
            case 1:
                System.out.println("Insira um valor para raiz quadrada: ");
                Double valraiz = batata.nextDouble();
                Double resultraiz = Math.sqrt(valraiz);
                System.out.println(resultraiz);
                break;


            case 2:
                System.out.println("Insira um valor: ");
                int val1pot = batata.nextInt();
                System.out.println("Insira outro valor para elevar: "); 
                int val2pot = batata.nextInt();
                int resultadopot = val1pot ^ val2pot;
                System.out.println("O resultado da subtração é: " + resultadopot);
                break;


            case 3:
                System.out.println("Insira um valor para calcular o módulo: ");
                int val1mod = batata.nextInt();
                System.out.println("Insira outro valor: "); 
                int val2mod = batata.nextInt();
                int resultmod = val1mod % val2mod;
                System.out.println("O resultado da multiplicaçaõ é: " + resultmod);
                break;

        }
}
}